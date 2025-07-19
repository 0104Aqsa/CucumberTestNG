Feature: Login page Automation
  Scenario: Verify the login is success with Valid Login
Given User Navigate to valid website URL
When  Enter valid Username and valid Password
And   Click on Login Button
Then  Login Succesfully and Redirected to Secure Area page
