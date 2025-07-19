package LastStep_TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions
        (
                features = { "src/test/resources/Feature/Dynamic_Credentials_forInvalid_TC02_03.feature" },
                glue ={ "org/example/TC02_03_Wrong_Blank_Credentials" },
                plugin = { "pretty","html:target/HTMLReport.html" }
        )
public class Run_TC02_03  extends AbstractTestNGCucumberTests {

}
