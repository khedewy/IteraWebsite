package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogINPage extends PageBase{
    public LogINPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Username")
    WebElement userNameTxt;

    @FindBy(id = "Password")
    WebElement passwordTxt;

    @FindBy(name = "login")
    WebElement LogInBtn;

    @FindBy(name = "clear")
    WebElement clearBtn;

    public void Login(String userName, String password) throws InterruptedException {
        setText(userNameTxt,userName);
        setText(passwordTxt,password);
        Thread.sleep(3000);
        ClickButton(LogInBtn);
    }
}
