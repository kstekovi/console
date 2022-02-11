/*
 *  Copyright 2022 Red Hat
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jboss.hal.processor.mbui.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Inject;

import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.builder.ElementsBuilder;
import org.jboss.gwt.elemento.core.Elements;
import org.jboss.hal.ballroom.form.Form;
import org.jboss.hal.ballroom.table.Scope;
import org.jboss.hal.ballroom.ExpressionUtil;
import org.jboss.hal.ballroom.LayoutBuilder;
import org.jboss.hal.ballroom.autocomplete.ReadChildrenAutoComplete;
import org.jboss.hal.core.mbui.dialog.AddResourceDialog;
import org.jboss.hal.core.mbui.form.GroupedForm;
import org.jboss.hal.core.mbui.form.ModelNodeForm;
import org.jboss.hal.core.mbui.table.ModelNodeTable;
import org.jboss.hal.core.mbui.MbuiContext;
import org.jboss.hal.dmr.Operation;
import org.jboss.hal.dmr.ResourceAddress;
import org.jboss.hal.meta.AddressTemplate;
import org.jboss.hal.meta.Metadata;
import org.jboss.hal.meta.security.Constraint;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.spi.Message;
import org.jboss.hal.spi.MessageEvent;

import static java.util.Arrays.asList;
import static org.jboss.gwt.elemento.core.Elements.*;
import static org.jboss.hal.ballroom.LayoutBuilder.column;
import static org.jboss.hal.ballroom.LayoutBuilder.row;
import static org.jboss.hal.dmr.ModelDescriptionConstants.ADD;
import static org.jboss.hal.dmr.ModelDescriptionConstants.READ_RESOURCE_OPERATION;

/*
 * WARNING! This class is generated. Do not modify.
 */
@Generated("org.jboss.hal.processor.mbui.MbuiViewProcessor")
public final class Mbui_UnboundFormItemView extends UnboundFormItemView {

    private final Metadata metadata0;
    private final Map<String, HTMLElement> expressionElements;

    @Inject
    @SuppressWarnings("unchecked")
    public Mbui_UnboundFormItemView(MbuiContext mbuiContext) {
        super(mbuiContext);

        AddressTemplate metadata0Template = AddressTemplate.of("/subsystem=foo");
        this.metadata0 = mbuiContext.metadataRegistry().lookup(metadata0Template);
        this.expressionElements = new HashMap<>();

        form = new ModelNodeForm.Builder<org.jboss.hal.dmr.ModelNode>("form", metadata0)
                .include("foo")
                .unboundFormItem(new org.jboss.hal.ballroom.form.PropertiesItem("bar"), 1)
                .unsorted()
                .onSave((form, changedValues) -> saveSingletonForm("Form",
                        metadata0Template.resolve(statementContext()), changedValues, metadata0))
                .prepareReset(form -> resetSingletonForm("Form", metadata0Template.resolve(statementContext()), form,
                        metadata0))
                .build();

        HTMLElement html0;
        HTMLElement root = row()
                .add(column()
                        .add(html0 = div()
                                .innerHtml(SafeHtmlUtils.fromSafeConstant("<h1>Form</h1>"))
                                .element())
                        .add(form)
                )
                .element();
        expressionElements.put("html0", html0);

        registerAttachable(form);

        initElement(root);
    }

    @Override
    public void attach() {
        super.attach();
    }
}
