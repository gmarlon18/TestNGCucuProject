package testRunner;

import TestBase.BaseT;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions( strict = true,
        features = "Features/Scenario#1.feature" ,
        glue= {"stepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports/Scenario#1.json" },
        monochrome = true
        )


public class Runner extends AbstractTestNGCucumberTests{

    @Parameters({"appURL","userValue","passValue"})
    @BeforeClass
    public static void setUpScenario(String appURL, String user, String pass) {
        BaseT.BeforeClass(appURL, user, pass);
    }


}
