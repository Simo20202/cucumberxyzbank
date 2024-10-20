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

    @Given("The user validate that your name label is displayed")
    public void the_user_validate_that_your_name_label_is_displayed() {
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
    @And("The user validate that login is successful")
    public void the_user_validate_that_login_is_successful() {
        accountPage.verifyThatTheCustomerSuccessfulLogin();

    }
    @And("The user select deposit")
    public void the_user_select_deposit() {
        accountPage.clickDeposit();

    }
    @And("The user enters the amount to be deposited{int}")
    public void the_user_enters_the_amount_to_be_deposited(Integer deposit) {
        accountPage.enterAmountTobeDeposited(String.valueOf(deposit));

    }
    @When("The user click deposit")
    public void the_user_click_deposit() {
        accountPage.clickDepositButton();

    }
    @Then("Deposit is successful confirmation message should be displayed")
    public void deposit_is_successful_confirmation_message_should_be_displayed() {
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

    @And("The user select the second account")
    public void the_user_select_the_second_account() {
        accountPage.selectAccountNumberTwo();

    }

    @Then("The user select the third account")
    public void the_user_select_the_third_account() {
        accountPage.selectAccountNumberThree();

    }

    // Scenario 3
    @And("The user select customer number three")
    public void the_user_select_customer_number_three() {
        homePage.selectCustomerNumberThree();

    }

    @And("The user validate the current balance")
    public void the_user_validate_the_current_balance() {
        accountPage.verifyTheAccBalance();

    }

    @And("The user select Transactions")
    public void the_user_select_transactions() {
        accountPage.clickTransactions();

    }

    @And("The user validate that the transaction appears")
    public void the_user_validate_that_the_transaction_appears() {
        accountPage.verifyThatTheTransactionsAppears();

    }

    @When("The user click Back button")
    public void the_user_click_back_button() {
        accountPage.clickBackButton();

    }

    @Then("The user return to the account page")
    public void the_user_return_to_the_account_page() {
        accountPage.verifyThatTheAccountPageIsDisplayed();

    }

    @And("The user select withdrawl")
    public void the_user_select_withdrawl() {
        accountPage.clickWithdrawl();

    }
    @And("The user enters the amount to be Withdrawn {int}")
    public void the_user_enters_the_amount_to_be_withdrawn(Integer withdraw) {
        accountPage.enterAmountTobeWithdrawn(String.valueOf(withdraw));

    }

    @When("The user click withdraw")
    public void the_user_click_withdraw() {
        accountPage.clickWithdrawButton();

    }
    @Then("Transaction is successful confirmation message should be displayed")
    public void transaction_is_successful_confirmation_message_should_be_displayed() {
        accountPage.verifyThatTheWithdrawWasSuccessful();

    }



    @After
    public void closeBrowser(){
        driver.quit();
    }
}
