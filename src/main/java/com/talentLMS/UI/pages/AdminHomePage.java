package com.talentLMS.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Gulzat
 */
public class AdminHomePage extends BasePage {

    @FindBy(xpath = "//div[@class='tl-bold-link']//a[contains(text(),'Users')]")
    public WebElement users;

    @FindBy(xpath = "(//div[@class='hidden-phone'])[1]/a")
    public WebElement addUserBtn;

    public AdminHomePage clickAddUserBtn() {
        elementActions.click(addUserBtn);
        return this;
    }


}
