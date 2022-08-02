package tests;

import Pages.Homepage;
import org.testng.annotations.Test;

public class PracticePageTest extends TestBase{

    Homepage homepage;

    @Test
    public void UserCanPractice(){
        homepage = new Homepage(driver);
        homepage.UserCangoTopracticePage();
    }
}
