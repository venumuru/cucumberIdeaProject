package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,features="src/test/resources/feature"
        ,glue={"StepDefinitions"}
        ,monochrome=true
        ,publish = true
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
