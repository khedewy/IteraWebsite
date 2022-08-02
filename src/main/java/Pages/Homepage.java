package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase{
    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Practice")
    WebElement practiceLink;

    public void UserCangoTopracticePage(){
        ClickButton(practiceLink);
    }

    @FindBy(linkText = "Test Automation")
    WebElement testAutomationLNK;

    public void GoToAutomationPractice(){
        ClickButton(testAutomationLNK);
    }
    @FindBy(linkText = "Tutorial")
    WebElement TutorialLink;

    public void GoToTutorial(){
        ClickButton(TutorialLink);
    }

    @FindBy(linkText = "Sign Up")
    WebElement SignUpLink;

    public void GoToSignUpPage(){
        ClickButton(SignUpLink);
    }

    @FindBy(linkText = "Login")
    WebElement LoginLink;

    public void GoToLog(){
        ClickButton(LoginLink);
    }
    @FindBy(linkText = "Log out")
    WebElement logOutLink;

    public void setLogOutLink(){
        ClickButton(logOutLink);
    }
}
