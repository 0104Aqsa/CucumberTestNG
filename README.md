# 🥒 Cucumber TestNG Login Automation Framework

Automated testing of login functionality using **Cucumber**, **TestNG**, and **Selenium WebDriver**. Covers both **valid** and **invalid** login scenarios.

## 📁 Project Structure
src/ ├── main/java/org/example/ │   ├── CommonP_Locators/Login_Webele.java │   └── StepsDefining/ │       ├── BrowserHooks.java │       ├── TC_01_Valid_Credentials.java │       ├── TC02_03_Wrong_Blank_Credentials.java │   └── Main.java
├── test/java/LastStep_TestRunner/ │   ├── Run_TC01.java │   └── Run_TC02_03.java
├── test/resources/Feature/ │   ├── Valid_Credentials_TC01.feature │   └── Dynamic_Credentials_forInvalid_TC02_03.feature
target/ ├── HTMLReport.html ├── HTMLReport1.html ├── HTMLReport2.html
.gitignore pom.xml README.md

## 🧪 Technologies Used

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven

## 📝 Feature Files

### ✅ Valid Login
`Valid_Credentials_TC01.feature`
```gherkin
Scenario: Login with valid credentials
  Given user launches browser
  When user enters valid username and password
  Then user should land on the dashboard


### ✅ INValid Login

Scenario Outline: Login with invalid or blank credentials
  Given user launches browser
  When user enters "<username>" and "<password>"
  Then user should see appropriate error message

Examples:
  | username  | password  |
  | wronguser | wrongpass |
  |           |    |
  | abc       | 123      |
