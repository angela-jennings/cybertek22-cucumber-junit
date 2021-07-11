#TC#50: Create a new feature file and new scenarios
#1. Create a new feature file named Login.feature
#2. Create 3 new scenarios from the below provided user story.
#3. User Story:
#As a user, I should be able to login with correct credentials to different accounts.
#And dashboard should be displayed.
#Accounts are: librarian, student, admin
#4. Create a new step definition class under step_definitions package
#named: LoginStepDefs
#5. Run the code. Get the step definitions from the console
#6. No Java-selenium code implementation needed. Just add printing line in the
#implementation regarding what should be happening when the code is ran.
#Ex: “User is on the login page
  @newWIP
  Feature: Library app login feature
    User Story:
    As a user, I should be able to login with correct credentials to different accounts and the dashboard should   be displayed

    @Librarian
    Scenario: Logging in as librarian
      Given User is on the library home page
      When User enters correct librarian username
      And User enters correct librarian password
      Then User should see the dashboard

    @Student
    Scenario: Logging in as student
      Given User is on the library home page
      When User enters correct student username
      And User enters correct student password
      Then User should see the dashboard

    @Admin
    Scenario: Logging in as admin
      Given User is on the library home page
      When User enters correct admin username
      And User enters correct admin password
      Then User should see the dashboard