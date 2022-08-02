package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditListPage extends PageBase{
    public EditListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Name")
    WebElement nameTxt;

    @FindBy(id = "Company")
    WebElement companyTxt;

    @FindBy(id = "Address")
    WebElement addressTxt;

    @FindBy(id = "City")
    WebElement cityTxt;

    @FindBy(id = "Phone")
    WebElement phoneTxt;

    @FindBy(id = "Email")
    WebElement emailTxt;

    @FindBy(css = "input.btn.btn-primary")
    WebElement createBtn;

    @FindBy(css = "input.btn.btn-primary")
    WebElement saveBtn;

    public void editList(String city,String phone,String name, String comanyName) throws InterruptedException {
        clearElements(cityTxt);
        clearElements(phoneTxt);
        clearElements(nameTxt);
        clearElements(companyTxt);
        Thread.sleep(5000);
        setText(cityTxt,city);
        setText(phoneTxt,phone);
        setText(nameTxt,name);
        setText(companyTxt,comanyName);
        Thread.sleep(5000);
        ClickButton(saveBtn);



    }

}
