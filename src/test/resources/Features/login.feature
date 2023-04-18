Feature: Login to FreeCRM

  Scenario: Login to FreeCRM
    Given User navigates to URL
#    And User clicks on login
#    And User enters the username and password
    And User enters the "jainarihant1296@gmail.com" and "Testing@123"
    When User clicks on login
#    Then I close the browser
    Then I close all the browser

#    When User clicks on login
#    And User waits for 10 seconds
#    Then User should be able to login

#  Scenario Outline: Login to FreeCRM
#    Given User navigates to URL
##    And User clicks on login
##    And User enters the username and password
#    And User enters the "<username>" and "<password>"
#    When User clicks on login
#    Then I close the browser
#    Examples:
#      | username                  | password    |
#      | jainarihant1296@gmail.com | Testing@123 |
#      | tom                       | jerry       |