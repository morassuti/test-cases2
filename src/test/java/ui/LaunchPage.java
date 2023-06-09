package ui;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage {

    public LaunchPage(WebDriver driver){
        super(driver);
    }

    public HomePage NavigateToHomePage() {
        driver.get("https://magento.softwaretestingboard.com/");

        return new HomePage(driver);
    }
}
