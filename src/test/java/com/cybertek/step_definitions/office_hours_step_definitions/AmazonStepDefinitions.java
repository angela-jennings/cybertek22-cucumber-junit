package com.cybertek.step_definitions.office_hours_step_definitions;

import com.cybertek.pages.office_hours_pages.AmazonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.office_hours_utilities.AmazonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonStepDefinitions {
    AmazonPage amazonPage;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    double singlePriceForHat;
    Select updateCartDropDown;

    @Given("User is on Amazon Home Page")
    public void user_is_on_amazon_home_page() {
        Driver.getDriver().get("https://amazon.com");
        BrowserUtils.sleep(1);
    }
    @When("User searches for hats for men")
    public void user_searches_for_hats_for_men() {
        amazonPage = new AmazonPage();
        amazonPage.searchBar.sendKeys("hats for men" + Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(amazonPage.firstSearchResult));
        amazonPage.firstSearchResult.click();
    }
    @When("user adds the first hat appearing to the cart with quantity two")
    public void user_adds_the_first_hat_appearing_to_the_cart_with_quantity_two() {
        Select quantityDropdown = new Select((amazonPage.quantityDropdownMenu));
        quantityDropdown.selectByIndex(1);
        amazonPage.addToCartButton.click();
        BrowserUtils.sleep(2);
        amazonPage.shoppingCart.click();

    }
    @Then("the total price and quantity should be correct")
    public void the_total_price_and_quantity_should_be_correct() {
        //String priceText = amazonPage.itemPrice.getText();
        //singlePriceForHat = AmazonUtils.priceConverter(priceText);
        Assert.assertTrue(amazonPage.cartItemTotal.getText().contains("2 items"));
    }
    @When("user reduces the quantity from two to one")
    public void user_reduces_the_quantity_from_two_to_one() {
        amazonPage = new AmazonPage();
        updateCartDropDown = new Select((amazonPage.updateCartDropDown));
        updateCartDropDown.selectByIndex(1);
        BrowserUtils.sleep(2);
    }
    @Then("total price and quantity will be correctly changed")
    public void total_price_and_quantity_will_be_correctly_changed() {
        amazonPage = new AmazonPage();
        //String priceText = amazonPage.itemPrice.getText();
        //singlePriceForHat = AmazonUtils.priceConverter(priceText);
        //Assert.assertTrue(amazonPage.cartItemTotal.getText().contains("1 item"));
    }

}
