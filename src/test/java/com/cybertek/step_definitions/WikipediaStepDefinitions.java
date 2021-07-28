package com.cybertek.step_definitions;

import com.cybertek.pages.WikipediaPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.awt.dnd.DragGestureEvent;

public class WikipediaStepDefinitions {
    WikipediaPage wikipediaPage = new WikipediaPage();;

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }
    @When("User types Steve Jobs in the wiki search box and User clicks wiki search button")
    public void user_types_steve_jobs_in_the_wiki_search_box_and_user_clicks_wiki_search_button() {
        wikipediaPage.searchField.sendKeys("Steve Jobs");
        wikipediaPage.searchButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expTitle = "Steve Jobs - Wikipedia";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expTitle, actTitle);
    }
    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
       String expHeader = "Steve Jobs";
       String actHeader = wikipediaPage.headerOne.getText();

       Assert.assertEquals(expHeader, actHeader);
    }
    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {
        String expImageText = "Steve Jobs";
        String actImageText = wikipediaPage.imageHeaderText.getText();

        Assert.assertEquals(expImageText, actImageText);
    }


    @When("User types {string} in the wiki search box and User clicks wiki search button")
    public void userTypesInTheWikiSearchBoxAndUserClicksWikiSearchButton(String arg0) {
        wikipediaPage.searchField.sendKeys(arg0);
        wikipediaPage.searchButton.click();
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String expHeader = arg0;
        String actHeader = wikipediaPage.headerOne.getText();

        Assert.assertEquals(expHeader, actHeader);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String expTitle = arg0 + " - Wikipedia";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expTitle, actTitle);
    }
}
