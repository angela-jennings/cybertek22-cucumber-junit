package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    //import from io.cucumber.java NOT from junit
    @Before ("@login") //would only apply to scenarios with @login tag
    public void setUpScenario(){
        System.out.println("--Setting up browser with further details--");
    }

    @After
    public void tearDownScenario(){
        System.out.println("--Teardown steps are being applied--");
        System.out.println();
        Driver.closeDriver();
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("*** setup applying for each step ***");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("*** teardown applying for each step ***");
    }
}
