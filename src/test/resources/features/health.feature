Feature: HealthCheck functionality

  @health
  Scenario: Verify that user can navigate
    Given I navigate to the login page
    When I click on sign in button
    Then I get the sign in page
    When I click on sign up button
    Then I get the sign up page
    When I click on home button
    Then I get the home page
