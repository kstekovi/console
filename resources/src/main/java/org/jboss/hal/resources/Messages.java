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
package org.jboss.hal.resources;

import com.google.gwt.safehtml.shared.SafeHtml;

public interface Messages extends com.google.gwt.i18n.client.Messages {

    // @formatter:off
    // ------------------------------------------------------ safe HTML

    SafeHtml accessMechanismLabel(String name);

    SafeHtml addError(String type, String identity, String resource, String error);

    SafeHtml addHaPolicy();

    SafeHtml addKeyStoreError(String name);

    SafeHtml addResourceError(String name, String cause);

    SafeHtml addResourceSuccess(String type, String name);

    SafeHtml addressLabel(String address);

    SafeHtml addServerHostHelp();

    SafeHtml addSingleResourceError(String type, String error);

    SafeHtml addSingleResourceSuccess(String type);

    SafeHtml addSuccess(String type, String identity, String resource);

    SafeHtml allContentAlreadyDeployedToServerGroup(String serverGroup);

    SafeHtml allMailServersExist();

    SafeHtml allSingletonsExist();

    SafeHtml allThreadPoolsExist();

    SafeHtml alternativesHelp(String alternatives);

    SafeHtml assignmentExcludeSuccess(String type, String name);

    SafeHtml assignmentIncludeSuccess(String type, String name);

    SafeHtml callerThreadLabel(String name);

    SafeHtml cancelActiveOperation(String operation);

    SafeHtml cancelledLabel(boolean name);

    SafeHtml cancelledOperation(String name);

    SafeHtml cannotBrowseUnmanaged();

    SafeHtml cannotDownloadExploded();

    SafeHtml capabilityReference(String capability);

    SafeHtml certificateExpired(String alias);

    SafeHtml certificateShouldRenew(int days, String alias, String dueDate);

    SafeHtml changeAccountKeyError(String name, String error);

    SafeHtml changeAccountKeySuccess(String name);

    SafeHtml changeAliasError(String alias, String newAlias, String resource, String error);

    SafeHtml changeAliasSuccess(String alias, String newAlias, String resource);

    SafeHtml changePrioritySuccess(int priority);

    SafeHtml chooseContentToDeploy(String serverGroup);

    SafeHtml chooseReplication();

    SafeHtml chooseServerGroupsToDeploy(String name);

    SafeHtml chooseServerGroupsToUndeploy(String name);

    SafeHtml chooseSharedStore();

    SafeHtml chooseStrategy();

    SafeHtml cleanPatchHistoryFailure(String error);

    SafeHtml cleanPatchHistoryQuestion(String prependMessage);

    SafeHtml cleanPatchHistorySuccess();

    SafeHtml clearCacheError(String name, String error);

    SafeHtml clearCacheSuccess(String name);

    SafeHtml cloneProfileSuccess(String from, String to);

    SafeHtml closeConnectionsSuccess();

    SafeHtml closeToLogout();

    SafeHtml commitTransactionSuccess(String transactionId);

    SafeHtml configuredMailServer(String servers);

    SafeHtml contentAdded(@PluralCount int size);

    SafeHtml contentAlreadyDeployedToAllServerGroups(String name);

    SafeHtml contentDeployed1(String content);

    SafeHtml contentDeployed2(String serverGroup);

    SafeHtml contentOpFailed(@PluralCount int size);

    SafeHtml contentReplaced(@PluralCount int size);

    SafeHtml contentReplaceError(String name);

    SafeHtml contentReplaceSuccess(String name);

    SafeHtml contentUndeployed(String name);

    SafeHtml contentUndeployedFromServerGroup(String name, String serverGroup);

    SafeHtml createAccountError(String name, String error);

    SafeHtml createAccountSuccess(String name);

    SafeHtml credentialReferenceAddConfirmation(String alternative);

    SafeHtml credentialReferenceAddressError();

