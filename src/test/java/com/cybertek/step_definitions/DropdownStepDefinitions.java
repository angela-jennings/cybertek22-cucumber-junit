package com.cybertek.step_definitions;

import com.cybertek.pages.DropdownPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownStepDefinitions {
    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {
        //1. get dropdown as a select object
        Select monthDropdown = new Select(dropdownPage.months);

        //2. get all the dropdowns and store in a list
        List<WebElement> actualMonthsAsWebElements = monthDropdown.getOptions();

        //3. convert list of web element from List<Web Element> to List<String>
        List<String> actualMonthsAsString = new ArrayList<>();

        for (WebElement each : actualMonthsAsWebElements){
            actualMonthsAsString.add(each.getText());
        }





    }
}
