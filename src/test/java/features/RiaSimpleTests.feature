Feature: check current result

#  @smoke
  Scenario Outline: check search engine functionality

    Given Main page is opened
    When I chose <model>  and <mark> of the car
    And click submit button
    Then the search results contains <result>

    Examples:
| model | mark    | result        |
| Skoda | Octavia | Skoda Octavia |


  @smoke
  Scenario Outline: check if logged user

    Given Main page is opened
    When login to account by <social>
    Then user is logged <result>

    Examples:
| social   | result |
| Facebook | Юрий   |
