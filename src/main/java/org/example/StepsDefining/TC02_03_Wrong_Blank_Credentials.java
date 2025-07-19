package org.example.StepsDefining;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
public class TC02_03_Wrong_Blank_Credentials {

    @Given("User Navigate to website URL")
    public void userOnWebsiteLink() {
        BrowserHooks.driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("Enter {string} and {string}")
    public void enterCredentials(String Username, String Password) {
        BrowserHooks.driver.findElement(By.id("username")).sendKeys(Username);
        BrowserHooks.driver.findElement(By.id("password")).sendKeys(Password);
    }

    @And("Click the Login Button")
    public void clickLoginButton() {
        BrowserHooks.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Login not succesfully and Error message is display")
    public void loginFailed() {
        String msg = BrowserHooks.driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println("🚫 Error Message: " + msg);
    }
}
