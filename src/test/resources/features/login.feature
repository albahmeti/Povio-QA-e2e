Feature: Login functionality

@login @smoke
Scenario Outline: Verify that user can log in with valid credentials
    Given I navigate to the sign in page
    And I write email "<email>"
    And I write password "<password>"
    When I click on signin button
    Then I should see main page

    Examples:
        | email| password|
        | email@email.com | password|

