package com.talentLMS.UI.users;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.driverFactory.dataProviders.MockDataGenerator;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Gulzat
 */
public abstract class BasePageUsers {
    WebElementActions elementActions = new WebElementActions();
    MockDataGenerator mock = new MockDataGenerator();
    public BasePageUsers(){
        PageFactory.initElements(Driver.getDriver(),/*LoginPage.class*/this);
    }
}
