Feature: Login

  Scenario: valid Login
    
    Given the user enters the url
    When the user enters valid credentials
    Then should login to the home page
