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
    WebElement welcomeTitle_xpath;
    @FindBy(xpath = "//button[contains(.,'Deposit')]")
    WebElement deposit_xpath;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToBeDeposited_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    WebElement depositButton_xpath;

    @FindBy(xpath = "//span[contains(.,'Deposit Successful')]")
    WebElement depositSuccess_xpath;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyThatTheCustomerSuccessfulLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(welcomeTitle_xpath));
        welcomeTitle_xpath.isDisplayed();
    }

    public void clickDeposit(){
        deposit_xpath.click();
    }

    public void enterAmountTobeDeposited(String deposit){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(amountToBeDeposited_xpath));
        amountToBeDeposited_xpath.sendKeys(deposit);
    }

    public void clickDepositButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(depositButton_xpath));
        depositButton_xpath.click();
    }

    public void verifyThatTheDepositWasSuccessful(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(depositSuccess_xpath));
        depositSuccess_xpath.isDisplayed();
    }
}
