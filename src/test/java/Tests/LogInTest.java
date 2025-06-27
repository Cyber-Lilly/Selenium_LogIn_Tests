package Tests;

import Base.BaseTest;
import Pages.LogInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LogInTest extends BaseTest {

    public LogInPage logInPage;

@BeforeMethod
    public void setUpPage(){

driver.manage().window().maximize();
driver.navigate().to("https://the-internet.herokuapp.com/login");

logInPage = new LogInPage();


}

@Test
    public void validLoginTest(){

    String username = excelReader.getStringData("Sheet1", 1,0);
    String password = excelReader.getStringData("Sheet1", 1,1);

    logInPage.enterDataUserName(username);
    logInPage.enterDataPassword(password);
    logInPage.clickSubmitButton();
    String message = logInPage.flashMessage.getText();
    System.out.println("Message from page: " + message);



}

@Test
    public void invalidUsernameValidPassword(){
    String username = excelReader.getStringData("Sheet1", 2,0);
    String password = excelReader.getStringData("Sheet1", 2,1);

    logInPage.enterDataUserName(username);
    logInPage.enterDataPassword(password);
    logInPage.clickSubmitButton();
    String message = logInPage.flashMessage.getText();
    System.out.println("Message from page: " + message);
}

@Test
    public void validUserNameInvalidPassword(){
    String username = excelReader.getStringData("Sheet1", 3,0);
    String password = excelReader.getStringData("Sheet1", 3,1);
    logInPage.enterDataUserName(username);
    logInPage.enterDataPassword(password);
    logInPage.clickSubmitButton();
    String message = logInPage.flashMessage.getText();
    System.out.println("Message from page: " + message);

}

    @Test
    public void invalidUserNameInvalidPassword(){
        String username = excelReader.getStringData("Sheet1", 4,0);
        String password = excelReader.getStringData("Sheet1", 4,1);
        logInPage.enterDataUserName(username);
        logInPage.enterDataPassword(password);
        logInPage.clickSubmitButton();
        String message = logInPage.flashMessage.getText();
        System.out.println("Message from page: " + message);

    }
}


