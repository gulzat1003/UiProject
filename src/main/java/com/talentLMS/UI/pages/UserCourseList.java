package com.talentLMS.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserCourseList extends BasePage{
    public String status;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> allCourseList;

    @FindBy(xpath = "//span[@class='tl-course-name']")
    public List<WebElement> allCourseName;

    public UserCourseList iterateCourseList() {
        for (WebElement courseRow: allCourseList) {
            if(courseRow.findElement(By.xpath("//span[@class='tl-course-name']"))
                    .getText().equals("Amazon")){

                status = courseRow.findElement(By.xpath("//a[@class='label label-learner']")).getText();


            }

        }
        return this;
    }
}
