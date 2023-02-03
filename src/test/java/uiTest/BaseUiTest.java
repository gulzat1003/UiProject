package uiTest;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {
    String myLogin = "gulzat.aldashova.ch@gmail.com";
    String myPassword = "gulzat.aldashova.ch";
    LoginPage loginPage;
    WebElementActions webElementActions;
    WebDriver driver;
    AdminHomePage adminHomePage;
    AddCoursePage addCoursePage;

    AddUserPage addUserPage;
    UserCourseList userCourseList;
    @BeforeClass
    public void setUpUiTest(){
        loginPage = new LoginPage();
        adminHomePage = new AdminHomePage();
        webElementActions = new WebElementActions();
        addUserPage = new AddUserPage();
        driver = Driver.getDriver();
        addCoursePage = new AddCoursePage();
        userCourseList = new UserCourseList();

    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
