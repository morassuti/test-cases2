package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterUsername extends BasePage{

    @FindBy(id=Constants.LOGIN_ID)
    WebElement loginUsername;

    public EnterUsername (WebDriver driver){
        super(driver);
    }

    public void submitUsername(String userid){
        loginUsername.sendKeys(userid);
        //explicit wait
        //driver.findElement(By.cssSelector("button#nextbtn > span")).click();
    }
}
