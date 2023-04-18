Feature: Free CRM create contacts
  Scenario: Create contact in Free CRM
    Given User navigates to URL
    And User enters the "jainarihant1296@gmail.com" and "Testing@123"
    When User clicks on login
    Then User moves to new contact page
    Then User enters "Arihant" , "Jain" and "QA"

#    Then I close the browser
    Then I close all the browser

  Scenario Outline: Create contact in Free CRM
#    Given User navigates to URL
    Given User navigates to "https://ui.cogmento.com/"
    And User enters the "<Username>" and "<Password>"
    When User clicks on login
    And User moves to new contact page
    And User enters "<FirstName>" , "<LastName>" and "<Department>"
    Then I close all the browser
    Examples:
      | Username                  | Password    | FirstName | LastName | Department |
      | jainarihant1296@gmail.com | Testing@123 | Arihant   | Jain     | QA         |