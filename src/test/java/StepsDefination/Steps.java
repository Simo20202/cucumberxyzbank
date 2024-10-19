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
    @And("The user select customer number one")
    public void the_user_select_customer_number_one() {
        homePage.selectCustomerNumberOne();


    }
    @And("The user click login")
    public void the_user_click_login() {
        homePage.clickLogin();

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

    @And("The user Logout")
    public void the_user_logout() {
        homePage.clickLogout();

    }

    // Scenario 2
    @And("The user select customer number two")
    public void the_user_select_customer_number_two() {
        homePage.selectCustomerNumberTwo();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
