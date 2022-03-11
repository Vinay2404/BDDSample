@PhaseTwo
Feature: Task functions

@RegressionTest
Scenario: Create a task
Given User must login
When create a new task

@SmokeTest
Scenario: View a task
Given User must login
When User view a task

Scenario: Edit a task
Given User must login
When User edit task details