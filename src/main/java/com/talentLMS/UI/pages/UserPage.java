//package com.talentLMS.UI.pages;
//
//import com.talentLMS.UI.helper.WebElementActions;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import java.util.List;
//
//public class UserPage extends BasePage {
//
//    @FindBy(id = "#tl-confirm-submit")
//    public WebElement deleteOkBtn;
//    @FindBy(xpath = "//table[@id='tl-users-grid']")
//    public WebElement list;
//    @FindBy(xpath = "//tr[@role='row']")
//    public List<WebElement> allUserList;
//    @FindBy(xpath = "//td/span")
//    public List<WebElement> allStatusOfUsers;
//    @FindBy(xpath = "//i[@class='icon-remove icon-grid']")
//    public List<WebElement> allDeleteBtn;

//    public UserPage deletingUsers(){
//        for (WebElement userList: allUserList) {
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
//}