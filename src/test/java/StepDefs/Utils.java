package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    WebDriver driver;

    @And("^User waits for 10 seconds$")
    public void waitFor10Seconds() throws InterruptedException {
        driver.wait(10000);
    }
}
