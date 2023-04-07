package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginSteps {

    WebDriver driver;

    @Given("^User navigates to URL$")
    public void action(){
        System.setProperty("webdriver.chrome.driver","/Users/arihant/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
//        driver.get("https://freecrm.com/");
        System.out.println("Testing given");
    }
    @When("^User clicks on login$")
    public void users_clicks_login(){
        driver.findElement(By.xpath("//div [@class='ui fluid large blue submit button']")).click();
        System.out.println("Clicking the login button");
        driver.findElement(By.xpath("//div [@class='ui fluid large blue submit button']")).click();
        System.out.println("Testing when");
    }
    @When("^Title of the login page is google$")
    public void title_of_the_login_page(){
        System.out.println("Testing title");
        String title = driver.getTitle();
        System.out.println(title);
//        Assert.assertEquals("Google", title);
    }

    @And("User enters the username and password")
    public void enters_username_password(){
        System.out.println("Testing and");
        driver.findElement(By.name("email")).sendKeys("jainarihant1296@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Testing@123");
    }
    @Then("^I close the browser$")
    public void iCloseTheBrowser() {
        System.setProperty("webdriver.chrome.driver","/Users/arihant/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
        driver.quit();
    }
}
