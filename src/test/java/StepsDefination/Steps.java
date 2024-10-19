package StepsDefination;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Base {


    @Given("The user is on the XYZ Banking home page")
    public void the_user_is_on_the_xyz_banking_home_page() {
        homePage.verifyThatXYZBankHomeIsDisplayed();

    }
    @And("The user click customer login")
    public void the_user_click_customer_login() {
        homePage.clickCustomerLogin();

    }

    @Given("The user validates that your name label is displayed")
    public void the_user_validates_that_your_name_label_is_displayed() {
        homePage.verifyThatYourNameLabelIsDisplayed();

    }
    @And("The user select a customer name")
    public void the_user_select_a_customer_name() {
        homePage.selectCustomerName();


    }
    @And("The user click login")
    public void the_user_click_login() {
        homePage.clickLoginButton();

    }
    @And("The user validates that login is successful")
    public void the_user_validates_that_login_is_successful() {
        accountPage.verifyThatTheCustomerSuccessfulLogin();

    }
    @And("The user select deposit")
    public void the_user_select_deposit() {
        accountPage.clickDeposit();

    }
    @And("The user enters deposit{int}")
    public void the_user_enters_deposit(Integer deposit) {
        accountPage.enterAmountTobeDeposited(String.valueOf(deposit));

    }
    @When("The user click deposit")
    public void the_user_click_deposit() {
        accountPage.clickDepositButton();

    }
    @Then("The Deposit is successful")
    public void the_deposit_is_successful() {
        accountPage.verifyThatTheDepositWasSuccessful();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
