package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page8Verify extends Utility {
    private static final Logger log = LogManager.getLogger(Page8Verify.class.getName());

    public Page8Verify() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank You!')]")
    WebElement thankYouMessage;

    public void verifyTheMessage(String message) {
        log.info("verifying the message: " + message);
        pmVerifyElementsJU("message is not displayed correctly",message,thankYouMessage);


    }

}
