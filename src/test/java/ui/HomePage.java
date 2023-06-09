package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage extends BasePage{

    @FindBy(css = "login-az")
    WebElement signIn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public EnterUsername gotoLoginPage(){
        signIn.click();
        return new EnterUsername(driver);
    }

}
