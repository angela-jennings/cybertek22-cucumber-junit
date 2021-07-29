package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signIn;

    /*
    login method that logs in with specific username
     */
    public void studentLoginToLibrary(){
        emailInput.sendKeys("student");
        passwordInput.sendKeys("password");
        signIn.click();
    }
    public void adminLoginToLibrary(){
        emailInput.sendKeys("admin");
        passwordInput.sendKeys("password");
        signIn.click();
    }
    /*
    login by accepting configuration file
     */
    public void librarianLoginToLibrary(){
        emailInput.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        signIn.click();
    }

    /*
    login method controlled from configuration properties
     */
    public void loginToLibrary(){
        emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        signIn.click();
    }

    /*
    creating a login method that accepts parameters
     */
    public void login(String username, String password){
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();
    }

}
