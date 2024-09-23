// package com.example.stepDefinitions;

// import com.example.pages.CheckoutPage;
// import com.example.utils.WebDriverManager;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import org.openqa.selenium.WebDriver;
// import org.testng.Assert;

// import java.util.logging.Logger;

// public class CheckoutSteps {
//     private WebDriverManager webDriverManager;
//     private WebDriver driver;
//     private CheckoutPage checkoutPage;
//     private static final Logger logger = Logger.getLogger(CheckoutSteps.class.getName());

//     @Before
//     public void setup() {
//         logger.info("Initializing WebDriver");
//         webDriverManager = new WebDriverManager();
//         driver = webDriverManager.getDriver();
//         checkoutPage = new CheckoutPage(driver);
//     }

//     @When("I enter first name {string}")
//     public void i_enter_first_name(String firstName) {
//         logger.info("Entering first name: " + firstName);
//         checkoutPage.enterFirstName(firstName);
//     }

//     @And("I enter last name {string}")
//     public void i_enter_last_name(String lastName) {
//         logger.info("Entering last name: " + lastName);
//         checkoutPage.enterLastName(lastName);
//     }

//     @And("I enter postal code {string}")
//     public void i_enter_postal_code(String postalCode) {
//         logger.info("Entering postal code: " + postalCode);
//         checkoutPage.enterPostalCode(postalCode);
//     }

//     @And("I click the continue button")
//     public void i_click_the_continue_button() {
//         logger.info("Clicking the continue button");
//         checkoutPage.clickContinueButton();
//     }

//     @And("I click the finish button")
//     public void i_click_the_finish_button() {
//         logger.info("Clicking the finish button");
//         checkoutPage.clickFinishButton();
//     }

//     @Then("I should see the checkout complete message")
//     public void i_should_see_the_checkout_complete_message() {
//         logger.info("Verifying checkout complete message");
//         Assert.assertTrue(checkoutPage.isCheckoutComplete());
//     }

//     @After
//     public void teardown() {
//         logger.info("Tearing down WebDriver");
//         webDriverManager.quitDriver();
//     }
// }


package com.example.stepDefinitions;

import com.example.pages.CheckoutPage;
import com.example.utils.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.logging.Logger;

public class CheckoutSteps {
    private WebDriverManager webDriverManager;
    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private static final Logger logger = Logger.getLogger(CheckoutSteps.class.getName());

    // @Before
    // public void setup() {
    //     logger.info("Initializing WebDriver");
    //     webDriverManager = new WebDriverManager();
    //     driver = webDriverManager.getDriver();
    //     checkoutPage = new CheckoutPage(driver);
    // }

    // @When("I enter first name {string}")
    // public void i_enter_first_name(String firstName) {
    //     logger.info("Entering first name: " + firstName);
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getFirstNameField()));
    //     checkoutPage.enterFirstName(firstName);
    // }

    // @And("I enter last name {string}")
    // public void i_enter_last_name(String lastName) {
    //     logger.info("Entering last name: " + lastName);
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getLastNameField()));
    //     checkoutPage.enterLastName(lastName);
    // }

    // @And("I enter postal code {string}")
    // public void i_enter_postal_code(String postalCode) {
    //     logger.info("Entering postal code: " + postalCode);
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getPostalCodeField()));
    //     checkoutPage.enterPostalCode(postalCode);
    // }

    // @And("I click the continue button")
    // public void i_click_the_continue_button() {
    //     logger.info("Clicking the continue button");
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(checkoutPage.getContinueButton()));
    //     checkoutPage.clickContinueButton();
    // }

    // @And("I click the finish button")
    // public void i_click_the_finish_button() {
    //     logger.info("Clicking the finish button");
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(checkoutPage.getFinishButton()));
    //     checkoutPage.clickFinishButton();
    // }

    // @Then("I should see the checkout complete message")
    // public void i_should_see_the_checkout_complete_message() {
    //     logger.info("Verifying checkout complete message");
    //     new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(checkoutPage.getCheckoutCompleteText()));
    //     Assert.assertTrue(checkoutPage.isCheckoutComplete());
    // }

    // @When("I proceed to checkout")
    // public void i_proceed_to_checkout() {
    //     logger.info("Proceeding to checkout");
    //     checkoutPage.clickCheckoutButton();
    //     sleep(2000); // 2 second delay
    // }

    // @After
    // public void teardown() {
    //     logger.info("Tearing down WebDriver");
    //     webDriverManager.quitDriver();
    // }

    // private void sleep(int milliseconds) {
    //     try {
    //         Thread.sleep(milliseconds);
    //     } catch (InterruptedException e) {
    //         Thread.currentThread().interrupt();
    //     }
    // }
}
