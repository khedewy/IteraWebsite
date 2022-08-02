package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.osgl.util.Str;

public class PageBase {

    protected WebDriver driver;
    public Select select;

    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setText(WebElement text, String value){
        text.sendKeys(value);
    }
    public void ClickButton(WebElement button){
        button.click();
    }

    public void clearElements(WebElement clear){
        clear.clear();
    }
}
