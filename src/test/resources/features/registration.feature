@signup @smoke
Feature: Registration functionality


  Scenario Outline: Verify that user can register successfully
    Given I navigate to the sign up page
    And I write name "<name>"
    And I write the email "<email>"
    And I write the password "<password>"
    And I confirm password "<password>"
    When I click on signup button
    Then I should see the main page


    Examples:
      |name | email| password|
      |nmae | e_mail@mail.com | password|
      |name | email@email.com | password|


    Scenario Outline: Verify that user cannot register with an already existing email
      Given I navigate to the sign up page
      And I write name "<name>"
      And I write the email "<email>"
      And I write the password "<password>"
      And I confirm password "<password>"
      When I click on signup button
      Then I should see Email has already been taken- message


      Examples:
        |name | email| password|
        |name | email@email.com | password|
