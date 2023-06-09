package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends BasePage{

    @FindBy(css = Constants.LOGIN_LINK)
    WebElement signIn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public EnterUsername gotoLoginPage(){
        signIn.click();
        return new EnterUsername(driver);
    }

}
