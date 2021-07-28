package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyStepDefinitions {
    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expTitle, actTitle);
    }

    @When("user types {string} in the search box and clicks search")
    public void user_types_in_the_search_box_and_clicks_search(String searchItem) {
        EtsyPage etsyPage = new EtsyPage();
        etsyPage.searchBar.sendKeys(searchItem + Keys.ENTER);

    }
    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String searchItem) {
        String expTitle = searchItem + " | Etsy";
        String actTitle = Driver.getDriver().getTitle();

       Assert.assertTrue(expTitle.equalsIgnoreCase(actTitle));
    }

}