    SafeHtml customListItemHint(String propAttribute, String valueAttribute);

    SafeHtml dataSourceAddError();

    SafeHtml dataSourceDisabled(String name);

    SafeHtml dataSourceDisabledNoStatistics(String name);

    SafeHtml dataSourceEnabled(String name);

    SafeHtml dataSourceStatisticsDisabled(String name);

    SafeHtml dataSourceStatisticsFromDeployment();

    SafeHtml deactivateAccountError(String name, String error);

    SafeHtml deactivateAccountSuccess(String name);

    SafeHtml deployedTo(String name);

    SafeHtml deploymentActive(String name);

    SafeHtml deploymentAdded(@PluralCount int count);

    SafeHtml deploymentDisabled(String name);

    SafeHtml deploymentDisabledError(String name);

    SafeHtml deploymentDisabledSuccess(String name);

    SafeHtml deploymentEmptySuccess(String name);

    SafeHtml deploymentEnabled(String name);

    SafeHtml deploymentEnabledError(String name);

    SafeHtml deploymentEnabledSuccess(String name);

    SafeHtml deploymentError(String name);

    SafeHtml deploymentExploded(String name);

    SafeHtml deploymentFailed(String name);

    SafeHtml deploymentInProgress(String name);

    SafeHtml deploymentNotEnabled(String name);

    SafeHtml deploymentOpFailed(@PluralCount int count);

    SafeHtml deploymentPreview();

    SafeHtml deploymentReadError(String deployment);

    SafeHtml deploymentReplaced(@PluralCount int count);

    SafeHtml deploymentStopped(String name);

    SafeHtml deploymentSubAlreadyExploded();

    SafeHtml deploymentSuccessful(String name);

    SafeHtml deploymentUnknownState(String name);

    SafeHtml destroyServerError(String name);

    SafeHtml destroyServerGroupError(String name);

    SafeHtml destroyServerGroupQuestion(String name);

    SafeHtml destroyServerGroupSuccess(String name);

    SafeHtml destroyServerQuestion(String name);

    SafeHtml destroyServerSuccess(String name);

    SafeHtml disableSSLManagementError(String cause);

    SafeHtml disableSSLManagementQuestion(String serverName);

    SafeHtml disableSSLManagementSuccess();

    SafeHtml disableSSLUndertowError(String httpsListener, String cause);

    SafeHtml disableSSLUndertowQuestion(String httpsListener);

    SafeHtml disableSSLUndertowSuccess(String httpsListener);

    SafeHtml domainConfigurationChanged();

    SafeHtml domainControllerTimeout(String name);

    SafeHtml domainRolloutLabel(boolean name);

    SafeHtml dropSubscriptionsQuestion(String topic);

    SafeHtml dropSubscriptionsSuccess(String topic);

    SafeHtml duplicateAuthenticationModule();

    SafeHtml emptyModelNodeForm();

    SafeHtml enableManagementSSLDescription();

    SafeHtml enableSSLMutualQuestion();

    SafeHtml enableSSLResultsError();

    SafeHtml enableSSLResultsSuccessDomain(String url);

    SafeHtml enableSSLResultsSuccessStandalone(String url);

    SafeHtml enableSSLResultsSuccessUndertow(String listener, String sslContext);

    SafeHtml enableSSLStrategyQuestion();

    SafeHtml enableSSLStrategyQuestionCreateAll();

    SafeHtml enableSSLStrategyQuestionCreateKeyStore();

    SafeHtml enableSSLStrategyQuestionObtainFromLetsEncrypt();

    SafeHtml enableSSLStrategyQuestionReuseKeyStore();

    SafeHtml enableSSLSuccess();

    SafeHtml enableUndertowSSLDescription();

    SafeHtml endpointError(String interfce, String url);

    SafeHtml endpointOk(String url);

    SafeHtml exclusiveRunningTimeLabel(String name);

    SafeHtml executionStatusLabel(String status, String description);

