Feature: Login page

  Scenario Outline: Signup to the page
    Given User enters the desired capabilities
    When User clicks on signup button
    And User enters the data in the signup window

    Given User enter the "<username>" and "<password>"
    When User clicks on login button
    Then User close the page

    Examples:
      | username            | password |
      | divjot123@gmail.com | password |

