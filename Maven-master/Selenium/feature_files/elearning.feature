@Registration
Feature: To automate the Registration & To verify whether application allows teacher to add new course
  I want to use this template for my feature file

  @Registration
  Scenario: To verify whether administrator can add the user
    Given I launch the application
    Then I entered the username "admin"
    And I entered the password "admin@123"
    Then I click the submit button
    When I click on add user link
    Then I enter the first name
    And I entered the last name
    And I entered the email id
    And I entered the phone number
    And I entered Login credential text-box
    Then I select the password radio button
    And I entered the password for user
    And I  select the profile trainer
    When I click on add button
    Then Verify message
    And Delete the user



  @addcourse
  Scenario: To verify whether application allows teacher to add new course
    Given I launch the learning application
    Then I entered the teacher login "teacher001"
    And I entered the teacher password "teacher001"
    And submit button
    When I click on create a course
    Then I enter the course name
    And I click on advanced setting
    And I entered category list
    And I entered the course code
    And I entered the language
    And I click on create a course button
    Then I click on add add a intro icon
    And I entered the valid credential
    And I click save intro text
    Then Verification message