    SafeHtml expireMessageQuestion();

    SafeHtml expireMessagesQuestion();

    SafeHtml expireMessageSuccess();

    SafeHtml explodedPreview();

    SafeHtml exportCertificateError(String alias, String path, String resource, String error);

    SafeHtml exportCertificateSuccess(String alias, String path, String resource);

    SafeHtml expressionError(String expression);

    SafeHtml expressionWarning(String expression);

    SafeHtml extensionError(int status);

    SafeHtml extensionNetworkError(String console, String extension);

    SafeHtml extensionNoJson();

    SafeHtml extensionNotFound();

    SafeHtml extensionOk();

    SafeHtml extensionProcessing();

    SafeHtml extensionScriptError();

    SafeHtml extensionUrl();

    SafeHtml failedReadKeycloak(String address, String errorMessage);

    SafeHtml failedRedirectConsole(String url, String message);

    SafeHtml forceFailoverQuestion(String server);

    SafeHtml forceFailoverSuccess(String server);

    SafeHtml flushConnectionSuccess();

    SafeHtml generateCSRError(String alias, String path, String resource, String error);

    SafeHtml generateCSRSuccess(String alias, String path, String resource);

    SafeHtml generateKeyPairError(String alias, String resource, String error);

    SafeHtml generateKeyPairSuccess(String alias, String resource);

    SafeHtml getMetadataError(String name, String error);

    SafeHtml getMetadataSuccess(String name);

    SafeHtml hostAdminMode(String name);

    SafeHtml hostControllerTimeout(String name);

    SafeHtml hostDisconnected(String name);

    SafeHtml hostNameChanged();

    SafeHtml hostNeedsReload(String name);

    SafeHtml hostNeedsRestart(String name);

    SafeHtml hostPending(String name);

    SafeHtml hostRunning(String name);

    SafeHtml hostStarting(String name);

    SafeHtml hostUndefined(String name);

    SafeHtml identityAttributeHelp();

    SafeHtml importCertificateError(String alias, String path, String resource, String error);

    SafeHtml importCertificateSuccess(String alias, String path, String resource);

    SafeHtml includeAllHelpText();

    SafeHtml initKeyManagerError(String name, String error);

    SafeHtml initKeyManagerSuccess(String name);

    SafeHtml initTrustManagerError(String name, String error);

    SafeHtml initTrustManagerSuccess(String name);

    SafeHtml invalidateSessionError(String cause);

    SafeHtml invalidateSessionQuestion();

    SafeHtml invalidateSessionSuccess();

    SafeHtml invalidExtensionJson();

    SafeHtml invalidExtensionMetadata(String extensionDocumentation);

    SafeHtml jdbcDriverDeploymentHint();

    SafeHtml jdbcDriverProvidedBy(String type, String value);

    SafeHtml jpaStatisticsDisabled(String name, String deployment);

    SafeHtml killServerError(String name);

    SafeHtml killServerGroupError(String name);

    SafeHtml killServerGroupQuestion(String name);

    SafeHtml killServerGroupSuccess(String name);

    SafeHtml killServerQuestion(String name);

    SafeHtml killServerSuccess(String name);

    SafeHtml largeLogFile(String size);

    SafeHtml lastOperationException();

    SafeHtml lastOperationFailed();

    SafeHtml listHint();

    SafeHtml loadContentError();

    SafeHtml loadPropertiesRealmError(String name, String error);

    SafeHtml loadPropertiesRealmSuccess(String name);

    SafeHtml loadProviderDynamicWarning();

    SafeHtml logFileError(String name);

    SafeHtml longRunningManagementOperations();

    SafeHtml macroPlaybackError();

    SafeHtml macroPlaybackSuccessful();

    SafeHtml managementOperationsFindNoResult();

    SafeHtml managementVersionMismatch(String managementVersion, String targetVersion);

    SafeHtml manyMessages(long number);

    SafeHtml mappingHint();

