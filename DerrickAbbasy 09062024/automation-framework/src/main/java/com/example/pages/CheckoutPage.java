////Draft

// package com.example.pages;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import java.util.logging.Logger;

// public class CheckoutPage {
//     private WebDriver driver;
//     private WebDriverWait wait;
//     private static final Logger logger = Logger.getLogger(CheckoutPage.class.getName());

//     private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
//     private By shoppingCartIcon = By.id("shopping_cart_container");
//     private By checkoutButton = By.id("checkout");
//     private By firstNameField = By.id("first-name");
//     private By lastNameField = By.id("last-name");
//     private By postalCodeField = By.id("postal-code");
//     private By continueButton = By.id("continue");
//     private By finishButton = By.id("finish");
//     private By checkoutCompleteText = By.xpath("//span[@data-test='title']");

//     public CheckoutPage(WebDriver driver) {
//         this.driver = driver;
//         this.wait = new WebDriverWait(driver, 20); // Increased wait time to 20 seconds
//     }

//     public void clickAddToCart() {
//         logger.info("Clicking Add to Cart button");
//         waitUntilPageIsFullyLoaded();
//         wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
//     }

//     public void clickShoppingCart() {
//         logger.info("Clicking Shopping Cart icon");
//         waitUntilPageIsFullyLoaded();
//         wait.until(ExpectedConditions.elementToBeClickable(shoppingCartIcon)).click();
//     }

//     public void clickCheckoutButton() {
//         logger.info("Clicking Checkout button");
//         waitUntilPageIsFullyLoaded();
//         wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
//     }

//     public void enterFirstName(String firstName) {
//         logger.info("Entering first name: " + firstName);
//         wait.until(ExpectedConditions.presenceOfElementLocated(firstNameField)).sendKeys(firstName);
//     }

//     public void enterLastName(String lastName) {
//         logger.info("Entering last name: " + lastName);
//         wait.until(ExpectedConditions.presenceOfElementLocated(lastNameField)).sendKeys(lastName);
//     }

//     public void enterPostalCode(String postalCode) {
//         logger.info("Entering postal code: " + postalCode);
//         wait.until(ExpectedConditions.presenceOfElementLocated(postalCodeField)).sendKeys(postalCode);
//     }

//     public void clickContinueButton() {
//         logger.info("Clicking Continue button");
//         wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
//     }

//     public void clickFinishButton() {
//         logger.info("Clicking Finish button");
//         wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
//     }

//     public boolean isCheckoutComplete() {
//         return wait.until(ExpectedConditions.presenceOfElementLocated(checkoutCompleteText)).isDisplayed();
//     }

//     public By getFirstNameField() {
//         return firstNameField;
//     }

//     public By getLastNameField() {
//         return lastNameField;
//     }

//     public By getPostalCodeField() {
//         return postalCodeField;
//     }

//     public By getContinueButton() {
//         return continueButton;
//     }

//     public By getFinishButton() {
//         return finishButton;
//     }

//     public By getCheckoutCompleteText() {
//         return checkoutCompleteText;
//     }

//     private void waitUntilPageIsFullyLoaded() {
//         wait.until(driver -> {
//             String state = ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return document.readyState").toString();
//             return state.equals("complete");
//         });
//     }
// }


package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;

    // Define locators
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By checkoutCompleteText = By.className("complete-header");
    private By checkoutButton = By.id("checkout");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to get the WebElements
    public By getFirstNameField() {
        return firstNameField;
    }

    public By getLastNameField() {
        return lastNameField;
    }

    public By getPostalCodeField() {
        return postalCodeField;
    }

    public By getContinueButton() {
        return continueButton;
    }

    public By getFinishButton() {
        return finishButton;
    }

    public By getCheckoutCompleteText() {
        return checkoutCompleteText;
    }

    public By getCheckoutButton() {
        return checkoutButton;
    }

    // Methods to interact with the elements
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public boolean isCheckoutComplete() {
        return driver.findElement(checkoutCompleteText).isDisplayed();
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
}
