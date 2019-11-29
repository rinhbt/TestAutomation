package thainguyen.core.config.driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverFactoryTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }
}
