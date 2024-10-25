package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPagePOM {

    // Variables
    private WebDriver driver;

    // Locators
    private By registration = By.xpath("//a[normalize-space()='Register']");
    private By customerFirstName = By.id("customer.firstName");
    private By customerLastName = By.id("customer.lastName");
    private By customerAddress = By.id("customer.address.street");
    private By customerCity = By.id("customer.address.city");
    private By customerState = By.id("customer.address.state");
    private By customerZipCode = By.id("customer.address.zipCode");
    private By customerPhoneNo = By.id("customer.phoneNumber");
    private By customerSSN = By.id("customer.ssn");
    private By customerUserName = By.id("customer.username");
    private By customerPassword = By.id("customer.password");
    private By customerConfirmPassword = By.id("repeatedPassword");
    private By customerRegisterButton = By.xpath("//input[@value='Register']");
  //input[@value='Register']
    // Constructor to initialize WebDriver
    public RegistrationPagePOM(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for interactions

    // Method to click the registration link
    public void clickRegistrationLink() {
        driver.findElement(registration).click();
    }

    // Method to enter the first name
    public void enterFirstName(String firstName) {
        driver.findElement(customerFirstName).sendKeys(firstName);
    }

    // Method to enter the last name
    public void enterLastName(String lastName) {
        driver.findElement(customerLastName).sendKeys(lastName);
    }

    // Method to enter the address
    public void enterAddress(String address) {
        driver.findElement(customerAddress).sendKeys(address);
    }

    // Method to enter the city
    public void enterCity(String city) {
        driver.findElement(customerCity).sendKeys(city);
    }

    // Method to enter the state
    public void enterState(String state) {
        driver.findElement(customerState).sendKeys(state);
    }

    // Method to enter the ZIP code
    public void enterZipCode(String zipCode) {
        driver.findElement(customerZipCode).sendKeys(zipCode);
    }
    
 // Method to enter the phone no
    public void enterPhoneNo(String phoneNo) {
        driver.findElement(customerPhoneNo).sendKeys(phoneNo);
    }

    // Method to enter the SSN
    public void enterSSN(String ssn) {
        driver.findElement(customerSSN).sendKeys(ssn);
    }

    // Method to enter the username
    public void enterUserName(String userName) {
        driver.findElement(customerUserName).sendKeys(userName);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        driver.findElement(customerPassword).sendKeys(password);
    }

    // Method to confirm the password
    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(customerConfirmPassword).sendKeys(confirmPassword);
    }

    // Method to click the register button
    public void clickRegisterButton() {
        driver.findElement(registration).click();
    }
}
