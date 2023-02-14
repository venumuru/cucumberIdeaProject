package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver;
    @Given("user is on the application login page")
    public void loginPage() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
/*        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");*/
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);*/
        driver.get("https://www.google.com");
        driver.close();
        System.out.println("Title of the page "+driver.getTitle());
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
