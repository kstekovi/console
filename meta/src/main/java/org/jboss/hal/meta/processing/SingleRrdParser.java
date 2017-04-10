/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.meta.processing;

import java.util.List;

import org.jboss.hal.dmr.ModelNode;
import org.jboss.hal.dmr.ModelType;
import org.jboss.hal.dmr.Property;
import org.jboss.hal.dmr.model.ResourceAddress;
import org.jboss.hal.meta.description.ResourceDescription;
import org.jboss.hal.meta.security.SecurityContext;

import static org.jboss.hal.dmr.ModelDescriptionConstants.*;

/**
 * This class does the bulk of work when it comes to parse the r-r-d response and collect the results.
 *
 * @author Harald Pehl
 */
class SingleRrdParser {

    private final RrdResult rrdResult;

    SingleRrdParser(final RrdResult rrdResult) {
        this.rrdResult = rrdResult;
    }

    public void parse(ResourceAddress address, ModelNode modelNode) throws ParserException {
        if (modelNode.getType() == ModelType.LIST) {
            for (ModelNode nestedNode : modelNode.asList()) {
                ResourceAddress nestedAddress = new ResourceAddress(nestedNode.get(ADDRESS));
                ModelNode nestedResult = nestedNode.get(RESULT);
                parseSingle(nestedAddress, nestedResult);
            }
        } else {
            parseSingle(address, modelNode);
        }
    }

    private void parseSingle(ResourceAddress address, ModelNode modelNode) {
        // resource description
        if (!rrdResult.containsResourceDescription(address) && modelNode.hasDefined(DESCRIPTION)) {
            rrdResult.addResourceDescription(new ResourceDescription(anonymizeAddress(address), modelNode));
        }

        // security context
        ModelNode accessControl = modelNode.get(ACCESS_CONTROL);
        if (accessControl.isDefined()) {
            if (!rrdResult.containsSecurityContext(address) && accessControl.hasDefined(DEFAULT)) {
                rrdResult.addSecurityContext(new SecurityContext(address, accessControl.get(DEFAULT)));
            }

            // exceptions
            if (accessControl.hasDefined(EXCEPTIONS)) {
                List<Property> exceptions = accessControl.get(EXCEPTIONS).asPropertyList();
                for (Property property : exceptions) {
                    ModelNode exception = property.getValue();
                    ResourceAddress exceptionAddress = new ResourceAddress(exception.get(ADDRESS));
                    if (!rrdResult.containsSecurityContext(exceptionAddress)) {
                        rrdResult.addSecurityContext(new SecurityContext(exceptionAddress, exception));
                    }
                }
            }
        }

        // children
        if (modelNode.hasDefined(CHILDREN)) {
            List<Property> children = modelNode.get(CHILDREN).asPropertyList();
            for (Property child : children) {
                String addressKey = child.getName();
                if (child.getValue().hasDefined(MODEL_DESCRIPTION)) {
                    List<Property> modelDescriptions = child.getValue().get(MODEL_DESCRIPTION).asPropertyList();
                    for (Property modelDescription : modelDescriptions) {
                        String addressValue = modelDescription.getName();
                        ModelNode childNode = modelDescription.getValue();
                        ResourceAddress childAddress = new ResourceAddress(address).add(addressKey, addressValue);
                        parseSingle(childAddress, childNode);
                    }
                }
            }
        }
    }

    private ResourceAddress anonymizeAddress(ResourceAddress address) {
        ResourceAddress anonymized = new ResourceAddress();

        int index = 0;
        for (Property property : address.asPropertyList()) {
            String name = property.getName();
            String value = property.getValue().asString();
            switch (name) {
                case HOST:
                case SERVER_GROUP:
                case SERVER_CONFIG:
                    value = "*";
                    break;

                case SERVER:
                    // only anonymize /host=foo/server=bar or /host=foo/server-config=bar,
                    // but don't touch resources like /subsystem=mail/mail-session=*/server=*
                    if (index == 1) {
                        value = "*";
                    }
                    break;
            }
            anonymized.add(name, value);
            index++;
        }
        return anonymized;
    }
}
