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

    @FindBy(xpath = "//label[contains(.,'Your Name :')]")
    WebElement yourName_xpath;

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement yourNameDrp_xpath;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_xpath;

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

    public void verifyThatYourNameLabelIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourName_xpath));
        yourName_xpath.isDisplayed();

    }

    public void selectCustomerName(){
        Select dropdown = new Select(yourNameDrp_xpath);
        dropdown.selectByVisibleText("Hermoine Granger");
    }

    public void clickLoginButton(){
        login_xpath.click();
    }

}
