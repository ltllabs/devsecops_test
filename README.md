Exploring Github CI for security

## Codeclimate

[![Maintainability](https://api.codeclimate.com/v1/badges/1d0797ac42cedfa40b3a/maintainability)](https://codeclimate.com/github/ltllabs/devsecops_test/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/1d0797ac42cedfa40b3a/test_coverage)](https://codeclimate.com/github/ltllabs/devsecops_test/test_coverage)
[![Issues](https://img.shields.io/codeclimate/issues/ltllabs/devsecops_test)](https://codeclimate.com/github/ltllabs/devsecops_test/issues)
[![Technical debt](https://img.shields.io/codeclimate/tech-debt/ltllabs/devsecops_test)](https://codeclimate.com/github/ltllabs/devsecops_test/trends/technical_debt)

## Snyk

[![Known Vulnerabilities](https://snyk.io/test/github/ltllabs/devsecops_test/badge.svg)](https://snyk.io/test/github/ltllabs/devsecops_test)

## LGTM

[![Total alerts](https://img.shields.io/lgtm/alerts/g/ltllabs/devsecops_test.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/ltllabs/devsecops_test/alerts/)

[![Language grade: Python](https://img.shields.io/lgtm/grade/python/g/ltllabs/devsecops_test.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/ltllabs/devsecops_test/context:python)

## Codecov

[![codecov](https://codecov.io/gh/ltllabs/devsecops_test/branch/master/graph/badge.svg?token=HPTFA5L86R)](https://codecov.io/gh/ltllabs/devsecops_test)

## Sonarcloud

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ltllabs_devsecops_test&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ltllabs_devsecops_test)

## Thundra Foresight
[![Foresight Docs](https://foresight.service.thundra.io/public/api/v1/badge/test?repoId=36ef82e5-825a-4fd8-b7dd-e0720539dac0)](https://foresight.docs.thundra.io/)
[![Foresight Docs](https://foresight.service.thundra.io/public/api/v1/badge/success?repoId=36ef82e5-825a-4fd8-b7dd-e0720539dac0)](https://foresight.docs.thundra.io/)
[![Foresight Docs](https://foresight.service.thundra.io/public/api/v1/badge/utilization?repoId=36ef82e5-825a-4fd8-b7dd-e0720539dac0)](https://foresight.docs.thundra.io/)


# Additional notes for branch protection
Github offers branch protection features that help avoiding that someone tries to push to protected branches or forces a push

1. Go to the repository's settings tab -> branches
1. Add a branch protection rule and review its settings to match the needs of your use-case

# TODOs
Another possible addition is git hooks, which can run automatic actions before developers even try to push the code to the repo (they can be skipped, though)