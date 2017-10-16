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
package org.jboss.hal.client.configuration.subsystem.elytron;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import org.jboss.hal.ballroom.LabelBuilder;
import org.jboss.hal.ballroom.form.Form;
import org.jboss.hal.ballroom.form.Form.FinishRemove;
import org.jboss.hal.ballroom.form.Form.FinishReset;
import org.jboss.hal.core.ComplexAttributeOperations;
import org.jboss.hal.core.CrudOperations;
import org.jboss.hal.core.finder.Finder;
import org.jboss.hal.core.finder.FinderPath;
import org.jboss.hal.core.finder.FinderPathFactory;
import org.jboss.hal.core.mbui.MbuiPresenter;
import org.jboss.hal.core.mbui.MbuiView;
import org.jboss.hal.core.mbui.dialog.AddResourceDialog;
import org.jboss.hal.core.mbui.dialog.NameItem;
import org.jboss.hal.core.mbui.form.ModelNodeForm;
import org.jboss.hal.core.mvp.SupportsExpertMode;
import org.jboss.hal.dmr.ModelDescriptionConstants;
import org.jboss.hal.dmr.ModelNode;
import org.jboss.hal.dmr.NamedNode;
import org.jboss.hal.dmr.Operation;
import org.jboss.hal.dmr.ResourceAddress;
import org.jboss.hal.meta.Metadata;
import org.jboss.hal.meta.MetadataRegistry;
import org.jboss.hal.meta.StatementContext;
import org.jboss.hal.meta.token.NameTokens;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.resources.Names;
import org.jboss.hal.resources.Resources;
import org.jboss.hal.spi.Requires;

import static java.util.Arrays.asList;
import static org.jboss.hal.client.configuration.subsystem.elytron.AddressTemplates.*;
import static org.jboss.hal.dmr.ModelDescriptionConstants.*;
import static org.jboss.hal.dmr.ModelNodeHelper.asNamedNodes;

