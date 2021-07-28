@etsy
Feature: TC#24: Etsy Search Functionality Title Verification
  1. User is on https://www.etsy.com
  2. User types Wooden Spoon in the search box
  3. User clicks search button
  4. User sees Wooden Spoon is in the title
  Note: Follow POM
Background:
  Given user is on the Etsy landing page

  Scenario: Etsy default title verification
    Then user should see Etsy title as expected

  Scenario: Etsy search title verification
    When user types "wooden spoon" in the search box and clicks search
    Then user should see "wooden spoon" in the title