    SafeHtml messageServerStarted(String name);

    SafeHtml messageServerStopped(String name, String server);

    SafeHtml metadataError();

    SafeHtml microprofileHealthOutcome(String outcome);

    SafeHtml modifyResourceSuccess(String type, String name);

    SafeHtml modifySingleResourceSuccess(String type);

    SafeHtml moreThanOneCacheMemory();

    SafeHtml moreThanOneCacheStore();

    SafeHtml moreThanOneKeyMapperForPrincipalQuery();

    SafeHtml moveMessageSuccess(String queue);

    SafeHtml multiValueListHint();

    SafeHtml nearCacheInvalidation();

    SafeHtml nearCacheNone();

    SafeHtml nearCacheUndefined();

    SafeHtml newContentSuccess(String deployment, String file);

    SafeHtml noChanges();

    SafeHtml noContent();

    SafeHtml noContentSelected();

    SafeHtml noContentSelectedInDeployment();

    SafeHtml noContextForNormalMode();

    SafeHtml noDeployment();

    SafeHtml noDeploymentPermissions();

    SafeHtml noDeploymentsUploaded();

    SafeHtml noExecutions();

    SafeHtml noItems();

    SafeHtml noLogFile();

    SafeHtml noMacrosDescription(String startMacro);

    SafeHtml noMatchingConnections();

    SafeHtml noMatchingItems();

    SafeHtml noMessagesSelected();

    SafeHtml noPolicy();

    SafeHtml noReferenceServerEmptyState(String deployment, String serverGroup);

    SafeHtml noReferenceServerPreview(String deployment, String attribute1, String attribute2, String serverGroup,
            String historyToken);

    SafeHtml noReset();

    SafeHtml noResource();

    SafeHtml normalLogFile(String size);

    SafeHtml noSecuritySettingSelected();

    SafeHtml noSelectedPatch();

    SafeHtml noServerGroupSelected();

    SafeHtml noStore();

    SafeHtml noTransport();

    SafeHtml noWrite();

    SafeHtml obtainCertificateError(String alias, String resource, String error);

    SafeHtml obtainCertificateSuccess(String alias, String resource);

    SafeHtml operationLabel(String name);

    SafeHtml operationHost(String name);

    SafeHtml operationServer(String name);

    SafeHtml pageNotFound(String invalidHistoryToken);

    SafeHtml patchAddError(String patchId, String error);

    SafeHtml patchHostNeedsRestart(String hostname);

    SafeHtml patchInProgress(String patch);

    SafeHtml patchRestartDomainControllerQuestion(String hostname);

    SafeHtml patchRestartHostControllerQuestion(String hostname);

    SafeHtml patchRestartStandaloneQuestion();

    SafeHtml patchStopAllServersQuestion(String servers, String host);

    SafeHtml patchStopServersDialogMessage1();

    SafeHtml patchStopServersDialogMessage2();

    SafeHtml patchSucessfullyApplied(String patchId);

    SafeHtml pauseQueueSuccess(String name);

    SafeHtml profileNotUsedInServerGroups();

    SafeHtml profileUsedInServerGroups(SafeHtml serverGroupLinks);

    SafeHtml propertiesHint();

    SafeHtml pruneDisconnectedQuestion();

    SafeHtml pruneExpiredQuestion();

    SafeHtml pruneSuccessful();

    SafeHtml readAliasError(String alias, String resource, String error);

    SafeHtml readAliasesError(String resource, String error);

    SafeHtml readAliasesSuccess(String resource);

    SafeHtml readIdentityError(String identity, String realm, String error);

    SafeHtml recordingStarted();

    SafeHtml recordingStopped();

    SafeHtml reloadConsoleRedirect(String url);

    SafeHtml reloadConsoleTimeout(String type, String url);

    SafeHtml reloadCRLError(String name, String error);

    SafeHtml reloadCRLSuccess(String name);