public class OtherSettingsPresenter extends MbuiPresenter<OtherSettingsPresenter.MyView, OtherSettingsPresenter.MyProxy>
        implements SupportsExpertMode {

    private final CrudOperations crud;
    private final ComplexAttributeOperations ca;
    private final FinderPathFactory finderPathFactory;
    private final StatementContext statementContext;
    private final MetadataRegistry metadataRegistry;
    private final Resources resources;

    @Inject
    public OtherSettingsPresenter(EventBus eventBus,
            OtherSettingsPresenter.MyView view,
            OtherSettingsPresenter.MyProxy proxy,
            Finder finder,
            CrudOperations crud,
            ComplexAttributeOperations ca,
            FinderPathFactory finderPathFactory,
            StatementContext statementContext,
            MetadataRegistry metadataRegistry,
            Resources resources) {
        super(eventBus, view, proxy, finder);
        this.crud = crud;
        this.ca = ca;
        this.finderPathFactory = finderPathFactory;
        this.statementContext = statementContext;
        this.metadataRegistry = metadataRegistry;
        this.resources = resources;
    }

    @Override
    protected void onBind() {
        super.onBind();
        getView().setPresenter(this);
    }

    @Override
    public ResourceAddress resourceAddress() {
        return ELYTRON_SUBSYSTEM_TEMPLATE.resolve(statementContext);
    }

    @Override
    public FinderPath finderPath() {
        return finderPathFactory.configurationSubsystemPath(Ids.ELYTRON)
                .append(Ids.ELYTRON, Ids.asId(Names.OTHER_SETTINGS),
                        resources.constants().settings(), Names.OTHER_SETTINGS);
    }

    @Override
    public void reload() {

        ResourceAddress address = ELYTRON_SUBSYSTEM_TEMPLATE.resolve(statementContext);
        crud.readChildren(address, asList(
                ElytronResource.KEY_STORE.resource,
                ElytronResource.KEY_MANAGER.resource,
                ElytronResource.SERVER_SSL_CONTEXT.resource,
                ElytronResource.CLIENT_SSL_CONTEXT.resource,
                ElytronResource.TRUST_MANAGER.resource,
                ElytronResource.CREDENTIAL_STORE.resource,
                ElytronResource.FILTERING_KEY_STORE.resource,
                ElytronResource.LDAP_KEY_STORE.resource,
                ElytronResource.PROVIDER_LOADER.resource,
                ElytronResource.AGGREGATE_PROVIDERS.resource,
                ElytronResource.SECURITY_DOMAIN.resource,
                ElytronResource.DIR_CONTEXT.resource,
                ElytronResource.AUTHENTICATION_CONTEXT.resource,
                ElytronResource.AUTHENTICATION_CONFIGURATION.resource,
                ElytronResource.FILE_AUDIT_LOG.resource,
                ElytronResource.SIZE_ROTATING_FILE_AUDIT_LOG.resource,
                ElytronResource.PERIODIC_ROTATING_FILE_AUDIT_LOG.resource,
                ElytronResource.SYSLOG_AUDIT_LOG.resource,
                ElytronResource.AGGREGATE_SECURITY_EVENT_LISTENER.resource,
                ElytronResource.POLICY.resource), // policy must be the last item in the list!
                result -> {
                    int i = 0;
                    getView().updateResourceElement(ElytronResource.KEY_STORE.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.KEY_MANAGER.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.SERVER_SSL_CONTEXT.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.CLIENT_SSL_CONTEXT.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.TRUST_MANAGER.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.CREDENTIAL_STORE.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.FILTERING_KEY_STORE.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateLdapKeyStore(asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.PROVIDER_LOADER.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.AGGREGATE_PROVIDERS.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.SECURITY_DOMAIN.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.DIR_CONTEXT.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.AUTHENTICATION_CONTEXT.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.AUTHENTICATION_CONFIGURATION.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.FILE_AUDIT_LOG.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.SIZE_ROTATING_FILE_AUDIT_LOG.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.PERIODIC_ROTATING_FILE_AUDIT_LOG.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.SYSLOG_AUDIT_LOG.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    getView().updateResourceElement(ElytronResource.AGGREGATE_SECURITY_EVENT_LISTENER.resource,
                            asNamedNodes(result.step(i++).get(RESULT).asPropertyList()));
                    // policy must be the last item in the list!
                    List<NamedNode> policies = asNamedNodes(result.step(i).get(RESULT).asPropertyList());
                    getView().updatePolicy(policies.isEmpty() ? null : policies.get(0));
                });
    }

    void reload(String resource, Consumer<List<NamedNode>> callback) {
        crud.readChildren(AddressTemplates.ELYTRON_SUBSYSTEM_TEMPLATE, resource,
                children -> callback.accept(asNamedNodes(children)));
    }

    // ------------------------------------------------------ LDAP key store

    void reloadLdapKeyStores() {
        crud.readChildren(AddressTemplates.ELYTRON_SUBSYSTEM_TEMPLATE, ModelDescriptionConstants.LDAP_KEY_STORE,
                children -> getView().updateLdapKeyStore(asNamedNodes(children)));
    }

    void saveLdapKeyStore(String name, Map<String, Object> changedValues) {
        crud.save(Names.LDAP_KEY_STORE, name, AddressTemplates.LDAP_KEY_STORE_TEMPLATE, changedValues,
                this::reloadLdapKeyStores);
    }

    void addNewItemTemplate(String ldapKeyStore) {
        Metadata metadata = metadataRegistry.lookup(AddressTemplates.LDAP_KEY_STORE_TEMPLATE)
                .forComplexAttribute(NEW_ITEM_TEMPLATE);
        String id = Ids.build(Ids.ELYTRON_LDAP_KEY_STORE, NEW_ITEM_TEMPLATE, Ids.ADD);
        Form<ModelNode> form = new ModelNodeForm.Builder<>(id, metadata)
                .include(NEW_ITEM_PATH, NEW_ITEM_RDN, NEW_ITEM_ATTRIBUTES)
                .customFormItem(NEW_ITEM_ATTRIBUTES,
                        (attributeDescription) -> new MultiValueListItem(NEW_ITEM_ATTRIBUTES))
                .unsorted()
                .addOnly()
                .build();
        String type = new LabelBuilder().label(NEW_ITEM_TEMPLATE);
        new AddResourceDialog(resources.messages().addResourceTitle(type), form, (name, model) ->
                ca.add(ldapKeyStore, NEW_ITEM_TEMPLATE, Names.NEW_ITEM_TEMPLATE,
                        AddressTemplates.LDAP_KEY_STORE_TEMPLATE, model, this::reloadLdapKeyStores)).show();
    }

    Operation pingNewItemTemplate(String ldapKeyStore) {
        ResourceAddress address = AddressTemplates.LDAP_KEY_STORE_TEMPLATE.resolve(statementContext, ldapKeyStore);
        return new Operation.Builder(address, READ_ATTRIBUTE_OPERATION)
                .param(NAME, NEW_ITEM_TEMPLATE)
                .build();
    }

    void saveNewItemTemplate(String ldapKeyStore, Map<String, Object> changedValues) {
        ca.save(ldapKeyStore, NEW_ITEM_TEMPLATE, Names.NEW_ITEM_TEMPLATE, AddressTemplates.LDAP_KEY_STORE_TEMPLATE,
                changedValues, this::reloadLdapKeyStores);
    }


    void removeNewItemTemplate(String ldapKeyStore, Form<ModelNode> form) {
        ca.remove(ldapKeyStore, NEW_ITEM_TEMPLATE, Names.NEW_ITEM_TEMPLATE, AddressTemplates.LDAP_KEY_STORE_TEMPLATE,
                new FinishRemove<ModelNode>(form) {
                    @Override
                    public void afterRemove(Form<ModelNode> form) {
                        reloadLdapKeyStores();
                    }
                });
    }

    // -------------------------------------------- Policy

    void addPolicy(String complexAttribute, String type) {
        Metadata metadata = metadataRegistry.lookup(POLICY_TEMPLATE).forComplexAttribute(complexAttribute);
        String id = Ids.build(Ids.ELYTRON_POLICY, complexAttribute, Ids.ADD);
        Form<ModelNode> form = new ModelNodeForm.Builder<>(id, metadata)
                .unboundFormItem(new NameItem(), 0)
                .addOnly()
                .build();
        new AddResourceDialog(type, form, (name, model) -> {
            ResourceAddress address = POLICY_TEMPLATE.resolve(statementContext, name);
            ModelNode payload = new ModelNode();
            payload.get(complexAttribute)
                    .set(model != null && model.isDefined() ? model : new ModelNode().setEmptyObject());
            crud.add(type, address, payload, resources.messages().addSingleResourceSuccess(type),
                    (n, a) -> reloadPolicy());
        }).show();
    }

    void savePolicy(String policyName, String complexAttribute, String type, Map<String, Object> changedValues) {
        ResourceAddress address = POLICY_TEMPLATE.resolve(statementContext, policyName);
        Metadata metadata = metadataRegistry.lookup(POLICY_TEMPLATE).forComplexAttribute(complexAttribute);
        ca.save(complexAttribute, type, address, changedValues, metadata, this::reloadPolicy);
    }

    void resetPolicy(String policyName, String complexAttribute, String type, Form<ModelNode> form) {
        ResourceAddress address = POLICY_TEMPLATE.resolve(statementContext, policyName);
        Metadata metadata = metadataRegistry.lookup(POLICY_TEMPLATE).forComplexAttribute(complexAttribute);
        ca.reset(complexAttribute, type, address, metadata, form, new FinishReset<ModelNode>(form) {
            @Override
            public void afterReset(Form<ModelNode> form) {
                reloadPolicy();
            }
        });
    }

    void removePolicy(String policyName, String type) {
        ResourceAddress address = POLICY_TEMPLATE.resolve(statementContext, policyName);
        crud.removeSingleton(type, address, this::reloadPolicy);
    }

    private void reloadPolicy() {
        crud.readChildren(AddressTemplates.ELYTRON_SUBSYSTEM_TEMPLATE, ModelDescriptionConstants.POLICY,
                children -> {
                    if (children.isEmpty()) {
                        getView().updatePolicy(null);
                    } else {
                        getView().updatePolicy(asNamedNodes(children).get(0));
                    }
                });
    }


    @ProxyCodeSplit
    @Requires(value = {AGGREGATE_PROVIDERS_ADDRESS,
            AGGREGATE_SECURITY_EVENT_LISTENER_ADDRESS,
            AUTHENTICATION_CONFIGURATION_ADDRESS,
            AUTHENTICATION_CONTEXT_ADDRESS,
            CLIENT_SSL_CONTEXT_ADDRESS,
            CREDENTIAL_STORE_ADDRESS,
            DIR_CONTEXT_ADDRESS,
            FILE_AUDIT_LOG_ADDRESS,
            FILTERING_KEY_STORE_ADDRESS,
            KEY_MANAGER_ADDRESS,
            KEY_STORE_ADDRESS,
            LDAP_KEY_STORE_ADDRESS,
            PERIODIC_FILE_AUDIT_LOG_ADDRESS,
            POLICY_ADDRESS,
            PROVIDER_LOADER_ADDRESS,
            SECURITY_DOMAIN_ADDRESS,
            SERVER_SSL_CONTEXT_ADDRESS,
            SIZE_ROTATING_FILE_AUDIT_LOG_ADDRESS,
            SYSLOG_AUDIT_LOG_ADDRESS,
            TRUST_MANAGER_ADDRESS})
    @NameToken(NameTokens.ELYTRON_OTHER)
    public interface MyProxy extends ProxyPlace<OtherSettingsPresenter> {}


    // @formatter:off
    public interface MyView extends MbuiView<OtherSettingsPresenter> {
        void updateResourceElement(String resource, List<NamedNode> nodes);
        void updateLdapKeyStore(List<NamedNode> model);
        void updatePolicy(NamedNode policy);
    }
    // @formatter:on
}
