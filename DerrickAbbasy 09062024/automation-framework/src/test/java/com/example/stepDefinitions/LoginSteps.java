package com.example.stepDefinitions;

import com.example.pages.LoginPage;
import com.example.pages.CheckoutPage;
import com.example.utils.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.logging.Logger;

public class LoginSteps {
    private WebDriverManager webDriverManager;
    private WebDriver driver;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());

    @Before
    public void setup() {
        logger.info("Initializing WebDriver");
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        logger.info("Navigating to the login page");
        driver.get("https://www.saucedemo.com/");
        sleep(2000); // 2 second delay
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        logger.info("Entering username: " + username);
        loginPage.enterUsername(username);
        sleep(2000); // 2 second delay
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        logger.info("Entering password");
        loginPage.enterPassword(password);
        sleep(2000); // 2 second delay
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        logger.info("Clicking the login button");
        loginPage.clickLoginButton();
        sleep(2000); // 2 second delay
    }

    @And("I should be redirected to the products page")
    public void i_should_be_redirected_to_the_products_page() {
        logger.info("Verifying redirection to the products page");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        sleep(2000); // 2 second delay
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedMessage) {
        logger.info("Verifying error message: " + expectedMessage);
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(), expectedMessage);
        sleep(2000); // 2 second delay
    }

    // @When("I add a product to the cart")
    // public void i_add_a_product_to_the_cart() {
    //     logger.info("Adding a product to the cart");
    //     driver.findElement(By.cssSelector(".inventory_item button")).click(); // Add the first product to the cart
    // }

    // @And("I click the shopping cart icon")
    // public void i_click_the_shopping_cart_icon() {
    //     logger.info("Clicking the shopping cart icon");
    //     driver.findElement(By.id("shopping_cart_container")).click(); // Click the cart icon
    // }

    // @And("I proceed to checkout")
    // public void i_proceed_to_checkout() {
    //     logger.info("Proceeding to checkout");
    //     checkoutPage.clickCheckoutButton();
    // }

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        logger.info("Adding a product to the cart");
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".inventory_item button"))).click();
        sleep(3000); //  3 second delay
    }

    @And("I click the shopping cart icon")
    public void i_click_the_shopping_cart_icon() {
        logger.info("Clicking the shopping cart icon");
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id("shopping_cart_container"))).click();
        sleep(3000); //  3 second delay
    }

    @And("I proceed to checkout")
    public void i_proceed_to_checkout() {
        logger.info("Proceeding to checkout");
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(checkoutPage.getCheckoutButton())).click();
        sleep(3000); // 3 second delay
    }


    @When("I enter first name {string}")
    public void i_enter_first_name(String firstName) {
        logger.info("Entering first name: " + firstName);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getFirstNameField()));
        sleep(3000); // 3 second delay
        checkoutPage.enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void i_enter_last_name(String lastName) {
        logger.info("Entering last name: " + lastName);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getLastNameField()));
        sleep(3000); // 3 second delay
        checkoutPage.enterLastName(lastName);
    }

    @And("I enter postal code {string}")
    public void i_enter_postal_code(String postalCode) {
        logger.info("Entering postal code: " + postalCode);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(checkoutPage.getPostalCodeField()));
        sleep(3000); // 3 second delay
        checkoutPage.enterPostalCode(postalCode);
    }

    @And("I click the continue button")
    public void i_click_the_continue_button() {
        logger.info("Clicking the continue button");
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(checkoutPage.getContinueButton()));
        sleep(3000); // 3 second delay
        checkoutPage.clickContinueButton();
    }

    @And("I click the finish button")
    public void i_click_the_finish_button() {
        logger.info("Clicking the finish button");
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(checkoutPage.getFinishButton()));
        sleep(3000); // 3 second delay
        checkoutPage.clickFinishButton();
    }

    @Then("I should see the checkout complete message")
    public void i_should_see_the_checkout_complete_message() {
        logger.info("Verifying checkout complete message");
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(checkoutPage.getCheckoutCompleteText()));
        sleep(3000); // 3 second delay
        Assert.assertTrue(checkoutPage.isCheckoutComplete());
    }

    @After
    public void teardown() {
        logger.info("Tearing down WebDriver");
        webDriverManager.quitDriver();
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
