Feature: Test All APIs

@API
Scenario: Test API Endpoints

Given endpoint is "https://api.restful-api.dev/objects"

When I send a GET request

Then I should receive a response with a status code of 200

When I send a POST request with a new user

Then I should receive a response with a status code of 201

