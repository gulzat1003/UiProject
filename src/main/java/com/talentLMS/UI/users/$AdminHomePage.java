package com.talentLMS.UI.users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class $AdminHomePage extends BasePageUsers{


    @FindBy(xpath = "//li[@id='tl-dropdown-roles']//b[1]")
    public WebElement statusOfUsers;

    @FindBy(xpath = "//span[contains(text(),'A. Ali')]")
    public WebElement nameOfUser;

}

//span[contains(text(),'A. Ali')]
//li[@id='tl-dropdown-roles']//span
