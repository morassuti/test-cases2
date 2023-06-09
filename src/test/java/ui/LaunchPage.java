package ui;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage {

    public LaunchPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage NavigateToHomePage() {
        driver.get("https://magento.softwaretestingboard.com/");
        // create object of Home Page and pass the driver
        // Initializes objects
        return PageFactory.initElements(driver, HomePage.class);
    }
}
