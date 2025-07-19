package LastStep_TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        //runing all testcase in one runner --for jenkins ---
        (features = {
        "src/test/resources/Feature/Valid_Credentials_TC01.feature",
        "src/test/resources/Feature/Dynamic_Credentials_forInvalid_TC02_03.feature"
        },
glue = { "org.example.StepsDefining" },
plugin = {
        "pretty",
        "html:target/HTMLReport.html",
        "json:target/cucumber.json"
        },
monochrome = true
        )
//        (features = { "src/test/resources/Feature/Valid_Credentials_TC01.feature" },
//        glue={ "org/example/StepsDefining" },
//        plugin = { "pretty","html:target/HTMLReport.html" }
//        )

public class Run_TC01_TC02_TC03 extends AbstractTestNGCucumberTests {
}
