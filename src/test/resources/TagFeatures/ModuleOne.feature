@PhaseOne
Feature: Contact and Deal functions

@RegressionTest
Scenario: Create new contact
Given User must login
When create a new contact

@SmokeTest
Scenario: View a contact
Given User must login
When User view a contact

@RegressionTest
Scenario: Edit a contact
Given User must login
When User edit a contact details

@SmokeTest
Scenario: Create new deal
Given User must login
When User create a new deal

@RegressionTest @SmokeTest
Scenario: View a deal
Given User must login
When User view a deal details

@IntegrationTest
Scenario: User logout
Given User must login
When User logout from app