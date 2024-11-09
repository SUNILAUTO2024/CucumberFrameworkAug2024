package com.vtiger.stepdefin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Ticket_Steps extends Base_Steps {


    @When("user clicks on New Ticket page link")
    public void user_clicks_on_new_ticket_page_link() {
      getTkt_Page().click_NewTicket();
    }
    @Then("user verify the Priority DD and its values in New Ticket page")
    public void user_verify_the_priority_dd_and_its_values_in_new_ticket_page() {
        String Priority_DDValues = getTkt_Page().check_priority_DD_Options();
        Assert.assertEquals("[Low, Normal, High, Urgent]",Priority_DDValues);

    }

    @Then("user verify severity DD and its values in New Ticket page")
    public void user_verify_severity_dd_and_its_values_in_new_ticket_page() {
        String Severity_DDValues = getTkt_Page().check_Severity_DD_Options();
        Assert.assertEquals("[Minor, Major, Feature, Critical]",Severity_DDValues);
    }
    @Then("user verify category DD and its values in New Ticket page")
    public void user_verify_category_dd_and_its_values_in_new_ticket_page() {
        String Category_DDValues = getTkt_Page().check_Category_DD_Options();
        Assert.assertEquals("[Big Problem, Small Problem, Other Problem]",Category_DDValues);
    }




}
