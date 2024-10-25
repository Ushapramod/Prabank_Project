package com.parabank.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends BaseClass {

	@Test
	public void verifyWhetherURLisCorrect() {
		test = extent.startTest("Verify Whether URL is Correct"); // Start a test with a meaningful name

		String expectedURL = "https://parabank.parasoft";
		String actualURL = driver.getCurrentUrl();

		try {
			Assert.assertTrue(actualURL.contains(expectedURL),
					"URL mismatch! Expected: " + expectedURL + " but got: " + actualURL);
			test.log(LogStatus.PASS, "URL verification passed. Actual URL is: " + actualURL); // Log the result
		} catch (AssertionError e) {
			String screenshotPath = captureScreenshot("URLVerificationFailure"); // Capture screenshot on failure
			test.log(LogStatus.FAIL, "URL verification failed. Screenshot: " + test.addScreenCapture(screenshotPath));
		} finally {
			extent.endTest(test); // End the test
		}
	}

	@Test
	public void VerifyTheLinks() {
		test = extent.startTest("Verify The Links"); // Start a test for link verification

		String[][] links = { { "About Us", "https://parabank.parasoft.com/parabank/about.htm" },
				{ "Services", "https://parabank.parasoft.com/parabank/services.htm" },
				{ "Products", "https://www.parasoft.com/products/" },
				{"Locations","https://www.parasoft.com/solutions/"},
				{"Admin Page","https://parabank.parasoft.com/parabank/admin.htm"},
				{"Forgot login info?","https://parabank.parasoft.com/parabank/lookup.htm"},
				{"Register", "https://parabank.parasoft.com/parabank/register.htm"},
				};

		for (String[] link : links) {
			try {
				WebElement linkElement = driver.findElement(By.linkText(link[0]));
				Assert.assertTrue(linkElement.isDisplayed(), link[0] + " link is not displayed");
				linkElement.click();

				// Optional: Go back to the previous page if necessary
				driver.navigate().back(); 
			// Go back after clicking the link
			} catch (AssertionError e) {
				String screenshotPath = captureScreenshot(link[0] + "LinkFailure"); // Capture screenshot on failure
				test.log(LogStatus.FAIL,
						link[0] + " link verification failed. Screenshot: " + test.addScreenCapture(screenshotPath));
			}
		}

		test.log(LogStatus.PASS, "All links verified successfully."); // Log the result
		extent.endTest(test); // End the test
	}

	

}
