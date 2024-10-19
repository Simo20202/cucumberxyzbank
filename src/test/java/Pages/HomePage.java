package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(.,'Home')]")
    WebElement home_xpath;

    @FindBy(xpath = "//button[contains(.,'Customer Login')]")
    WebElement customerLogin_xpath;

    @FindBy(xpath = "userSelect")
    WebElement yourName_id;

    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    public void verifyThatXYZBankHomeIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(home_xpath));
        home_xpath.isDisplayed();
    }

    public void clickCustomerLogin(){
        customerLogin_xpath.click();
    }

    public void selectYourName(){
        Select dropdown = new Select(yourName_id);
        dropdown.selectByVisibleText("Hermoine Granger");
    }

}
