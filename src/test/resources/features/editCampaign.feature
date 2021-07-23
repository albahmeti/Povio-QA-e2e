@editCamp @smoke
Feature: Add Campaign functionality

  Background: Verify that user can log in with valid credentials
    Given I navigate to the sign in page
    And I write email "email@email.com"
    And I write password "password"
    When I click on signin button
    Then I should see main page


  Scenario: Verify that user can edit a Campaign
    When I click Campaigns
    Then I should see Campaign page
    And I select a Campaign to edit "Campaign 5"
    Then I should see Campaign edit form
    And I update the fields "Name", "Description", "Repeatable"
    Then I click on Update button
    And I should see success message
