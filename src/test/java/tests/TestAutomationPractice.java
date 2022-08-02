package tests;

import Data.ExcelReader;
import Pages.Homepage;
import Pages.TestAutomationPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestAutomationPractice extends TestBase{
    Homepage homepage;
    TestAutomationPage testAutomationPage;

   @Test
    public void UserCanPractice() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        homepage = new Homepage(driver);
        homepage.GoToAutomationPractice();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        testAutomationPage = new TestAutomationPage(driver);
        testAutomationPage.UserINformation("mahmoud","12345","qw@gmail.com","12345","ssd123");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }
}
