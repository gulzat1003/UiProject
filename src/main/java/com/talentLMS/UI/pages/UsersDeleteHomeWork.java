package com.talentLMS.UI.pages;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

//public class UsersDeleteHomeWork extends BasePage {

    //@Test(dependsOnMethods = {"toAdd"})
    //    public void testWebTable(){
    //
    //        WebElement table = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
    //        List<WebElement> allRows = table.findElements(By.className("rt-tr-group"));
    //
    //        for (WebElement row: allRows) {
    //            List<WebElement> allColumns = row.findElements(By.className("rt-td"));
    //            for (WebElement column: allColumns) {
    //                if(column.getText().equals(firstName)){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(),firstName);
    //                }
    //                if(column.getText().equals(lastName)){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(),lastName);
    //                }
    //                if(column.getText().equals(email)){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(),email);
    //                }
    //                if(column.getText().equals(String.valueOf(age))){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(),String.valueOf(age));
    //                }
    //                if(column.getText().equals(String.valueOf(salary))){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(), String.valueOf(salary));
    //                }
    //                if(column.getText().equals(department)){
    //                    System.out.println(column.getText());
    //                    Assert.assertEquals(column.getText(),department);
    //                }
    //            }
//    @FindBy(xpath = "//div[@class='outter-table-wrapper']")
//    public WebElement usersBox;

//    @FindBy(xpath = "//tr[@role='row']")
//    public List<WebElement> allUserList;
//
//    @FindBy(xpath = "//td/span")
//    public List<WebElement> allStatusOfUsers;
//
//    @FindBy(xpath = "//i[@class='icon-remove icon-grid']")
//    public List<WebElement> allDeleteBtn;
//
//    @FindBy(id = "#tl-confirm-submit")
//    public WebElement deleteOkBtn;
//
//    public UsersDeleteHomeWork deletingUsers(){
//        for (WebElement userList:allUserList) {
//            elementActions.moveToElement(userList);
//            for (WebElement statusOfUser:allStatusOfUsers) {
//                elementActions.moveToElement(statusOfUser);
//                if(!statusOfUser.getText().equals("SuperAdmin")){
//                    for (WebElement toDeleteBtn:allDeleteBtn) {
//                        elementActions.click(toDeleteBtn);
//                        deleteOkBtn.click();
//                    }
//                }
//                else System.out.println("You are SuperAdmin");
//            }
//
//        }
//        return this;
//    }
//
//
//
//
//}
