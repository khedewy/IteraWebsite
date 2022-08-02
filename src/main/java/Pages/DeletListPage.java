package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletListPage extends PageBase{
    public DeletListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.btn.btn-link")
    WebElement backToListBtn;

    @FindBy(css = "input.btn.btn-outline-danger")
    WebElement deleteList;

    public void ReturnToLists(){
        ClickButton(backToListBtn);
    }

    public void DeleteItems(){
        ClickButton(deleteList);
    }
}
