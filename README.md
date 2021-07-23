# Povio-QA-e2e
Povio-QA-e2e is a automation framework for testing a WebApplication
This framework is created for end to end testing for user
The project uses Maven as a project managing tool for dependencies and plug-ins
It uses a Singleton Design Pattern



The tools that were used to create this project:
-----------------------------------------------
- Java language
- Maven
- Selenium WebDriver
- Cucumber - written in Gherkin language

How to run the project
----------------------

- In order for it to run it requires Maven library
- Download framwwork from https://github.com/albahmeti/Povio-QA-e2e/tree/master
- In order to execute the Step Definitions, the following should be written in terminal as maven goal:
        mvn verify -Dcucumber.options="--tags @smoke" ---> for smoke test
        mvn verify -Dcucumber.options="--tags @login" ---> to sign is as a user
        mvn verify -Dcucumber.options="--tags @signup" ---> to sign up a new user
        mvn verify -Dcucumber.options="--tags @editComp" --> to edit Campaign
        mvn verify -Dcucumber.options="--tags @addCamp" ---> to add Campaign

