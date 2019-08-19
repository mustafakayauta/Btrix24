Feature: As a user I should be able to create a task from activity stream.

  Background:
    Given User on the landing page
    Then User login as a "helpdesk" user
    And Navigate to "Task" module
    Then Click on New Task button
    When Fill out the Things to do box

  @newTask
  Scenario: User can create new task by clicking on tasks on activity stream.

    Then Click on Add Task

  @uploadFileNewTask
  Scenario:User can upload a file and image or link or add checklist regarding to new task.

    And Click on Upload icon
    Then Click on Upload files and images
    And  Choose a file or image from the computer
    Then Click on Add Task

  @setDeadlineNewTask
  Scenario: User should be able to set up a deadline for new task.

    Then Click on the Deadline box
    And Select a future date
    Then Click on Add Task