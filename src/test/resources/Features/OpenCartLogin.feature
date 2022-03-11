Feature: OpenCart Login function

  #Scenario: Valid Login
  #When User is on Opencart home page
  #When User navigates to login page
  #Given User login with credentials
  #Then User navigate to my account page
  #Scenario: Valid Login
  #When User is on Opencart home page
  #When User navigates to login page
  #Given User login with "tonystark1234@gmail.com" and "Tony@1234"
  #Then User navigate to my account page
  #Scenario Outline: Valid Login
  #When User is on Opencart home page
  #When User navigates to login page
  #Given User login with "<email>" and "<password>"
  #Then User navigate to my account page
  #
  #Examples:
  #| email                   | password   |
  #| tonystark1234@gmail.com | Tony@1234  |
  #| trainer12@gmail.com     | testuser12 |
  #Scenario: Invalid Login
  #When User is on Opencart home page
  #When User navigates to login page
  #Given User login with "selenium@gmail.com" and "test123"
  #Then User navigate to my account page
  Scenario: Search Item
    When User is on Opencart home page
    When User navigates to login page
    Given User login with credentials
      | email                   | pwd       |
      | tonystark1234@gmail.com | Tony@1234 |
    Then User navigate to my account page
    And User search item
      | phone |
