package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsLogInPage extends PageBase{
    public DetailsLogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "searching")
    WebElement searchBox;

    @FindBy(css = "Create New")
    WebElement createList;

    @FindBy(css = "input.btn.btn-secondary.my-2.my-sm-0")
    WebElement searchBtn;

    @FindBy(css = "a.btn.btn-outline-primary")
    WebElement editBtn;

    @FindBy(css = "a.btn.btn-outline-danger")
    WebElement deleteBtn;

    @FindBy(css = "a.btn.btn-outline-info")
    WebElement detailsBtn;

    public void UserSearch(String emailAddress){
        setText(searchBox,emailAddress);
        ClickButton(searchBtn);
    }

    public void setCreateList(){
        ClickButton(createList);
    }
    public void setEditBtn(){
        ClickButton(editBtn);
    }

    public void setDeleteBtn(){
        ClickButton(deleteBtn);
    }

    public void setDetailsBtn(){
        ClickButton(detailsBtn);
    }
}
