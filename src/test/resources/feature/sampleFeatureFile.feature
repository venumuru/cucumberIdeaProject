Feature: Validation of sample application pages

  @LoginValid @SanityCheck
  Scenario: Validate user able to login with valid credentials
    Given user is on the application login page
    When user submits valid username and password
    Then application takes the user to dashboard page

  @LoginInvalid @SanityCheck
  Scenario: Validate user not able to login with invalid credentials
    Given user is on the application login page
    When user submits invalid username and password
    Then application throws error message for invalid credentials