package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLandingPage {
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    public static WebElement serachInputField;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")
    public static WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a[1]/h3")
    public static WebElement title;

    public static void navigateToGoogle(WebDriver driver) {
        driver.get("http://www.google.com");
    }
}
