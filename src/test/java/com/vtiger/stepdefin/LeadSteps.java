package com.vtiger.stepdefin;

import com.codoid.products.exception.FilloException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LeadSteps extends Base_Steps {





    @Given("user should be on login page")
    public void user_should_be_on_login_page() throws IOException, FilloException {
        LaunchApp();
    }


    @When("user enters the mandatory fields and click on save button")
    public void user_enters_the_mandatory_fields_and_click_on_save_button(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String,String>> lst = dataTable.entries();
        for (int i=0;i<lst.size();i++){
//            driver.findElement(By.linkText("Leads")).click();
//            driver.findElements(By.xpath("//input[@name='lastname']")).getFirst().sendKeys(lst.get(i).get("lastname"));
//            driver.findElements(By.xpath("//input[@name='company']")).getFirst().sendKeys(lst.get(i).get("company"));
//            driver.findElement(By.name("button")).click();
         getLeadPage().clickNewLead();
         getLeadPage().creatLead(lst.get(i).get("lastname"),lst.get(i).get("company"));

        }
    }
    @Then("lead should be created successfully")
    public void lead_should_be_created_successfully() {
        getLeadPage().verify_Duplicate();
        getLeadPage().verify_Convert();
    }
    @When("user enters the mandatory fields last name as String , Comapany name as String and click on save button")
    public void user_enters_the_mandatory_fields_last_name_as_string_comapany_name_as_string_and_click_on_save_button() {
        getLeadPage().clickNewLead();
       getLeadPage().creatLead(td.get(ScenarioName).get("LastName"),td.get(ScenarioName).get("Company"));

    }






}
