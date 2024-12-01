package stepdefinitions;

import Steps.GetApiRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class ListUser {

    @Steps
    GetApiRequest getApiRequest;


    @Given("hitting the rest api of user")
    public void hitting_the_rest_api_of_user() {
        getApiRequest.getApiCall();
    }
    @When("validating the aoi response")
    public void validating_the_aoi_response() {

    }
    @Then("validating the api status")
    public void validating_the_api_status() {

    }

}
