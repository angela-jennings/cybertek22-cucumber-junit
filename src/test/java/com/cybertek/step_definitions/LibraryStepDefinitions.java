package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryStepDefinitions {
    @Given("User is on the library home page")
    public void user_is_on_the_library_home_page() {
        System.out.println("User is on library home page");
    }
    @When("User enters correct librarian username")
    public void user_enters_correct_librarian_username() {
        System.out.println("User has entered correct librarian username");
    }
    @When("User enters correct librarian password")
    public void user_enters_correct_librarian_password() {
        System.out.println("User has entered correct librarian password");
    }
    @Then("User should see the dashboard")
    public void userShouldSeeTheDashboard() {
        System.out.println("User sees the correct dashboard");
    }


    @When("User enters correct student username")
    public void user_enters_correct_student_username() {
        System.out.println("User has entered correct student username");
    }
    @When("User enters correct student password")
    public void user_enters_correct_student_password() {
        System.out.println("User has entered correct student password");
    }


    @When("User enters correct admin username")
    public void user_enters_correct_admin_username() {
        System.out.println("User has entered correct admin username");
    }
    @When("User enters correct admin password")
    public void user_enters_correct_admin_password() {
        System.out.println("User has entered correct admin password");
    }

}


