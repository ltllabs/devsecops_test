## Code quality
- Code Climate
- Github codeql
## Vulnerabilities
- Snyk
- LGTM
- Github dependabot
## Coverage
The main discriminator between services is which type of reports they support out-of-the-box
    - Codecov 
        - lots of supported formats https://docs.codecov.com/docs/supported-report-formats
    - Code Climate
    - Coveralls 
        - Lots of supported languages, some with community-maintained plugins https://docs.coveralls.io/java
        - https://coveralls.io/features
        - [not set up in this demo to avoid cluttering the code, since we would have needed [this plugin](https://github.com/trautonen/coveralls-maven-plugin)]
    - Thundra Foresight
        - Java
            - JUnit, Selenium, Cucumber
        - JavaScript
            - Jest
        - Python
            - PyTest

List of other actions available on github
https://github.com/ltllabs/devsecops_test/actions/new?category=security