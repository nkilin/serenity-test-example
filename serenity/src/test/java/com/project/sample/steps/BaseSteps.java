package com.project.sample.steps;

import com.project.sample.pages.BasePage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseSteps extends UIInteractionSteps {

    BasePage basePage;

    @Step("open page")
    public void openPage() {
        basePage.open();
    }

    @Step("search for word")
    public void searchForWord(String word) {
        basePage.searchFor(word);
    }

    @Step("verify search results are returned")
    public void verifySearchResultsAreReturned() {
        assertThat(basePage.getNoOfResults()).isNotZero();
    }

}