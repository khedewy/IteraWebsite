package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.osgl.util.S;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestAutomationPage extends PageBase{
    public TestAutomationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "name")
    WebElement NameTxt;

    @FindBy(id = "phone")
    WebElement PhoneTxt;

    @FindBy(id = "email")
    WebElement EmailTxt;

    @FindBy(id = "password")
    WebElement passwordTxt;

    @FindBy(id = "address")
    WebElement addressTxt;

    @FindBy(css = "button.btn.btn-primary")
    WebElement submitBtn;

    @FindBy(id = "male")
    WebElement GenderBtn;

    @FindBy(id = "friday")
    WebElement DayBtn;

    @FindBy(css = "select.custom-select")
    WebElement CountryList;

    @FindBy(css = "label.custom-control-label")
    WebElement ExperienceBtn;

    @FindBy(css = "label.custom-control-label")
    WebElement TestNgBtn;

    public void UserINformation(String name, String phone, String email, String password, String address) throws InterruptedException {
        setText(NameTxt,name);
        setText(EmailTxt,phone);
        setText(PhoneTxt,phone);
        setText(passwordTxt,email);
        setText(addressTxt,password);
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        ClickButton(submitBtn);
        ClickButton(GenderBtn);
        ClickButton(DayBtn);
        select = new Select(CountryList);
        select.selectByIndex(3);
        ClickButton(ExperienceBtn);
        ClickButton(TestNgBtn);


    }


}
