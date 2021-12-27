package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Page1HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page1HomePage.class.getName());

    public Page1HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@id='first_3'])[1]")
    WebElement fName;

    @FindBy(xpath = "(//input[@id='last_3'])[1]")
    WebElement lName;

    @FindBy(css = "#form-pagebreak-next_5")
    WebElement nextButton;

    public void enterFirstName(String firstName) {
        pmSendTextToElement(fName, firstName);
        log.info("entering first name: " + firstName);
    }

    public void enterLastName(String lastName) {
        pmSendTextToElement(lName, lastName);
        log.info("entering last name: " + lastName);
    }

    public void clickOnNextButton() {
        pmClickOnElement(nextButton);
        log.info("clicking on next button: " + nextButton.toString());
    }
}
