Feature: Select Checkbox For Band

  Scenario Outline: Selecting the checkbox against a specific name
    Given I am on the PrimeReact selection page
    When I select the checkbox against "<name>"
    Then the checkbox against "<name>" should be selected

    Examples:
      | name              |
      | Blue Band         |
      | Chakra Bracelet   |
      | Gaming Set        |