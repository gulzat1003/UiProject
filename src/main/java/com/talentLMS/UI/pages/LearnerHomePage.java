package com.talentLMS.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Gulzat
 */
public class LearnerHomePage extends BasePage{

    @FindBy(xpath = "//b[text()='Learner']")
    public WebElement learnerButton;


    public LearnerHomePage learnerButton(){
        elementActions.click(learnerButton);
        return this;

    }
}
