package StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//features="src/test/resources/Features"
//"src/test/java/StepDefs"

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features",
        glue={"classpath:StepDefs"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        monochrome = true)
public class TestRunner {

}
