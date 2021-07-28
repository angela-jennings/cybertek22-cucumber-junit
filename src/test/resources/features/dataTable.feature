Feature: Example of Cucumber date table implementations

  @dataTable
  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
    #To align pipes - ctrl + alt + L

  @librarywip
  Scenario: Library login example using data table
    Given user is on the login page of library app
    When user enters username and password as below
      | username | librarian13@library.com |
      | password | 9rf6axdD                |
    Then user should see title is something
