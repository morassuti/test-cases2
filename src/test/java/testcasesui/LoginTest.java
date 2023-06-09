package testcasesui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.EnterUsername;
import ui.HomePage;
import ui.LaunchPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void loginTest(){
        //Extent Reports
        //rep.log
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options); //Launch
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        LaunchPage lp = new LaunchPage(driver);
        //LaunchPage lp = PageFactory.initElements(driver, LaunchPage.class);
        HomePage hp = lp.NavigateToHomePage();
        //hp.validateTitle("Testing");
        EnterUsername enterUsername = hp.gotoLoginPage();
        enterUsername.submitUsername("flaviotest@gmail.com");

    }
}
