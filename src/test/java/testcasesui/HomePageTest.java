package testcasesui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class HomePageTest {
    private static final String TARGET_URL = "https://magento.softwaretestingboard.com/";
    private WebDriver driver;
    @BeforeMethod
    public WebDriver startBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(TARGET_URL);
        return driver;
    }

    @Test
    public void openBrowserTest(){
        driver = startBrowser();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='firstname']"));
        element.sendKeys("flaviotest@gmail.com");

    }
    /*@Test
    public void testcreateanAccount(){
        driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
    }*/
    /*@Test
    public void testEnterName(){
        WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='firstname']"));
        element.sendKeys("flaviotest@gmail.com");
    }*/
    /*@AfterMethod
    public void teardown() {
        driver.quit();
    }*/
}
