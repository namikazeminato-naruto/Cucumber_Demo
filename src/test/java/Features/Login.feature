#@Test1
Feature: Signing in already existing user
  Scenario: User is able to view after login
    Given User navigates to sign in page
    When User clicks on sign in button and enter details
    Then User should be able to view the Homepage
#@Test2
#Feature: Send a message to linkedin connection
  Scenario: User should be able to send a message
    Given User searches based on profile name
    When User find the profile and clicks on profile
    Then User clicks on message button and send a message


