package com.talentLMS.UI.pages;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.driverFactory.dataProviders.MockDataGenerator;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Gulzat
 */
public abstract class BasePage {
WebElementActions elementActions = new WebElementActions();
MockDataGenerator mock = new MockDataGenerator();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),/*LoginPage.class*/this);
    }

}
