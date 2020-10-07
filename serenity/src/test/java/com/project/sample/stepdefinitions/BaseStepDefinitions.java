package com.project.sample.stepdefinitions;

import com.project.sample.steps.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BaseStepDefinitions {

    @Steps
    BaseSteps baseSteps;

    @Given("^user is on Google$")
    public void userIsOnGoogle() {
        baseSteps.openPage();
    }

    @When("^user searches for word '(.*?)'$")
    public void userIsOnGoogle(String word) {
        baseSteps.searchForWord(word);
    }

    @Then("^search results are returned$")
    public void searchResultsAreReturned() {
        baseSteps.verifySearchResultsAreReturned();
    }

}