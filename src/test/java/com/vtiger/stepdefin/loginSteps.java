package com.vtiger.stepdefin;

import com.codoid.products.exception.FilloException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class loginSteps extends Base_Steps {

    //@Before
//    public void getScenarioName(Scenario scenario){
//
//        if (extent==null) {
//            createExtendRePort();
//        }
//
//        ScenarioName = scenario.getName();
//
//         logger=extent.createTest(ScenarioName);
//
//    }
    @Before
    public void getScenarioName(Scenario scenario) {
        if (extent == null) {
            createExtendRePort();
        }
        ScenarioName = scenario.getName();
        logger = extent.createTest(ScenarioName);
        System.out.println("Running scenario: " + ScenarioName);

    }




//    @After
//    public void saveReport(){
//
//        extent.flush();
//        driver.quit();}

    @After
    public void saveReports() {
        if (extent != null) {
            extent.flush(); // Only call flush if extent is not null
        }
        if (driver != null) {
            driver.quit(); // Quit the driver if initialized
        }
    }






    @Given("user should be login a page")
    public void user_should_be_login_a_page() throws IOException, FilloException {

        LaunchApp();


    }
//    @When("user enter the valid credentials along with Theme and click on login button")
//    public void user_enter_the_valid_credentials_and_theme_click_on_login_button()
//    {
//        Map<String, String> credentials = td.get(ScenarioName);
//
////        if (credentials == null) {
////            throw new IllegalArgumentException("No credentials found for scenario: " + ScenarioName);
////        }
//
//        String userId = credentials.get("UserId");
//        String password = credentials.get("Password");
//        String theme = credentials.get("Theme");
//
//        System.out.println("UserId: " + userId);
//        System.out.println("Password: " + password);
//        System.out.println("Theme: " + theme);
//
////        if (userId == null || password == null || theme == null) {
////            throw new IllegalArgumentException("Required credential(s) missing for scenario: " + ScenarioName);
////        }
////
////        getLoginPage().login(userId, password, theme);
//
//
//
//
//
//       // getLoginPage().login(td.get(ScenarioName).get("UserId"),td.get(ScenarioName).get("Password"),td.get(ScenarioName).get("Theme"));
//      //  getLoginPage().clickLogin();
//    }

    @When("user enter the valid credentials and click on login button")
    public void user_enter_the_valid_credentials_and_click_on_login_button()
    {
        getLoginPage().login(td.get(ScenarioName).get("UserId"),td.get(ScenarioName).get("Password"));
        //  getLoginPage().clickLogin();
    }

    @When("user enter the valid credentials_theme and click on login button")
    public void user_enter_the_valid_credentials_theme_and_click_on_login_button()
    {
        getLoginPage().login(td.get(ScenarioName).get("UserId"),td.get(ScenarioName).get("Password"),td.get(ScenarioName).get("Theme"));
        //  getLoginPage().clickLogin();
    }



    @Then("user should be naviagte to home page")
    public void user_should_be_naviagte_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.linkText("Home")).isDisplayed();
    getLeadPage().verifyHome();
    }

    @Then("user can see the logout link on right corner")
    public void user_can_see_the_logout_link_on_right_corner() {
        //driver.findElement(By.xpath("//a[@class='currentTab']")).isDisplayed();
    getLeadPage().verifyLogOut();
      //  saveReport();
    }



    @When("user enter the invalid credentials and click on login button")
    public void user_enter_the_invalid_credentials_and_click_on_login_button(String uid, String pwd) {
//        driver.findElement(By.name("user_name")).sendKeys("admin12322");
//        driver.findElement(By.name("user_password")).sendKeys("admin1123");
//        driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
        getLoginPage().login(uid,pwd);
    }
    @Then("user should be see error on home page")
    public void user_should_be_see_error_on_home_page() {
//        driver.findElement(By.xpath("//*[contains(text(),'You must specify a valid username and password.')]")).isDisplayed();
        getLoginPage().verifyErrorMsg();
    }
    @Then("user can see the login link on right corner")
    public void user_can_see_the_login_link_on_right_corner() {
//        driver.findElement((By.xpath("//input[@title='Login [Alt+L]']"))).isDisplayed();
        getLoginPage().VerifyLogin();
        
    }

    @When("user enter the invalid credentials username as String and password as String & click on login button")
    public void user_enter_the_invalid_credentials_username_as_string_and_password_as_string_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        getLoginPage().login(td.get(ScenarioName).get("UserId"),td.get(ScenarioName).get("Password"));
    }


    @When("user enter the invalid credentials username as {string} and password as {string} & click on login button")
    public void user_enter_the_invalid_credentials_username_as_and_password_as_pass21_and_click_on_login_button(String uid,String pwd ) {
        //driver.findElement(By.name("user_name")).sendKeys(uid);
        //driver.findElement(By.name("user_password")).sendKeys(pwd);
      //  driver.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
          getLoginPage().login(uid,pwd);

    }



}