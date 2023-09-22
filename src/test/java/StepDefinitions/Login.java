package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bson.assertions.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver;
    @Given("user is on the application login page")
    public void loginPage()  {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("Title of the page "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();
        System.out.println("user is on application login page");
    }

    @When("user submits valid username and password")
    public void enterValidUserNameAndPassword(){
        System.out.println("User provides valid username and password");
    }

    @When("user submits invalid username and password")
    public void enterInvalidUserNameAndPassword(){
        System.out.println("User provides invalid username and password");
    }

    @Then("application takes the user to dashboard page")
    public void validateSuccessfulLogin(){
        System.out.println("Application dashboard page is displayed to the user");
    }

    @Then("application throws error message for invalid credentials")
    public void validateUnsuccessfulLogin(){
        System.out.println("Unsuccessful login error message is displayed");
    }

}
