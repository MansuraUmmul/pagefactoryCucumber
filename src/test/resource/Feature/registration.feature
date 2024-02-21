Feature: Valid Registration and Login

  Scenario: Registration
  
    Given url entered by the user
    When the User clicks on the sign in button
    And the User clicks on the Register Now button
    And the User successfully fills the User Information section
    And the User successfully fills the Profile Information section
    And the User successfully fills the Account Information section
    And the User clicks on the Save Account Information button
    Then the User is redirected to a Broken Link
    And the User captures a screenshot