    SafeHtml reloadDomainControllerPending(String name);

    SafeHtml reloadDomainControllerQuestion(String name);

    SafeHtml reloadError(String resource, String error);

    SafeHtml reloadErrorCause(String type, String name, String failure);

    SafeHtml reloadHostControllerQuestion(String name);

    SafeHtml reloadHostError(String name);

    SafeHtml reloadHostSuccess(String name);

    SafeHtml reloadServerError(String name);

    SafeHtml reloadServerGroupError(String name);

    SafeHtml reloadServerGroupQuestion(String name);

    SafeHtml reloadServerGroupSuccess(String name);

    SafeHtml reloadServerQuestion(String name);

    SafeHtml reloadServerSuccess(String name);

    SafeHtml reloadSettings();

    SafeHtml reloadSuccess(String resource);

    SafeHtml removeAliasError(String alias, String resource, String error);

    SafeHtml removeAliasQuestion(String alias, String resource);

    SafeHtml removeAliasSuccess(String alias, String resource);

    SafeHtml removeConfigurationChangesQuestion(String type, String name);

    SafeHtml removeConfirmationQuestion(String name);

    SafeHtml removeContentQuestion(String deployment, String path);

    SafeHtml removeContentSuccess(String deployment, String path);

    SafeHtml removeCurrentUserError();

    SafeHtml removeExtensionQuestion();

    SafeHtml removeExtensionSuccess();

    SafeHtml removeGroupQuestion(String name);

    SafeHtml removeGroupSuccess(String name);

    SafeHtml removeIdentityError(String identity, String realm, String error);

    SafeHtml removeIdentityQuestion(String identity, String realm);

    SafeHtml removeIdentitySuccess(String identity, String realm);

    SafeHtml removeMessageQuestion();

    SafeHtml removeMessagesQuestion();

    SafeHtml removeMessageSuccess();

    SafeHtml removeError(String name, String error);

    SafeHtml removeResourceSuccess(String type, String name);

    SafeHtml removeRoleQuestion(String name);

    SafeHtml removeRunAsRoleError(String role);

    SafeHtml removeSingletonConfirmationQuestion();

    SafeHtml removeSingletonResourceSuccess(String type);

    SafeHtml removeSingletonSuccess(String type);

    SafeHtml removeUserQuestion(String name);

    SafeHtml removeUserSuccess(String name);

    SafeHtml replicationColocated();

    SafeHtml replicationLiveOnly();

    SafeHtml replicationMaster();

    SafeHtml replicationSlave();

    SafeHtml replicationStrategy();

    SafeHtml requiredHelp();

    SafeHtml requiredMarker();

    SafeHtml requires(String requires);

    SafeHtml resetConfirmationQuestion(String name);

    SafeHtml resetMessageCounterSuccess(String name);

    SafeHtml resetResourceSuccess(String type, String name);

    SafeHtml resetSingletonConfirmationQuestion();

    SafeHtml resetSingletonSuccess(String type);

    SafeHtml resetStatisticsQuestion(String connector);

    SafeHtml resetStatisticsSuccess(String connector);

    SafeHtml resourceAdapterProvidedBy(String type, String name);

    SafeHtml resourceDisabled(String type, String name);

    SafeHtml resourceEnabled(String type, String name);

    SafeHtml restartDomainControllerPending(String name);

    SafeHtml restartDomainControllerQuestion(String name);

    SafeHtml restartExecutionSuccess(int id);

    SafeHtml restartHostControllerQuestion(String name);

    SafeHtml restartHostError(String name);

    SafeHtml restartHostSuccess(String name);

    SafeHtml restartServerError(String name);

    SafeHtml restartServerGroupError(String name);

    SafeHtml restartServerGroupQuestion(String name);

    SafeHtml restartServerGroupSuccess(String name);

    SafeHtml restartServerQuestion(String name);

    SafeHtml restartServerSuccess(String name);

