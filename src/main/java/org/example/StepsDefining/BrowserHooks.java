package org.example.StepsDefining;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserHooks {
    public static WebDriver driver; // Shared reference for step classes

    @Before
    public void setUp() {
        System.out.println("✅ Launching Chrome browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }

    @After
    public void tearDown() {
        System.out.println("🧹 Closing Chrome browser...");
        driver.quit();
    }
}
