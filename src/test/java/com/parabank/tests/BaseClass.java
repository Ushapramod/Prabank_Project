package com.parabank.tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports; // Import ExtentReports
import com.relevantcodes.extentreports.ExtentTest; // Import ExtentTest
import com.relevantcodes.extentreports.LogStatus; // Import LogStatus

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BaseClass {
    WebDriver driver;
    ExtentReports extent; // Declare ExtentReports instance
    ExtentTest test; // Declare ExtentTest instance

    @BeforeClass
    public void setUp() {
        // Initialize ExtentReports
        extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentReport.html", true); // Create report file

        // Set the property for GeckoDriver
        System.setProperty("webDriver.gecko.driver", "/com.FaceBook_Automation/src/test/resources/Executables/geckodriver.exe");
        
        // Initialize the Firefox driver
        driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com");
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver
        if (driver != null) {
            driver.quit();
        }

        // Flush and close the extent report
        if (extent != null) {
            extent.flush(); // Ensure the report is written
            extent.close(); // Close the extent report
        }
    }

    // Method to capture screenshots
    protected String captureScreenshot(String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png"; // Specify the path
        File finalDestination = new File(destination);
        
        try {
            Files.createDirectories(Path.of("screenshots")); // Create the screenshots directory if it doesn't exist
            Files.copy(source.toPath(), finalDestination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalDestination.getPath(); // Return the screenshot path
    }
}
