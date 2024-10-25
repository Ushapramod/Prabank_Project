package com.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.parabank.pages.RegistrationPagePOM;

public class RegistrationPageTest extends BaseClass {

    RegistrationPagePOM registrationPage;

    @Test
    public void verifyTheTitleOfThePage() {
        // Initialize the RegistrationPagePOM with the WebDriver instance from BaseClass
        registrationPage = new RegistrationPagePOM(driver);

        // Click on the registration link
        registrationPage.clickRegisterButton();

        Assert.assertTrue(driver.getTitle().contains("Register"));
    }
    
    @Test
    public void registerTheCustomer() throws InterruptedException
    {registrationPage = new RegistrationPagePOM(driver);
    Thread.sleep(3000);
    registrationPage.clickRegisterButton();
    Thread.sleep(3000);
    	registrationPage.enterFirstName("Ram");
    	Thread.sleep(3000);
    	
    	registrationPage.enterLastName("usha");
    	Thread.sleep(3000);
    	
    	registrationPage.enterAddress("Bengaluru");
    	Thread.sleep(3000);
    	
    	registrationPage.enterCity("Bengaluru");
    	Thread.sleep(3000);
    	
    	registrationPage.enterState("Karnataka");
    	Thread.sleep(3000);
    	
    	registrationPage.enterZipCode("560073");
    	Thread.sleep(3000);
    	
    	registrationPage.enterPhoneNo("7892480599");
    	Thread.sleep(3000);
    	
    	registrationPage.enterSSN("555");
    	Thread.sleep(3000);
    	
    	registrationPage.enterUserName("ushaPramod");
    	Thread.sleep(3000);
    	
    	registrationPage.enterPassword("Bhilaghe@123");
    	Thread.sleep(3000);
    	
    	registrationPage.enterConfirmPassword("Bhilaghe@123");
    	Thread.sleep(3000);
    	
    	registrationPage.clickRegisterButton();
    Thread.sleep(3000);
    System.out.println("I love you");
    	
    }
}
