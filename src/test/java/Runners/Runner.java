package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepsDefinition"},
        tags = "",
        plugin = {"pretty", "html:Reports/cucumber.html"},
        publish = true)
public class Runner extends AbstractTestNGCucumberTests {
}
