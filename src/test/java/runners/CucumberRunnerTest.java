package runners;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},features="src/test/resources/feature",glue={"StepDefinitions"})
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
