package tests;

import Pages.DetailsLogInPage;
import Pages.Homepage;
import Pages.LogINPage;
import Pages.SignUpPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SearchAccount extends TestBase {

    Homepage homepage;
    SignUpPage sign;
    LogINPage log;
    DetailsLogInPage details;

    @DataProvider(name = "UserData")
    public Object[][] Userdata() throws IOException {

        return  new Object[][]{
                {"mahmoud","khedewy","qqw","12345","mahmoud","password12"}
        };




        //ExcelReader data = new ExcelReader();
        //return data.getExcelData();

    }


    @Test(dataProvider = "UserData")
    public void UserCanSearchAccount(String firstName, String surName, String ePost, String mobile, String userName, String password ) throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.GoToSignUpPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sign = new SignUpPage(driver);
        sign.UserRegister(firstName,surName,ePost,mobile,userName,password);
        Thread.sleep(6000);
        homepage.GoToLog();
        Thread.sleep(3000);
        log = new LogINPage(driver);
        log.Login(userName,password);
        Thread.sleep(6000);
        details = new DetailsLogInPage(driver);
        details.UserSearch("mahmoud");
        details.setEditBtn();
        Thread.sleep(6000);

    }



}
