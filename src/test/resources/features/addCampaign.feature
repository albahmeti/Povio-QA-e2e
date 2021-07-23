@addCamp @smoke
Feature: Add Campaign functionality

  Background: Verify that user can log in with valid credentials
    Given I navigate to the sign in page
    And I write email "email@email.com"
    And I write password "password"
    When I click on signin button
    Then I should see main page




  Scenario: Verify that user can navigate to add Campaign
    When I enter the sign in information
    And I click Campaigns
    Then I should see Campaign page
    And I click Add New Campaign
    Then I should be in the New Campaign page


    Scenario Outline:Verify that user can add Campaign
      Given I enter the sign in information
      And I click Campaigns
      Then I should see Campaign page
      When I click Add New Campaign
      And I write Name "<Name>"
      And I write Description "<description>"
      And I select Campaign "<type>"
      When I click on Create Campaign button
      Then I should see Campaign added to the table


      Examples:
        | Name | description | type |
        | Test | User is adding Campaign |One Time|
        | Test2| User is adding Campaign |Repeatable|










