package org.example.StepsDefining;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CommonP_Locators.Login_Webele;
import org.openqa.selenium.By;


public class TC_01_Valid_Credentials {

    private Login_Webele Login;

    @Given("User Navigate to valid website URL")
    public void userNavigateValidUrl() {
        BrowserHooks.driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("Enter valid Username and valid Password")
    public void enterValidCredentials() {
        Login = new Login_Webele(BrowserHooks.driver);
        Login.EnterUsername("tomsmith");
        Login.EnterPassword("SuperSecretPassword!");
    }

    @And("Click on Login Button")
    public void clickedLogin() {
        Login.Clicked();
    }

    @Then("Login Succesfully and Redirected to Secure Area page")
    public void navigateSecureAreaPage() {
        String msg = BrowserHooks.driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println("✅ Message: " + msg);
    }
}
