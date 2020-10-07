## Table of contents
[Requirements](#requirements)  
[How to run the tests](#howToRunTheTests)
[Reports](#reports)

<a name="requirements"></a>
# Requirements
| Tools  | Versions | comments |
| ---    | ---      | --- |
| Java   | JDK 11   | can be downgraded to JDK 8, not mandatory to use JDK 11) |
| Maven  | 3.6.3    | latest stable |
| Chrome | v85      | latest stable |

<a name="howToRunTheTests"></a>
# How to run the tests
From the `serenity` folder execute the following maven command:
`mvn clean verify -Dcucumber.options="--tags '@sample'" -Dwebdriver.driver=chrome`

<a name="reports"></a>
# Reports
| type          | location | 
| ---           | ---      | 
| Serenity      | serenity/target/site/serenity/index.html |
| Cucumber json | serenity/target/cucumber-json-report.json | 
| Junit xml     | serenity/target/cucumber-junit-report.xml | 