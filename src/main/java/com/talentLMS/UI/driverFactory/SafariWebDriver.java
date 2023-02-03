package com.talentLMS.UI.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;


/**
 * @author Gulzat
 */
public class SafariWebDriver {

    public static WebDriver loadSafariDriver(){
        WebDriverManager.safaridriver().setup();
        SafariOptions options = new SafariOptions();


        WebDriver driver = new SafariDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
