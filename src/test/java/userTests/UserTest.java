package userTests;

import com.talentLMS.UI.driverFactory.dataProviders.ConfigReader;
import com.talentLMS.UI.users.BasePageUsers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserTest extends BaseUserTest {


    @BeforeMethod
    public void openLoginPage() {
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }

    @Test(description = "Verify that user can login with valid dates")
    public void loginWithValidDates(){
        loginPage.fillUpUsernameAndPassword("alibinali", "alibinali");
        assertEquals(adminHomePage.nameOfUser.getText(),"A. ALI");
        assertEquals(adminHomePage.statusOfUsers.getText(), "ADMINISTRATOR");


    }





}
