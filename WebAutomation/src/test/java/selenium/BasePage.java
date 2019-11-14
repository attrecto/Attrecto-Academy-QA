package selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver, Class aClass) {
        this.driver = driver;
        PageFactory.initElements(driver, aClass);

        try {
            setup();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public static void setup() throws MalformedURLException {
        if(driver == null) {
            driver = new ChromeDriver();
        }
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
