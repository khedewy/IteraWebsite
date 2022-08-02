package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver driver) {
        super(driver);
        WebDriver driver1;
    }
    @FindBy(id = "FirstName")
    WebElement firstNameTxt;

    @FindBy(id = "Surname")
    WebElement surNameTxt;

    @FindBy(id = "E_post")
    WebElement ePostTxt;

    @FindBy(id = "Mobile")
    WebElement mobileTxt;

    @FindBy(id = "Username")
    WebElement userNameTxt;

    @FindBy(id = "Password")
    WebElement passwordTxt;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxt;

    @FindBy(id = "submit")
    WebElement submitBtn;

    public void UserRegister(String firstName, String surName, String ePost, String mobile, String userName, String password) throws InterruptedException {
        setText(firstNameTxt,firstName);
        setText(surNameTxt,surName);
        setText(ePostTxt,ePost);
        setText(mobileTxt,mobile);
        setText(userNameTxt,userName);
        setText(passwordTxt,password);
        setText(confirmPasswordTxt,password);
        Thread.sleep(3000);
        ClickButton(submitBtn);

    }
}
