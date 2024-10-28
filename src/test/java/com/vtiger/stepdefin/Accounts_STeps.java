package com.vtiger.stepdefin;

import com.codoid.products.exception.FilloException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Accounts_STeps extends Base_Steps {


//    @Given("user should be on login page")
//    public void user_should_be_on_login_page() throws IOException, FilloException {
//        LaunchApp();
//    }
    @When("user enters the mandatory fields on Account page like Account name in String and click on save button")
    public void user_enters_the_mandatory_fields_on_account_page_like_account_name_in_string_and_click_on_save_button() {
        getAccountPage().clickNewAccount();
       System.out.println(td.get("Scenario name is = = = = "+ScenarioName));
        //td.get(ScenarioName)
        getAccountPage().CreateAcc(td.get(ScenarioName).get("AccountName"));

    }

}
