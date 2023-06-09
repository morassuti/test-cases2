package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterUsername extends BasePage{
    public EnterUsername (WebDriver userid){
        this.driver = driver;
    }

    public void submitUsername(String userid){
        driver.findElement(By.id("login_id")).sendKeys(userid);
        //explicit wait
        driver.findElement(By.cssSelector("button#nextbtn > span")).click();
    }
}
