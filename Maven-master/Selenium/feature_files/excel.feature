@second
Feature: To automate the Registration & To verify application allows teacher to add new course
  I want to use this template for my feature file

  @exceltc1
  Scenario: To verify whether administrator can add the user
    Given I launch application
    Then I entered username "admin"
    And I entered password "admin@123"
    Then I click submit button
    When I click add user link
    Then I enter first name
    And I entered last name
    And I entered email id
    And I entered phone number
    And I entered the Login credential text-box
    Then I select password radio button
    And I entered password for user
    And I  select profile trainer
    When I click add button
    Then Verify the message
    And Delete user

  @testcase2
  Scenario: To verify whether application allows teacher to add new course
    Given I have launch the learning application
    Then I have entered the teacher login "teacher001"
    And I have entered the teacher password "teacher001"
    And I have click submit button
    When I have click on create a course
    Then I have enter the course name
    And I have click on advanced setting
    And I have entered category list
    And I have entered the course code
    And I have entered the language
    And I have click on create a course button
    Then I have click on add add a intro icon
    And I have entered the valid credential
    And I have click save intro text
    Then I have verified message
