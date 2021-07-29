package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java NOT from junit
    @Before ("@wiki") //would only apply to scenarios with @ tag
    public void setUpScenario(){
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @After ()
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

//    @BeforeStep
//    public void setUpStep(){
//        System.out.println("*** setup applying for each step ***");
//    }
//    @AfterStep
//    public void afterStep(){
//        System.out.println("*** teardown applying for each step ***");
//    }
}
