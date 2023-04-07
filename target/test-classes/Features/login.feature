Feature: Login to FreeCRM

  Scenario: Login to FreeCRM
    Given User navigates to URL
#    And User clicks on login
    And User enters the username and password
    When User clicks on login
    Then I close the browser

#    When User clicks on login
#    And User waits for 10 seconds
#    Then User should be able to login