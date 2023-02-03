package com.talentLMS.UI.helper;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
/**
 * @author Gulzat
 */
public class WebElementActions {

    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementActions click(WebElement element){
        waitElementToBeClickAble(element);
        element.click();
        return this;
    }
    public WebElementActions sendKeys(WebElement element,String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions sendKeysWithClear(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.COMMAND + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(txt);
        return this;
    }
    public WebElementActions pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("Error");
        }
        return this;
    }
}