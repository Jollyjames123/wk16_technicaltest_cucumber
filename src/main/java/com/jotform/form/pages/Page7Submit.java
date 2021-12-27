package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page7Submit extends Utility {
    private static final Logger log = LogManager.getLogger(Page7Submit.class.getName());

    public Page7Submit() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input_2")
    WebElement submitButton;

    public void clickOnSubmit() throws InterruptedException {
        log.info("clicking on submit button: " + submitButton.toString());
        pmClickOnElement(submitButton);
        Thread.sleep(1500);
    }
}
