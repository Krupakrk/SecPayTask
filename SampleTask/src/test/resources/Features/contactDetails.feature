#https://www.youtube.com/watch?v=-fkMEj7wrAk
@smokeFeature
Feature: Fill contact details in the contact details form of the secure pay website

  @smoketest
  Scenario Outline: Enter the contact details in the contact details page
    Given I am google search page
    And I search for SecurePay on google
    When I click through the Securepay website
    And I verify that I am in the contact us page
    Then I generate random data
    And I use the generated data to fill in the contact us form
    Then I enter "message_text"
    And I close the browser
    
    Examples:
    |message_text|
    |my message  |   