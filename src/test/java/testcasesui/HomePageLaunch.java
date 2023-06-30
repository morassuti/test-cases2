package testcasesui;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageLaunch extends BasePage {
    WebDriver driver;

    @Test
    public void openBrowser(){
        driver = startBrowser();
        driver.findElement(By.linkText("Sign In")).click();
    }
    @Test
    public void testcreateanAccount(){
        driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
    }
    @Test
    public void testEnterName(){
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='firstname']"));
        element.sendKeys("flaviotest@gmail.com");
    }
}
