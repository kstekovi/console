/*
 *  Copyright 2022 Red Hat
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jboss.hal.resources;

// @formatter:off
public interface Constants extends com.google.gwt.i18n.client.Constants {
    String abandoned();
    String aborted();
    String accessMechanism();
    String accessType();
    String actions();
    String active();
    String activeFilters();
    String activeLower();
    String activeSessions();
    String add();
    String addAlias();
    String addChannel();
    String addContent();
    String addIdentity();
    String address();
    String addressMatch();
    String adminOnly();
    String aliases();
    String allMessagesAlways();
    String allMessagesOnce();
    String and();
    String applicationRollback();
    String applyingUpdates();
    String applyUpdates();
    String applyUpdatesSuccess();
    String archived();
    String artifactChanges();
    String assignment();
    String assignmentsOfGroup();
    String assignmentsOfUser();
    String attribute();
    String attributes();
    String average();
    String back();
    String backToNormalMode();
    String browse();
    String browseBy();
    String cacheMemory();
    String cacheStore();
    String callerThread();
    String cancel();
    String cancelActiveOperation();
    String cancelNonProgressingOperation();
    String category();
    String change();
    String changeAccountKey();
    String changeAlias();
    String changePriority();
    String channelChanges();
    String channelDescription();
    String channelDetails();
    String chooseConnectionsToClose();
    String chooseFile();
    String chooseIdentityPasswordTitle();
    String chooseOrDragFile();
    String chooseOrDragFiles();
    String choosePolicy();
    String chooseSingleton();
    String chooseStrategy();
    String chooseTemplate();
    String clean();
    String clear();
    String clearAll();
    String clearAllFilters();
    String clearCache();
    String clearRunAs();
    String clearRunAsTitle();
    String clearSelection();
    String cli();
    String clone_();
    String cloneProfile();
    String close();
    String closed();
    String collapse();
    String commit();
    String committed();
    String completed();
    String completedExecutions();
    String composite();
    String configuration();
    String configurationChanges();
    String configurationChangesNotEnabled();
    String configurationSslManagement();
    String confirmation();
    String connectedTo();
    String connectToServer();
    String consoleVersion();
    String consumersForAddress();
    String content();
    String contentRepository();
    String copied();
    String copy();
    String copyToClipboard();
    String count();
    String counter();
    String create();
    String createAccount();
    String creationTime();
    String current();
    String currentPage();
    String custom();
    String customPatches();
    String data();
    String dataTablesDecimal();
    String dataTablesEmptyTable();
    String dataTablesFirst();
    String dataTablesInfo();
    String dataTablesInfoEmpty();
    String dataTablesInfoFiltered();
    String dataTablesLast();
    String dataTablesLengthMenu();
    String dataTablesLoadingRecords();
    String dataTablesNext();
    String dataTablesPrevious();
    String dataTablesProcessing();
    String dataTablesSortAscending();
    String dataTablesSortDescending();
    String dataTablesThousands();
    String dataTablesZeroRecords();
    String day();
    String days();
    String deactivate();
    String deactivateAccount();
    String defaultValue();
    String deploy();
    String deployContent();
    String deployExistingContent();
    String deploymentAttributes();
    String deploymentEmptyCreate();
    String deploymentError();
    String deploymentInProgress();
    String deployments();
    String deploymentSuccessful();
    String description();
    String destroy();
    String details();
    String directory();
    String disable();
    String disableConfigurationChanges();
    String disabled();
    String disableSSL();
    String disconnected();
    String disconnectedUpper();
    String domainConfigurationChanged();
    String domainConfigurationChangedTooltip();
    String download();
    String dropSubscriptions();
    String duplicateMacro();
    String duplicateResource();
    String duration();
    String edit();
    String editIdentity();
    String editURL();
    String enable();
    String enableConfigurationChanges();
    String enabled();
    String enableDeployment();
    String enableRbac();
    String enableSSL();
    String enableSSLManagementErrorMsg();
    String enableSSLManagementInitialSetup();
    String enableSSLManagementTitle();
    String enableStatistics();
    String encryptExpression();
    String endpointAddDescription();
    String endpointAddTitle();
    String endpointConnect();
    String endpointSelectDescription();
    String endpointSelectTitle();
    String enterAddressMatch();
    String entry();
    String environment();
    String error();
    String excludeRole();
    String excludes();
    String excludeUserGroup();
    String exclusiveRunningTime();
    String executionStatus();
    String expandAll();
    String expertMode();
    String expire();
    String expiredSessions();
    String explode();
    String exploded();
    String explodeSubdeployments();
    String export();
    String exportCertificate();
    String exportSecretKey();
    String expression();
    String expressionResolver();
    String extensionError();
    String extensionNotFound();
    String extensionProcessing();
    String failed();
    String failedExecutions();
    String filter();
    String findNonProgressingOperation();
    String finish();
    String finished();
    String firstPage();
    String flushAll();
    String flushGracefully();
    String flushIdle();
    String flushInvalid();
    String forAddress();
    String forceFailover();
    String formErrors();
    String formResetDesc();
    String forUser();
    String fromDeployment();
    String generate();
    String generateCSR();
    String generateKeyPair();
    String generateSecretKey();
    String getMetadata();
    String getRoles();
    String globalSettings();
    String gotoDeployment();
    String group();
    String groups();
    String help();
    String hiddenColumns();
    String hideSensitive();
    String hitCount();
    String homepageAccessControlSection();
    String homepageAccessControlSsoSubHeader();
    String homepageAccessControlStep1();
    String homepageAccessControlStep2();
    String homepageAccessControlStepIntro();
    String homepageAccessControlSubHeader();
    String homepageConfigurationDomainStep1();
    String homepageConfigurationDomainSubHeader();
    String homepageConfigurationSection();
    String homepageConfigurationStandaloneStep1();
    String homepageConfigurationStandaloneSubHeader();
    String homepageConfigurationStep2();
    String homepageConfigurationStep3();
    String homepageConfigurationStepIntro();
    String homepageDeploymentsDomainStep1();
    String homepageDeploymentsDomainStep2();
    String homepageDeploymentsDomainStepIntro();
    String homepageDeploymentsSection();
    String homepageDeploymentsStandaloneStep1();
    String homepageDeploymentsStandaloneStepIntro();
    String homepageDeploymentsStepEnable();
    String homepageDeploymentsSubHeader();
    String homepageHelpAdminGuideText();
    String homepageHelpConsultingLink();
    String homepageHelpConsultingText();
    String homepageHelpDevelopersMailingListText();
    String homepageHelpEapCommunityLink();
    String homepageHelpEapCommunityText();
    String homepageHelpEapConfigurationsLink();
    String homepageHelpEapConfigurationsText();
    String homepageHelpEapDocumentationLink();
    String homepageHelpEapDocumentationText();
    String homepageHelpGeneralResources();
    String homepageHelpGetHelp();
    String homepageHelpIrcText();
    String homepageHelpKnowledgebaseLink();
    String homepageHelpKnowledgebaseText();
    String homepageHelpLatestNews();
    String homepageHelpLearnMoreEapLink();
    String homepageHelpLearnMoreEapText();
    String homepageHelpModelReferenceText();
    String homepageHelpNeedHelp();
    String homepageHelpTrainingLink();
    String homepageHelpTrainingText();
    String homepageHelpTroubleTicketLink();
    String homepageHelpTroubleTicketText();
    String homepageHelpTutorialsLink();
    String homepageHelpTutorialsText();
    String homepageHelpUserForumsText();
    String homepageHelpWildFlyHomeText();
    String homepageHelpWildflyIssuesText();
    String homepageHelpWilfdflyDocumentationText();
    String homepageNewToEap();
    String homepagePatchingDomainStep2();
    String homepagePatchingSection();
    String homepagePatchingStep1();
    String homepagePatchingStepApply();
    String homepageRuntimeDomainCreateServerSection();
    String homepageRuntimeDomainCreateServerStep1();
    String homepageRuntimeDomainCreateServerStep2();
    String homepageRuntimeDomainCreateServerStepIntro();
    String homepageRuntimeDomainMonitorServerSection();
    String homepageRuntimeDomainMonitorServerStep1();
    String homepageRuntimeDomainMonitorServerStep2();
    String homepageRuntimeDomainServerGroupSection();
    String homepageRuntimeDomainServerGroupStep1();
    String homepageRuntimeDomainServerGroupStep2();
    String homepageRuntimeDomainServerGroupStepIntro();
    String homepageRuntimeDomainSubHeader();
    String homepageRuntimeStandaloneSection();
    String homepageRuntimeStandaloneStep1();
    String homepageRuntimeStandaloneStep2();
    String homepageRuntimeStandaloneSubHeader();
    String homepageRuntimeStepIntro();
    String homepageTakeATour();
    String homepageUpdateManagerSection();
    String homepageUpdateManagerStep1();
    String homepageUpdateManagerStep2();
    String homepageUpdateManagerStep3();
    String homepageUpdateManagerStepIntro();
    String homepageUpdateManagerSubHeader();
    String hostNameChanged();
    String hostScopedRole();
    String hostsUsingThisFilter();
    String hostsUsingThisHandler();
    String hour();
    String hours();
    String httpManagementInterface();
    String identity();
    String importCertificate();
    String importSecretKey();
    String importt();
    String inactive();
    String includeRole();
    String includes();
    String includesAll();
    String includesAllDescription();
    String includesAllHeader();
    String includeUserGroup();
    String initialize();
    String input();
    String installationUpdateMethods();
    String instances();
    String invalidate();
    String invalidateSession();
    String invalidExpression();
    String invalidJson();
    String invalidMetadata();
    String jcaConfiguration();
    String jgroupsRelayAlias();
    String jndiNames();
    String jndiTree();
    String keys();
    String kill();
    String largest();
    String lastAccessedTime();
    String lastModified();
    String lastPage();
    String listComponents();
    String listUpdates();
    String load();
    String loading();
    String loadingPleaseWait();
    String logFile();
    String logFilePreviewError();
    String logFiles();
    String logout();
    String macroEditor();
    String mainAttributes();
    String managed();
    String managementVersion();
    String managementVersionMismatchDescription();
    String manyMessages();
    String markAllRead();
    String maxActiveSessions();
    String maximum();
    String maxProcessingTime();
    String maxUsed();
    String membership();
    String membershipOfRole();
    String message();
    String messageLarge();
    String messages();
    String milliseconds();
    String minimum();
    String minute();
    String minutes();
    String missCount();
    String modelBrowser();
    String monitor();
    String move();
    String name();
    String nanoseconds();
    String nativeManagementInterface();
    String needsReload();
    String needsRestart();
    String networkError();
    String newContent();
    String next();
    String nextPage();
    String no();
    String noAttributes();
    String noBootErrors();
    String noConfiguredMailServers();
    String noDetails();
    String noExecutions();
    String noHaPolicy();
    String noItems();
    String noMacros();
    String noMatchingItems();
    String noNotifications();
    String noPolicy();
    String noPrincipalsExcluded();
    String noPrincipalsIncluded();
    String noReferenceServer();
    String noResource();
    String noRolesExcluded();
    String noRolesIncluded();
    String noRolesIncludedOrExcluded();
    String noRootLogger();
    String noRootLoggerDescription();
    String noRunningServers();
    String noStore();
    String notANumber();
    String notEnabled();
    String nothingSelected();
    String noTransport();
    String noUpdates();
    String noWrite();
    String obtain();
    String obtainCertificate();
    String of();
    String offlineUsingArchives();
    String ok();
    String onlineUpdates();
    String opened();
    String openInExternalWindow();
    String openInModelBrowser();
    String openPorts();
    String operation();
    String operationDate();
    String operationFailed();
    String operationMode();
    String operations();
    String operationSuccessful();
    String optionalFields();
    String or();
    String orDragItHere();
    String organization();
    String outcome();
    String output();
    String patchError();
    String patchInProgress();
    String patchSuccessful();
    String pattern();
    String pause();
    String pending();
    String period();
    String perPage();
    String pin();
    String ping();
    String platform();
    String play();
    String preparedStatementCache();
    String prepareServerCandidate();
    String prepareServerCandidateSuccess();
    String preparingServerCandidate();
    String preview();
    String previous();
    String previousPage();
    String probe();
    String processingTime();
    String processors();
    String productName();
    String productVersion();
    String providedBy();
    String prune();
    String pruneDisconnected();
    String pruneExpired();
    String queue();
    String readIdentity();
    String recovery();
    String references();
    String refresh();
    String rejected();
    String rejectedSessions();
    String releaseName();
    String releaseVersion();
    String reload();
    String reloadCRL();
    String reloadRequired();
    String reloadStandaloneTooltip();
    String remoteActiveMQServer();
    String remoteAddress();
    String remove();
    String removeAlias();
    String removeContent();
    String removeIdentity();
    String rename();
    String replace();
    String replaceContent();
    String replaceDeployment();
    String request();
    String required();
    String requiredField();
    String reset();
    String resolve();
    String resolvedValue();
    String resolveExpression();
    String resourceRollback();
    String response();
    String restart();
    String restartAllServices();
    String restartJvm();
    String restartNoServices();
    String restartRequired();
    String restartResourceServices();
    String restartStandaloneTooltip();
    String restricted();
    String results();
    String resume();
    String revert();
    String revertUpdatePreviousState();
    String review();
    String revoke();
    String revokeCertificate();
    String role();
    String roles();
    String rollback();
    String rollbackError();
    String rollbackInProgress();
    String rollbackSuccessful();
    String runAs();
    String runAsRoleTitle();
    String running();
    String runningTime();
    String sameOrigin();
    String save();
    String search();
    String second();
    String seconds();
    String selectAll();
    String sendToDeadLetter();
    String serverGroupScopedRole();
    String serverName();
    String serverUrlCustom();
    String serverUrlManagementModel();
    String sessionsAvgAliveTime();
    String sessionsMaxAliveTime();
    String sessionTime();
    String setIdentityPasswordTitle();
    String setPassword();
    String setSecret();
    String settings();
    String setupSSL();
    String showAll();
    String showSensitive();
    String size();
    String sizing();
    String source();
    String specifyNames();
    String specifyParameters();
    String start();
    String startDelivery();
    String starting();
    String startInSuspendedMode();
    String startJob();
    String startMacro();
    String statements();
    String statisticsDisabled();
    String statisticsDisabledHeader();
    String statisticsNotAvailableHeader();
    String status();
    String stop();
    String stopDelivery();
    String stopMacro();
    String stopped();
    String stoppedExecution();
    String storage();
    String store();
    String subscriptions();
    String success();
    String supportsExpressions();
    String suspend();
    String suspended();
    String switchAffinity();
    String switchBehaviour();
    String switchMemory();
    String switchNearCache();
    String switchProvider();
    String switchRouting();
    String switchStore();
    String switchToExpressionMode();
    String switchToNormalMode();
    String systemRollback();
    String tags();
    String tailMode();
    String test();
    String testConnection();
    String testConnectionError();
    String testConnectionSuccess();
    String timedOut();
    String timeout();
    String timeouts();
    String toggleDropdown();
    String toggleNavigation();
    String tools();
    String totalProcessingTime();
    String tracking();
    String type();
    String undeploy();
    String undeployContent();
    String undeployed();
    String unknownError();
    String unknownState();
    String unmanaged();
    String unpin();
    String unsubscribe();
    String unsubscribeChannel();
    String unsupportedFileType();
    String updateAccount();
    String updateExistingInstallation();
    String updateManagerHeading();
    String upload();
    String uploadArchives();
    String uploadContent();
    String uploadCustomPatches();
    String uploadDeployment();
    String uploadError();
    String uploadingArchives();
    String uploadingCustomPatches();
    String uploadInProgress();
    String uploadNewDeployment();
    String uploadPatch();
    String uploadSuccessful();
    String used();
    String user();
    String users();
    String validation();
    String verifyRenew();
    String verifyRenewCertificate();
    String view();
    String viewDetailsAlias();
    String viewInEditor();
    String xaProperties();
    String yes();
}
