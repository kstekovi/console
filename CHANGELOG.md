# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres
to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [3.6.9] - 2023-06-15

### Changed

- [HAL-1866](https://issues.redhat.com/browse/HAL-1866): Make role comparison case insensitive

## [3.6.8] - 2023-06-13

### Fixed

- [HAL-1865](https://issues.redhat.com/browse/HAL-1865): Not possible to create Infinispan Session
- Fix visibility of the update manager

## [3.6.7] - 2023-06-13

### Changed

- Configure docker files for license plugin

### Fixed

- [HAL-1859](https://issues.redhat.com/browse/HAL-1859): Show RBAC failed page when SSO is enabled
- Fix script for building WildFly development image

### Upgrades

- Bump ACE editor to 1.22.1
- Bump Parcel to 2.9.2
- Bump Quarkus to 3.1.1.Final

## [3.6.6] - 2023-05-26

### Added

- [HAL-1804](https://issues.redhat.com/browse/HAL-1804): Support for Keycloak SSO using Wildfly OIDC Client
- [HAL-1826](https://issues.redhat.com/browse/HAL-1826): Support nested attributes in MBUI views
- [HAL-1827](https://issues.redhat.com/browse/HAL-1827): Update the server installation using the Web Console
- [HAL-1828](https://issues.redhat.com/browse/HAL-1828): Check for duplicate deployment
- [HAL-1832](https://issues.redhat.com/browse/HAL-1832): Activate OIDC in the console

### Changed

- [HAL-1818](https://issues.redhat.com/browse/HAL-1818): "servers" and "running" could be a part of ModelDescriptionConstants
  inside FindNonProgressingTask (thanks @anilabhabaral)

### Fixed

- [HAL-1822](https://issues.redhat.com/browse/HAL-1822): TopologyTasks.RunningServers uses invalid resource addresses (thanks
  @anilabhabaral)
- [HAL-1839](https://issues.redhat.com/browse/HAL-1839): Properties in the Resource Adapter(IBM MQ) are removed when updating
  the connection pool with Management Console
- [HAL-1848](https://issues.redhat.com/browse/HAL-1848): Disabled datasource throws error in Runtime
- [HAL-1850](https://issues.redhat.com/browse/HAL-1850): DataSource wizard creates invalid operation

### Removed

- [HAL-1847](https://issues.redhat.com/browse/HAL-1847): Remove driver-name from driver forms

### Upgrades

- Bump ACE editor to 1.22.0
- Bump JQuery to 3.6.4
- Bump Mockito to 5.3.1
- Bump Parcel to 2.8.3
- Bump PouchDB to 8.0.1
- Bump Quarkus to 3.0.4.Final
- Update GraalVM to 22.3.0

## [3.6.5] - 2022-12-08

### Added

- [HAL-1425](https://issues.redhat.com/browse/HAL-1425): Deployment with persistence.xml - check if data source is available
- Add SECURITY.md file
- Add CODEOWNERS file

### Changed

- [HAL-1816](https://issues.redhat.com/browse/HAL-1816): Hardcoded string "jdbc-compliant" could be replaced by `ModelDescriptionConstants`
- [HAL-1815](https://issues.redhat.com/browse/HAL-1815): Hardcoded database name in CONNECTION_URL should be replaced by a generic name
- [HAL-1814](https://issues.redhat.com/browse/HAL-1814): Adding `contains()` of `Set<>` in `isSuperuser()` and `isAdministrator()` methods
- [HAL-1810](https://issues.redhat.com/browse/HAL-1810): Adding constants to `UIConstants`
- [HAL-1808](https://issues.redhat.com/browse/HAL-1808): Adding `STATISTICS` to `ModelDescriptionConstants`
- [HAL-1656](https://issues.redhat.com/browse/HAL-1656): Driver-XA classes should not be hardcoded in console code
- Update code of conduct

### Fixed

- [HAL-1821](https://issues.redhat.com/browse/HAL-1821): Unable to configure Infinispan subsystem via Web Console
- [HAL-1806](https://issues.redhat.com/browse/HAL-1806): Fix typo "commited" → "committed"
- [HAL-1805](https://issues.redhat.com/browse/HAL-1805): Fix wording "datasource" → "data source"
- Fix NPM package vulnerabilities
- Fix mixed case in affinity select element

### Upgrades

- Bump ACE editor to 1.13.2
- Bump Datatables to 1.12.1
- Bump Mockito to 4.9.0
- Bump Parcel to 2.8.0 
- Bump PouchDB to 7.3.1
- Bump Quarkus to 2.14.3.Final
- Bump SLF4J to 2.0.2

## [3.6.4] - 2022-08-31

### Changed

- Update i18n resources

### Upgrades

- Bump jQuery from 3.6.0 to 3.6.1
- Bump Moment Timezone from 0.5.34 to 0.5.37
- Bump Quarkus from 2.11.2.Final to 2.11.3.Final
- Bump SLF4J from 1.7.36 to 2.0.0

## [3.6.3] - 2022-08-20

### Fixed

- [HAL-1803](https://issues.redhat.com/browse/HAL-1803): Tests are not executed in main
- [HAL-1802](https://issues.redhat.com/browse/HAL-1802): HAL console unavailable after GWT upgrade to 2.10.0
- [HAL-1801](https://issues.redhat.com/browse/HAL-1801): No resource definition registered for webservices endpoints on a host slave

### Upgrades

- Bump ACE editor from 1.8.0 to 1.9.6
- Bump Mockito from 4.6.1 to 4.7.0
- Bump Quarkus from 2.10.3.Final to 2.11.2.Final
- Bump Parcel from 2.6.2 to 2.7.0

## [3.6.2] - 2022-07-22

### Fixed

- [HAL-1800](https://issues.redhat.com/browse/HAL-1800): Provide backward compatibility after migration from master/slave → primary/secondary

### Upgrades

- Bump ACE editor from 1.7.1 to 1.8.0
- Bump Moment from 2.29.3 to 2.29.4
- Bump Quarkus from 2.10.1.Final to 2.10.3.Final

## [3.6.1] - 2022-07-05

### Added

- [HAL-1793](https://issues.redhat.com/browse/HAL-1793): Determine the availability of statistics in case of unresolved expressions
- [HAL-1079](https://issues.redhat.com/browse/HAL-1079): Adding expand all button to show all tree in deployment detail

### Changed

- [HAL-1781](https://issues.redhat.com/browse/HAL-1781): Enhance check for update feature
- [HAL-1780](https://issues.redhat.com/browse/HAL-1780): Problematic language usage deprecation

### Fixed

- [HAL-1796](https://issues.redhat.com/browse/HAL-1796): Unable to create elytron syslog audit resources
- [HAL-1794](https://issues.redhat.com/browse/HAL-1794): Deployment wizard showing success even when it failed
- [HAL-1795](https://issues.redhat.com/browse/HAL-1795): Domain console is not resilient to unresponsive managed server

### Upgrades

- Bump Ace editor from 1.5.3 to 1.7.1
- Bump GWT from 2.9.0 to 2.10.0
- Bump Parcel from 2.6.0 to 2.6.2
- Bump Quarkus from 2.9.2.Final to 2.10.1.Final

## [3.6.0] - 2022-06-09

### Added

- [HAL-1779](https://issues.redhat.com/browse/HAL-1779): Replace 'discovery-group' and 'broadcast-group' resources
- [HAL-1739](https://issues.redhat.com/browse/HAL-1739): Add support for new encrypted expression resources
- [HAL-1709](https://issues.redhat.com/browse/HAL-1709): Add option to start stopped servers in suspended mode
- [HAL-1596](https://issues.redhat.com/browse/HAL-1596): Expose JMS bridge statistics about messages that have been processed
- [HAL-1595](https://issues.redhat.com/browse/HAL-1595): Configure support for TLS 1.3
- [HAL-1594](https://issues.redhat.com/browse/HAL-1594): Configure enhanced mapping of X509Certificate to the underlying identity
- [HAL-1593](https://issues.redhat.com/browse/HAL-1593): Configure the certificate authority used by a certificate-authority-account
- [HAL-1592](https://issues.redhat.com/browse/HAL-1592): Configure Enhanced Audit Logging
- [HAL-1591](https://issues.redhat.com/browse/HAL-1591): Configure module libraries to all deployments running in a server
- [HAL-1590](https://issues.redhat.com/browse/HAL-1590): Configure SSL Certificate revocation using OCSP

### Changed

- [HAL-1783](https://issues.redhat.com/browse/HAL-1783): Replace Flow implementation based on JS Promise API
- [HAL-1782](https://issues.redhat.com/browse/HAL-1783): Upgrade Elemental2 and Elemento
- [HAL-1779](https://issues.redhat.com/browse/HAL-1779): Replace `discovery-group` and `broadcast-group` resources
- Adjust license URLs

### Fixed

- [HAL-1791](https://issues.redhat.com/browse/HAL-1791): Fix EJB view after deprecation of attribute 'cluster' in `/subsystem=ejb3/service=remote`
- Fix item monitor
- Fix error handling in `PropertiesOperations`

### Removed

- [HAL-1785](https://issues.redhat.com/browse/HAL-1785): Remove management column
- [HAL-1758](https://issues.redhat.com/browse/HAL-1758): Remove legacy security

### Upgrades

- Bump Ace editor from 1.4.14 to 1.5.3
- Bump Clipboard from 2.0.10 to 2.0.11
- Bump D3 from 5.9.7 to 5.16.0
- Bump Datatables.net from 1.11.5 to 1.12.1
- Bump Datatables.net keytable from 2.6.4 to 2.7.0
- Bump Datatables.net select from 1.3.4 to 1.4.0
- Bump Elemental2 from 1.0.0-RC1 to 1.1.0
- Bump Elemento from 0.9.6 to 1.0.10
- Bump Guava from 25.0 to 31.1
- Bump Moment.js from 2.29.1 to 2.29.3
- Bump Mockito from 4.4.0 to 4.6.1
- Bump Parcel from 2.3.2 to 2.6.0
- Bump PouchDB from 7.2.2 to 7.3.0
- Bump Quarkus from 2.7.5.Final to 2.9.2.Final

## [3.5.12] - 2022-03-18

### Added

- [HAL-1415](https://issues.redhat.com/browse/HAL-1415): Add a global refresh icon to the header
- [HAL-1733](https://issues.redhat.com/browse/HAL-1733): Treat 'installed-driver-list' and 'find-non-progressing-operation' as read-only operations
- [HAL-1776](https://issues.redhat.com/browse/HAL-1776): I18n for data tables
- Add missing `i18n` maven profile
- Add code scanning workflow
- Add label builder rule for 'OpenAPI'

### Changed

- [HAL-1777](https://issues.redhat.com/browse/HAL-1777): Replace ZeroClipboard with clipboardjs

### Fixed

- [HAL-1778](https://issues.redhat.com/browse/HAL-1778): Fix various i18n issues
- Fix left margin for recording icon in footer
- Fix human readable duration

### Removed

- [HAL-1775](https://issues.redhat.com/browse/HAL-1775): Remove annotations and documentation for extension API

### Upgrades

- Bump Datatables.net from 1.11.4 to 1.11.5
- Bump Quarkus from 2.7.2.Final to 2.7.5.Final
- Bump Mockito from 4.3.1 to 4.4.0

## [3.5.11] - 2022-02-24

### Added

- [HAL-1590](https://issues.redhat.com/browse/HAL-1590): Add form for OCSP in Elytron Trust Manager
- [HAL-1591](https://issues.redhat.com/browse/HAL-1591): Add 'global directory' to EE settings
- [HAL-1593](https://issues.redhat.com/browse/HAL-1593): Configure the certificate authority used by a certificate-authority-account
- [HAL-1594](https://issues.redhat.com/browse/HAL-1594): Add section for evidence decoders in Elytron
- [HAL-1596](https://issues.redhat.com/browse/HAL-1596): Expose runtime attributes of jms-bridge
- [HAL-1709](https://issues.redhat.com/browse/HAL-1709): Add option to start stopped servers in suspended mode

### Changed

- [HAL-1542](https://issues.redhat.com/browse/HAL-1542): Replace Grunt with Parcel
- [HAL-1623](https://issues.redhat.com/browse/HAL-1623): Upgrade JavaScript dependencies
- Update developer related documentation 

### Fixed

- [HAL-1769](https://issues.redhat.com/browse/HAL-1769): Remove unneeded validation from credential reference
- [HAL-1774](https://issues.redhat.com/browse/HAL-1774): Adding global modules in EE fails

### Upgrades

- Bump JUnit from 4.13.1 to 4.13.2
- Bump Mockito from 2.18.3 to 4.3.1
- Bump SLF4J from 1.7.25 to 1.7.36
- Bump GWT from 2.8.2 to 2.9.0
- Bump Auto-Service from 1.0-rc4 to 1.0.1
- Bump jQuery from 3.4.1 to 3.6.0
- Bump Parcel from 2.3.1 to 2.3.2

## [3.5.10] - 2022-02-16

### Updated

- Update README.md
- Update CONTRIBUTING.md

### Removed

- Remove test workflow for native binaries

## [3.5.9] - 2022-02-16

### Changed

- Update README.md

## [3.5.8] - 2022-02-16

### Upgrades

- Upgrade Node to 16.14.0

### Fixed

- Fix native build

## [3.5.7] - 2022-02-16

### Fixed

- Fix native build
- Fix release workflow

## [3.5.6] - 2022-02-16

### Added

- Publish HAL standalone container as `:<version>` and `:latest` if `<version>` is the latest version.

### Changed

- Verify versions in release script
- Optimise Git operations in release script

### Fixed

- Fix native binary generation

## [3.5.5] - 2022-02-15

### Added

- Use PAT for release workflow

### Changed

- Optimise release script

## [3.5.4] - 2022-02-15

### Added

- Native build for Linux, macOS and Windows
- Attach native binaries to GitHub releases

### Fixed

- Fix release workflow

## [3.5.3] - 2022-02-15

### Added

- Add verification question in release script

### Fixed

- Fix release script

## [3.5.2] - 2022-02-15

### Changed

- Update documentation

### Fixed

- Fix release script
- Fix release workflow

## [3.5.1] - 2022-02-15

### Added

- Add release script

### Fixed

- Fix release workflow

## [3.5.0] - 2022-02-14

### Added

- Add maven plugins to verify codebase & source code:
  - Enforcer rules
  - Checkstyle rules
  - Eclipse code formatter definitions
  - License check
  - Common import statement order
- Add GitHub workflows to verify and release HAL
- [HAL-1767](https://issues.redhat.com/browse/HAL-1767): Add active thread count
- [HAL-1766](https://issues.redhat.com/browse/HAL-1766): Support direct connect URL for standalone mode

### Changed

- Update documentation

### Fixed

- [HAL-1772](https://issues.redhat.com/browse/HAL-1772): Fix adding messaging servers

<!--
## Template

### Added

- for new features

### Changed

- for changes in existing functionality

### Fixed

- for any bug fixes

### Security

- in case of vulnerabilities

### Deprecated

- for soon-to-be removed features

### Removed

- for now removed features

### Upgrades

- for dependency upgrades
-->

[Unreleased]: https://github.com/hal/console/compare/v3.6.9...HEAD
[3.6.9]: https://github.com/hal/console/compare/v3.6.8...v3.6.9
[3.6.8]: https://github.com/hal/console/compare/v3.6.7...v3.6.8
[3.6.7]: https://github.com/hal/console/compare/v3.6.6...v3.6.7
[3.6.6]: https://github.com/hal/console/compare/v3.6.5...v3.6.6
[3.6.5]: https://github.com/hal/console/compare/v3.6.4...v3.6.5
[3.6.4]: https://github.com/hal/console/compare/v3.6.3...v3.6.4
[3.6.3]: https://github.com/hal/console/compare/v3.6.2...v3.6.3
[3.6.2]: https://github.com/hal/console/compare/v3.6.1...v3.6.2
[3.6.1]: https://github.com/hal/console/compare/v3.6.0...v3.6.1
[3.6.0]: https://github.com/hal/console/compare/v3.5.12...v3.6.0
[3.5.12]: https://github.com/hal/console/compare/v3.5.11...v3.5.12
[3.5.11]: https://github.com/hal/console/compare/v3.5.10...v3.5.11
[3.5.10]: https://github.com/hal/console/compare/v3.5.9...v3.5.10
[3.5.9]: https://github.com/hal/console/compare/v3.5.8...v3.5.9
[3.5.8]: https://github.com/hal/console/compare/v3.5.7...v3.5.8
[3.5.7]: https://github.com/hal/console/compare/v3.5.6...v3.5.7
[3.5.6]: https://github.com/hal/console/compare/v3.5.5...v3.5.6
[3.5.5]: https://github.com/hal/console/compare/v3.5.4...v3.5.5
[3.5.4]: https://github.com/hal/console/compare/v3.5.3...v3.5.4
[3.5.3]: https://github.com/hal/console/compare/v3.5.2...v3.5.3
[3.5.2]: https://github.com/hal/console/compare/v3.5.1...v3.5.2
[3.5.1]: https://github.com/hal/console/compare/v3.5.0...v3.5.1
[3.5.0]: https://github.com/hal/console/compare/vTemplate...v3.5.0
