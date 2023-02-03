package com.talentLMS.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCoursePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Add course')]")
    public WebElement addCourseBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputNameField;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    public WebElement categoryBtn;

    @FindBy(xpath = "//div[text()='Samples']")
    public WebElement categorySample;

    @FindBy(xpath = "//textarea[@placeholder='Add a course description up to 5000 characters']")
    public WebElement descriptionInputField;

    @FindBy(xpath = "//input[@value='Save and select users']")
    public WebElement saveAndSelectBtn;

    @FindBy(xpath = "(//i[@title='Enroll'])[1]")
    public WebElement iconPlus;


    @FindBy(xpath = "//a[@title='Home']")
    public WebElement homeBtn;

    @FindBy(xpath = "//div[@class='tl-bold-link']//a[contains(text(),'Users')]")
    public WebElement users;

    @FindBy(xpath = "//span[@title='J. Doe (John)']")
    public WebElement learner;

    @FindBy(xpath = "//a[contains(text(),'Courses')]")
    public WebElement courserBtn;


    public AddCoursePage clickSaveBtn() {
        elementActions.click(saveAndSelectBtn);
        return this;
    }

    public AddCoursePage clickPlusBtn(){
        elementActions.click(iconPlus);
        return this;
    }

    public AddCoursePage clickAddCourseBtn(){
        elementActions.click(addCourseBtn);
        return this;
    }


    public AddCoursePage fillUpAddCoursePage(String name, String description) {
        elementActions
                .sendKeys(inputNameField, name)
                .click(categoryBtn)
                .click(categorySample)
                .sendKeys(descriptionInputField, description);


        return this;
    }

    public AddCoursePage selectUserInTable(){
        elementActions
                .click(homeBtn)
                .click(users)
                .click(learner)
                .click(courserBtn);
        return this;
    }



}
