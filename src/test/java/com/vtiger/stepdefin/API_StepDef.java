package com.vtiger.stepdefin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_StepDef {

public String Endpoint;
public Response R_Body;

    @Given("endpoint is {string}")
    public void endpoint_is(String string) {
        Endpoint = string;

    }
    @When("I send a GET request")
    public void i_send_a_get_request() {
        R_Body =  RestAssured.get(Endpoint);
    }
    @Then("I should receive a response with a status code of {int}")
    public void i_should_receive_a_response_with_a_status_code_of(Integer int1) {
        System.out.println(R_Body.getStatusCode());
        System.out.println(R_Body.getBody().asPrettyString());
    }
    @When("I send a POST request with a new user")
    public void i_send_a_post_request_with_a_new_user() {
//
    }

}
