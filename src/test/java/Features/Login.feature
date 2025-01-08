@Test1
Feature: Signing in already existing user
  Scenario Outline: User is able to view after login
    Given User navigates to sign in page
    When User clicks on sign in button and enter email "<email>"
    And user enter the password "<password>"
    Then User should be able to view the Homepage
    Examples:
      |email                | password     |
     # |srikar36sai@gmail.com|Idontknow!3636|
       |uttej.338@gmail.com  |VUtej@1997     |


#Feature: Send a message to linkedin connection
  @Test2
  Scenario: User should be able to send a message
    Given User searches based on profile name
    When User find the profile and clicks on profile
    Then User clicks on message button and send a message


