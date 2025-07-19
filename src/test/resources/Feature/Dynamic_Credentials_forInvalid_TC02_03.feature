Feature: Verify if user enter wrong or blank credentials
  Scenario Outline: Verify if user enter wrong or blank credentials
    Given User Navigate to website URL
    When  Enter "<Username>" and "<Password>"
    And   Click the Login Button
    Then  Login not succesfully and Error message is display
    Examples:
      | Username      | Password      |
      | wrongusername | wrongpassword |
      |               |               |
      | abc           | 123           |


