
Feature: Wikipedia Search Functionality

  @wiki
  Scenario: TC#25: Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box and User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title
    @wiki
    Scenario: TC#26: Wikipedia Search Functionality Header Verification
      Given User is on Wikipedia home page
      When User types "Steve Jobs" in the wiki search box and User clicks wiki search button
      Then User sees "Steve Jobs" is in the main header
      @wiki
      Scenario: TC#27: Wikipedia Search Functionality Image Header Verification
        Given User is on Wikipedia home page
        When User types Steve Jobs in the wiki search box and User clicks wiki search button
        Then User sees Steve Jobs is in the image header



@scenarioOutline
  Scenario Outline: TC#26: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box and User clicks wiki search button
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedTitle>" is in the wiki title

    Examples: search terms we will use in this template is as below:
      | searchValue     | expectedMainHeader | expectedTitle   |
      | Steve Jobs      | Steve Jobs         | Steve Jobs      |
      | Albert Einstein | Albert Einstein    | Albert Einstein |
      | Nikola Tesla    | Nikola Tesla       | Nikola Tesla    |
      | Lady Gaga       | Lady Gaga          | Lady Gaga       |
      | Harry Potter    | Harry Potter       | Harry Potter    |
      | Sylvia Plath    | Sylvia Plath       | Sylvia Plath    |


