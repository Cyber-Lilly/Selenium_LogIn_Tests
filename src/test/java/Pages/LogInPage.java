package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseTest {

public LogInPage(){
    PageFactory.initElements(driver,this);

}

@FindBy(id = "username")
    public WebElement username;

@FindBy(id = "password")
public WebElement password;

@FindBy(className = "radius")
public WebElement submit;

@FindBy(id = "flash")
public WebElement flashMessage;


public void enterDataUserName(String user){
username.clear();
username.sendKeys(user);

}

public void enterDataPassword(String pass){
password.clear();
password.sendKeys(pass);
}

public void clickSubmitButton(){
    submit.click();
}



}


