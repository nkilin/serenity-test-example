package com.project.sample.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("/")
public class BasePage extends PageObject {

    protected static final String PAGE_TITLE = "Google";
    protected static final int SIGN_IN_POPUP_FRAME = 0;
    protected static final By GOOGLE_IMAGE = By.id("hplogo");
    protected static final By INTRO_AGREE_BUTTON = By.id("introAgreeButton");
    protected static final By SEARCH_BOX = By.name("q");
    protected static final By SEARCH_BUTTON = By.name("btnK");
    protected static final By RESULT_ROWS = By.cssSelector("#rso > [class=g]");

    @WhenPageOpens
    public void waitForPageToLoad() {
        waitForTitleToAppear(PAGE_TITLE);
        waitFor(driver -> getDriver().switchTo().frame(SIGN_IN_POPUP_FRAME));
        element(INTRO_AGREE_BUTTON).click();
        getDriver().switchTo().defaultContent();
        shouldBeVisible(GOOGLE_IMAGE);
    }

    public void searchFor(String word) {
        element(SEARCH_BOX).sendKeys(word);
        element(SEARCH_BUTTON).click();
    }

    public int getNoOfResults() {
        return getDriver().findElements(RESULT_ROWS).size();
    }

}