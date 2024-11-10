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
        String Priority_DDValues = getTkt_Page().priority_DD_Options();
        Assert.assertEquals("[Low, Normal, High, Urgent]",Priority_DDValues);

    }

    @Then("user verify severity DD and its values in New Ticket page")
    public void user_verify_severity_dd_and_its_values_in_new_ticket_page() {
        String Severity_DDValues = getTkt_Page().Severity_DD_Options();
        Assert.assertEquals("[Minor, Major, Feature, Critical]",Severity_DDValues);
    }
    @Then("user verify category DD and its values in New Ticket page")
    public void user_verify_category_dd_and_its_values_in_new_ticket_page() {
        String Category_DDValues = getTkt_Page().Category_DD_Options();
        Assert.assertEquals("[Big Problem, Small Problem, Other Problem]",Category_DDValues);
    }

    @Then("verify default selection of priority DD in New Ticket page")
    public void verify_default_selection_of_priority_dd_in_new_ticket_page() {
        String prio = getTkt_Page().selected_Priority();
        Assert.assertEquals("Low",prio);
    }

    @Then("verify default selection of severity DD in New Ticket page")
    public void verify_default_selection_of_severity_dd_in_new_ticket_page() {
        String sev = getTkt_Page().selected_Severity();
        Assert.assertEquals("Minor",sev);
    }

    @Then("verify default selection of category DD in New Ticket page")
    public void verify_default_selection_of_category_dd_in_new_ticket_page() {
        String cat = getTkt_Page().selected_Category();
        Assert.assertEquals("Big Problem",cat);
    }

    @Then("user select the priority from dropdown")
    public void user_select_the_priority_from_dropdown() {
        getTkt_Page().select_Priority(td.get(ScenarioName).get("Priority"));

    }
    @Then("user verify the selected Priority in New Ticket page")
    public void user_verify_the_selected_priority_in_new_ticket_page() {
       String prio = getTkt_Page().selected_Priority();
       Assert.assertEquals(td.get(ScenarioName).get("Priority"),prio);
    }
    @Then("user select the severity from dropdown")
    public void user_select_the_severity_from_dropdown() {
    TktPage.select_Severity(td.get(ScenarioName).get("Severity"));
    }
    @Then("user verify the selected severity in New Ticket page")
    public void user_verify_the_selected_severity_in_new_ticket_page() {
        String sev = getTkt_Page().selected_Severity();
        Assert.assertEquals(td.get(ScenarioName).get("Severity"),sev);

    }
    @Then("user select the category from dropdown")
    public void user_select_the_category_from_dropdown() {
        getTkt_Page().select_Category((td.get(ScenarioName).get("Category")));
    }
    @Then("user verify the selected category in New Ticket page")
    public void user_verify_the_selected_category_in_new_ticket_page() {
       String cat = getTkt_Page().selected_Category();
        Assert.assertEquals(td.get(ScenarioName).get("Category"),cat);
    }

    @Then("user verify the Alert for mandatory fields in New Ticket page")
    public void user_verify_the_alert_for_mandatory_fields_in_new_ticket_page() {
        getTkt_Page().clickSave();
        String alert = getTkt_Page().get_Alert_Text();
        Assert.assertEquals("Title cannot be none",alert);
    }
    @Then("user Accept the Alert")
    public void user_accept_the_alert() {
        getTkt_Page().Accept_Alert();
    }
    @Then("user enter details in mandatory fields and clicked on save button in New Ticket page")
    public void user_enter_details_in_mandatory_fields_and_clicked_on_save_button_in_new_ticket_page() {
        getTkt_Page().setTitle(td.get(ScenarioName).get("FirstName"));
        getTkt_Page().clickSave();
    }







}
