package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},features="src/test/resources/feature",glue={"StepDefinitions"})
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
