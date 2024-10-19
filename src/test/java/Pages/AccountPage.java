package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement WelcomeTitle_xpath;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyThatTheCustomerSuccessfulLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(WelcomeTitle_xpath));
        WelcomeTitle_xpath.isDisplayed();
    }
}
