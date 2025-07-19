package LastStep_TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (features = { "src/test/resources/Feature/Valid_Credentials_TC01.feature" },
        glue={ "org/example/StepsDefining" },
        plugin = { "pretty","html:target/HTMLReport.html" }
        )

public class Run_TC01 extends AbstractTestNGCucumberTests {
}
