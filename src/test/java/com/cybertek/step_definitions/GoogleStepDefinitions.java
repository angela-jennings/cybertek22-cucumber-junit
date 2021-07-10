package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://google.com");
    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expInTitle));
    }
    @Then("User should see title as Google")
    public void user_should_see_title_as_google() {
       String actTitle = Driver.getDriver().getTitle();
       String expTitle = "Google";
       Assert.assertTrue(actTitle.equals(expTitle));

    }

}
