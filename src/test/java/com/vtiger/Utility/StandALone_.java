package com.vtiger.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StandALone_ {

        public static void main(String[] args) {
            // Define the URL of the standalone Selenium server
            String seleniumServerUrl = "http://localhost:4444/wd/hub";

            // Desired capabilities for the browser (e.g., Chrome)
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");  // Change to "firefox" or other browser if needed

            // Initialize the RemoteWebDriver
            WebDriver driver = null;
            try {
                driver = new RemoteWebDriver(new URL(seleniumServerUrl), capabilities);

                // Open a webpage
                driver.get("https://www.example.com");

                // Get the page title and print it
                String pageTitle = driver.getTitle();
                System.out.println("Page title is: " + pageTitle);

            } catch (MalformedURLException e) {
                System.err.println("Invalid Selenium Server URL");
                e.printStackTrace();
            } finally {
                // Close the browser and quit the driver
                if (driver != null) {
                    driver.quit();
                }
            }
        }
    }

