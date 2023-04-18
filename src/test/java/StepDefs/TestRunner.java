package StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//features="src/test/resources/Features"
//"src/test/java/StepDefs"

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Features", //path of the feature files
        glue={"classpath:StepDefs"}, //path of the step definitions
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/json-output.json","junit:reports/junit-report.xml"}, //to generate reporting format
        dryRun = true, //When it is true it would check if any of the step definitions are missing
        monochrome = true, //displaying the output in the readable format
        tags = "@Test")
public class TestRunner {

}
