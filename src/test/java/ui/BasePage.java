package ui;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {

    WebDriver driver;

    public void validateTitle(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
}
