package uiTest;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.driverFactory.dataProviders.ConfigReader;
import com.talentLMS.UI.pages.AdminHomePage;
import com.talentLMS.UI.pages.LoginPage;
import com.talentLMS.UI.pages.UserCourseList;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseUiTest {

    @BeforeMethod
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }
//
//    @Test(description = "Verify user can not login with invalid username")// Negative
//    public void loginWithInvalidUserNameTest1() {
//        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//        loginPage.fillUpUsernameAndPassword("testName", "Hekkloo");
//
//        String expectedErrMess = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
//        assertEquals(loginPage.loginErrMess.getText(), expectedErrMess);
//        webElementActions.pause(5000);
//
//    }
//    // Positive Test Case in my Page // Kiyal
//    @Test(description = "Verify user can not login with valid username")
//    public void loginWithValidUserNameTest(){
//    Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//    loginPage.fillUpUsernameAndPassword(myLogin, myPassword);
//        assertTrue(ConfigReader.getProperty("qa_env_1").contains("https://digitalnomads.talentlms.com/dashboard"));
//        webElementActions.pause(3000);
//    }
//
//
//    @Test(description = "Verify that user can login with valid credentials") // Positive Test Case
//    public void loginWithValidCredentials() {
//        loginPage.fillUpUsernameAndPassword("alibinali", "alibinali");
//        assertEquals(adminHomePage.users.getText(), "USERS");
//        assertEquals(driver.getCurrentUrl(), "https://alibinali.talentlms.com/dashboard");
//    }
//
//    @Test(description = "Verify user can not login with invalid username and valid password") //Negative
//    public void loginWithInvalidUserNameTest() {
//        loginPage.fillUpUsernameAndPassword("testName", "alibinali");
//        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
//        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
//    }
//
//    @Test(description = "Verify that user can not login with valid username and invalid password") //Negative
//    public void loginWithInvalidPasswordAndValidUserNameTest(){
//        loginPage.fillUpUsernameAndPassword("alibinali", "WrongPassword");
//        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
//        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
//    }
    @Test(description = "Verify that Admin can create new user in TalentLMS")
    public void createNewUserTest(){
        loginPage.fillUpUsernameAndPassword("alibinali", "alibinali");
        adminHomePage.clickAddUserBtn();
        assertEquals(driver.getCurrentUrl(),"https://alibinali.talentlms.com/user/create");
        addUserPage.createNewUser();
        assertEquals(addUserPage.coursesTab.getText(),"COURSE");
        webElementActions.pause(5000);
    }
    @Test(description = "Varify that admin can create new user and add a course")
    public void addNewUserCourse(){
        loginPage.fillUpUsernameAndPassword("alibinali", "alibinali");
        addCoursePage.clickAddCourseBtn();
        webElementActions.pause(3000);
        addCoursePage.fillUpAddCoursePage("Amazon", "Best course in the world!");
        addCoursePage.clickSaveBtn();
        addCoursePage.clickPlusBtn();
        addCoursePage.selectUserInTable();
        userCourseList.iterateCourseList();
        assertEquals(userCourseList.status, "LEARNER", "You made a mistake");

    }




    }

