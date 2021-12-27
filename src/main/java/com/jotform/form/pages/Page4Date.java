package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4Date extends Utility {
    private static final Logger log = LogManager.getLogger(Page4Date.class.getName());

    public Page4Date() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "form-pagebreak-next_10")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lite_mode_9']")
    WebElement dateField;

    public void enteringTheDate(String date) {
        log.info("entering the date: " + date);
        pmSendTextToElement(dateField, date);
    }

    public void clickOnNextButton() {
        log.info("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}