    SafeHtml restartStandalonePending(String name);

    SafeHtml restartStandaloneQuestion(String name);

    SafeHtml restartStandaloneTimeout(String name);

    SafeHtml resumeQueueSuccess(String name);

    SafeHtml resumeServerError(String name);

    SafeHtml resumeServerGroupError(String name);

    SafeHtml resumeServerGroupSuccess(String name);

    SafeHtml resumeServerSuccess(String name);

    SafeHtml revokeCertificateError(String alias, String resource, String error);

    SafeHtml revokeCertificateSuccess(String alias, String resource);

    SafeHtml rollbackError(String failure);

    SafeHtml rollbackInProgress(String patchid);

    SafeHtml rollbackSucessful(String patchId);

    SafeHtml rollbackTransactionSuccess(String transactionId);

    SafeHtml runningTimeLabel(String name);

    SafeHtml saveContentSuccess(String deployment, String file);

    SafeHtml saveIdentityError(String identity, String realm, String error);

    SafeHtml saveIdentitySuccess(String identity, String realm);

    SafeHtml selected(int selected, int total);

    SafeHtml sendMessagesToDeadLetterQuestion();

    SafeHtml sendMessageToDeadLetterQuestion();

    SafeHtml sendMessageToDeadLetterSuccess();

    SafeHtml serverAdminMode(String name);

    SafeHtml serverBootErrors(String name);

    SafeHtml serverBootErrorsAndLink(String name, String link);

    SafeHtml serverConfigurationChanged();

    SafeHtml serverFailed(String name);

    SafeHtml serverGroupNoStartedServers(String name);

    SafeHtml serverGroupNoStoppedServers(String name);

    SafeHtml serverGroupNoSuspendedServers(String name);

    SafeHtml serverGroupTimeout(String name);

    SafeHtml serverNeedsReload(String name);

    SafeHtml serverNeedsRestart(String name);

    SafeHtml serverPending(String name);

    SafeHtml serverRunning(String name);

    SafeHtml serverStopped(String name);

    SafeHtml serverSuspended(String name);

    SafeHtml serverTimeout(String name);

    SafeHtml serverUndefined(String name);

    SafeHtml serverUrlCustom();

    SafeHtml serverUrlError();

    SafeHtml serverUrlManagementModel();

    SafeHtml setIdentityPasswordError(String identity, String realm, String error);

    SafeHtml setIdentityPasswordQuestion();

    SafeHtml setIdentityPasswordSuccess(String identity, String realm);

    SafeHtml setSecretPasswordError(String alias, String resource, String error);

    SafeHtml setSecretPasswordSuccess(String alias, String resource);

    SafeHtml sharedStoreColocated();

    SafeHtml sharedStoreMaster();

    SafeHtml sharedStoreSlave();

    SafeHtml sharedStoreStrategy();

    SafeHtml simpleProviderWarning();

    SafeHtml specifyParameters(String link);

    SafeHtml ssoAccessControlWarning();

    SafeHtml staleStatistics();

    SafeHtml startDeliverySuccess(String name);

    SafeHtml startJobSuccess(String job, long id);

    SafeHtml startServerError(String name);

    SafeHtml startServerGroupError(String name);

    SafeHtml startServerGroupSuccess(String name);

    SafeHtml startServerSuccess(String name);

    SafeHtml statisticsDisabled(String subsystem);

    SafeHtml statisticsEnabled(String name);

    SafeHtml stopDeliverySuccess(String name);

    SafeHtml stopExecutionSuccess(int id);

    SafeHtml stopServerError(String name);

    SafeHtml stopServerGroupError(String name);

    SafeHtml stopServerGroupQuestion(String name);

    SafeHtml stopServerGroupSuccess(String name);

    SafeHtml stopServerQuestion(String name);

    SafeHtml stopServerSuccess(String name);

    SafeHtml storeError(String resource, String error);

    SafeHtml storeSuccess(String resource);

