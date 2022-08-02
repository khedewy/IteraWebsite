package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatDetails extends PageBase{
    public CreatDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.btn.btn-primary")
    WebElement createListBtn;
    public void GoToCreateList(){
    ClickButton(createListBtn);
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


    public void CreatList(String name, String company, String adress,String city, String phone, String email) throws InterruptedException {
        setText(nameTxt,name);
        setText(companyTxt,company);
        setText(addressTxt,adress);
        setText(cityTxt,city);
        setText(phoneTxt,phone);
        setText(emailTxt,email);
        Thread.sleep(3000);
        ClickButton(createBtn);
    }

}
