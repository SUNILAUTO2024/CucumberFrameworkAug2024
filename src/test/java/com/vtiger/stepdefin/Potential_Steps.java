package com.vtiger.stepdefin;

import com.vtiger.pages.Potential_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Potential_Steps extends Base_Steps{

    @Then("user click on New Potential link")
    public void user_click_on_new_potential_link() {
        getPotenl_P().Cick_N_Potential();

    }

    @When("user enters the mandatory fields on New Potential page Potential name in String, Select Account and click on save button")
    public void user_enters_the_mandatory_fields_on_new_potential_page_potential_name_in_string_select_account_and_click_on_save_button() {
        getPotenl_P().Create_Potential(td.get(ScenarioName).get("PotentialName"));
    }



}
