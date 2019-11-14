package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLandingTest extends BasePage{

    public GoogleLandingTest() {
        super(driver, GoogleLandingPage.class);
    }

    @Test
    public void Test1() throws InterruptedException {
        GoogleLandingPage.navigateToGoogle(driver);
        Thread.sleep(2000);
        GoogleLandingPage.serachInputField.sendKeys("ToolsQA");
        Thread.sleep(2000);
        GoogleLandingPage.searchButton.click();
        Thread.sleep(2000);

        String title = GoogleLandingPage.title.getText();
        Assert.assertTrue("The text of the element was wrong. Expected: Tools QA, Actual: " + title, title == "Tools QA");

    }
}