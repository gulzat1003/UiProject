package com.talentLMS.UI.users;

import com.talentLMS.UI.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Gulzat
 */
public class $LoginPage extends BasePageUsers {

//    @FindBy(xpath = "//a[text()='Home']")
//    public WebElement homeBtn;
//
//    @FindBy(id = "tl-cms-nav-login")
//    public WebElement loginBtn;

//    @FindBy(css = ".avatar-square")
//    public WebElement digitalNomadsLogo;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLoginBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;



//    public LoginPage clickLoginBtn(){
//        elementActions.click(loginBtn);
//        return this;
//    }

    public $LoginPage fillUpUsernameAndPassword(String userName, String password){
        elementActions.sendKeys(usernameInput,userName)
                .sendKeys(passwordInput,password);
        elementActions.click(submitLoginBtn);
        return this;

    }

}
