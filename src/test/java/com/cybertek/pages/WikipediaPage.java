package com.cybertek.pages;

import com.cybertek.step_definitions.WikipediaStepDefinitions;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
    public WikipediaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchField;

    @FindBy(id = "searchButton")
    public WebElement searchButton;

    @FindBy(id = "firstHeading")
    public WebElement headerOne;

    @FindBy(xpath = "//th//div[@style='display:inline']")
    public WebElement imageHeaderText;
}