    SafeHtml suspendServerError(String name);

    SafeHtml suspendServerGroupError(String name);

    SafeHtml suspendServerGroupQuestion(String name);

    SafeHtml suspendServerGroupSuccess(String name);

    SafeHtml suspendServerQuestion(String name);

    SafeHtml suspendServerSuccess(String name);

    SafeHtml switchProviderSuccess(String from, String to);

    SafeHtml switchToRbacProvider();

    SafeHtml switchToSimpleProvider();

    SafeHtml testConnectionCancelError(String datasource);

    SafeHtml testConnectionDomain(String testConnection);

    SafeHtml testConnectionError(String datasource);

    SafeHtml testConnectionStandalone(String testConnection);

    SafeHtml testConnectionSuccess(String datasource);

    SafeHtml topologyError();

    SafeHtml tourAccessControl();

    SafeHtml tourAccessControlRoles();

    SafeHtml tourAccessControlUsers();

    SafeHtml tourDomainConfiguration();

    SafeHtml tourDomainConfigurationSubsystem();

    SafeHtml tourDomainDeploymentsAddActions();

    SafeHtml tourDomainDeploymentsBrowseBy();

    SafeHtml tourDomainHomeConfiguration();

    SafeHtml tourDomainHomeDeployments();

    SafeHtml tourDomainHomeRuntime();

    SafeHtml tourDomainRuntimeBrowseBy();

    SafeHtml tourDomainRuntimeServer();

    SafeHtml tourDomainRuntimeServerAdd();

    SafeHtml tourDomainRuntimeServerGroup();

    SafeHtml tourDomainRuntimeServerGroupsAdd();

    SafeHtml tourStandaloneConfigurationSubsystem();

    SafeHtml tourStandaloneDeployment();

    SafeHtml tourStandaloneDeploymentAddActions();

    SafeHtml tourStandaloneHomeConfiguration();

    SafeHtml tourStandaloneHomeDeployments();

    SafeHtml tourStandaloneHomeRuntime();

    SafeHtml tourStandaloneRuntimeServer();

    SafeHtml tourStandaloneRuntimeSubsystem();

    SafeHtml transactionSetUuidOrSocket();

    SafeHtml transactionUnableSetProcessId();

    SafeHtml tuplesHint(String names);

    SafeHtml unauthorized();

    SafeHtml undeployedContent(String name);

    SafeHtml unit(String unit);

    SafeHtml unknownError();

    SafeHtml unknownResource();

    SafeHtml unsupportedFileTypeDescription();

    SafeHtml updateAccountError(String name, String error);

    SafeHtml updateAccountSuccess(String name);

    SafeHtml updateServerError(String name);

    SafeHtml uploadContentDescription();

    SafeHtml uploadError(String name);

    SafeHtml uploadInProgress(String name);

    SafeHtml uploadSuccessful(String name);

    SafeHtml verifyRenewError(String alias, String resource, String error);

    SafeHtml verifyRenewSuccess(String alias, String resource);

    SafeHtml writeBehaviour(String current, String switchTo);

    // ------------------------------------------------------ strings

    String accessControlSsoDescription();

    String activeRoles(String roles);

    String addResourceTitle(String type);

    String addServerTitle();

    String atLeastOneIsRequired(String attributes);

    String available(double value);

    String blacklist(String blacklist);

    String bootErrors();

    String cancelNonProgressingOperation();

    String changeAccountKeyQuestion(String name);

    String chooseTemplate(String custom);

    String cleanPatchHistory();

    String configurationChangesDescription();

    String configurePatchTitle();

    String connectedTo(String url);

    String contentFilterDescription();

    String copyServerTitle();

    String createAccountQuestion(String name);

    String credentialReferenceConflict();

    String credentialReferenceParentNoResource(String parentResource);

    String credentialReferenceValidationError(String alternative);

    String credentialReferenceValidationErrorValues();

