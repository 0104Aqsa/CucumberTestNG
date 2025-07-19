package org.example.CommonP_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Webele {


        private WebDriver driver;

        By Locate_Username = By.id("username");
        By Locate_Password=By.id("password");
        By Locate_Submit=By.xpath("//button[@type='submit']");

    public Login_Webele(WebDriver driver) {
        this.driver=driver;
    }
        public void EnterUsername(String Username) {
            driver.findElement(Locate_Username).sendKeys(Username);    }
        public void EnterPassword(String Password){
            driver.findElement(Locate_Password).sendKeys(Password);    }
        public void Clicked(){
            driver.findElement(Locate_Submit).click();
        }
    }


