package com.talentLMS.UI.driverFactory;

import com.talentLMS.UI.driverFactory.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;
/**
 * @author Gulzat
 */
public class Driver {

    private Driver(){
        //Singleton pattern

    }
    // Driver.getDriver()
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "fireFox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();

                case "safari":
                    driver = SafariWebDriver.loadSafariDriver();

                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }

        return driver;
    }
    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }

        }catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