    String credentialReferenceInvalidCombination();

    String currentOfTotal(long current, long total);

    String datasourceFilterDescription();

    String datasourceRuntimeFilterDescription();

    String deactivateAccountQuestion(String name);

    String deploymentEmptyCreate();

    String deploymentStandaloneColumnFilterDescription();

    String deprecated(String since, String reason);

    String destinationFilterDescription();

    String destroy(String name);

    String domainUuidLabel(String uuid);

    String duplicateAuthenticationModuleReason();

    String duplicateResource(String type);

    String ejbFilterDescription();

    String enableSSLConfirmationDescription();

    String endpointColumnFilterDescription();

    String exactlyOneAlternativeError(String alternatives);

    String exactlyOneAlternativesError(String alternatives);

    String extensionColumnFilterDescription();

    String filterBy(String name);

    String findNonProgressingOperation();

    String goTo(String name);

    String homepagePatchingDomainStepIntro(String name);

    String homepagePatchingStandaloneStepIntro(String name);

    String homepagePatchingSubHeader(String name);

    String hostColumnFilterDescription();

    String hostPatchesColumnFilterDescription();

    String hostScopedRole(String name, String scope);

    String identityDescription();

    String identityPasswordBcrypt();

    String identityPasswordClear();

    String identityPasswordDigest();

    String identityPasswordOtp();

    String identityPasswordSaltedSimpleDigest();

    String identityPasswordScramDigest();

    String identityPasswordSimpleDigest();

    String invalidFormat();

    String invalidJNDIName();

    String invalidLength();

    String invalidRange(double value, long min, long max);

    String invalidTagFormat(String allowed);

    String jdbcDriverColumnFilterDescription();

    String jobExecutionColumnFilterDescription();

    String jpaColumnFilterDescription();

    String keepDialogOpen();

    String kill(String name);

    String logfileColumnFilterDescription();

    String logFileFullStatus(int lines, String lastUpdate);

    String logFilePartStatus(int lines, String lastUpdate);

    String logFilePreview(int lines);

    String mailColumnFilterDescription();

    String membershipColumnFilterDescription();

    String microprofileHealthNoChecks();

    String microprofileHealthPreviewDescription();

    String modifyResourceTitle(String type);

    String moreThanOneCacheStoreDetails();

    String noBootErrors();

    String nonEmptyRequires(String fields);

    String nonProgressingOperation();

    String noPatchesForHost();

    String notifications(@PluralCount int count);

    String notMoreThanOneAlternativeError(String alternatives);

    String notMoreThanOneAlternativesError(String alternatives);

    String operations(int size);

    String patchLatestInstalledLabel();

    String patchStopAllServersTitle();

    String pathRequired();

    String profileIncludes(String includes);

    String proxyColumnFilterDescription();

    String readDatasourcePropertiesErrorDomain(String profile);

    String recordedOperations(@PluralCount int count);

    String referenceServer(String server);

    String reload(String name);

    String removeConfirmationTitle(String name);

    String resetConfirmationTitle(String type);

    String resetStatisticsTitle();

    String resourceAdapterColumnFilterDescription();

    String restart(String name);

    String restColumnFilterDescription();

    String results(int number);

    String roleColumnFilterDescription();

    String securityDomainColumnFilterDescription();

    String serverFilterDescription();

    String serverGroupColumnFilterDescription();

    String serverGroupScopedRole(String name, String scope);

    String stop(String name);

    String susbsystemFilterDescription();

    String suspend(String name);

    String testConnectionErrorDomain();

    String undertowListenerProcessingDisabled(String listener, String server);

    String unknownResourceDetails(String address, String reason);

    String updateAccountQuestion(String name);

    String updateAvailable(String current, String update);

    String uploadContentInvalid();

    String uptime(String uptime);

    String used(double value);

    String view(String type);

    String jgroupsClusterOrSocketBindingMustBeSet();
    // @formatter:on
}
