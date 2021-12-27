package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3Signature extends Utility {
    private static final Logger log = LogManager.getLogger(Page3Signature.class.getName());


    public Page3Signature() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sig_pad_7\"]/canvas")
    WebElement signatureBox;

    @FindBy(css = "#form-pagebreak-next_8")
    WebElement nextButton;

    public void clickOnNextButton() {
        log.info("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }

    public void doingTheSignature() throws InterruptedException {
        log.info("Signature in the box: " + signatureBox.toString());
        Actions builder = new Actions(driver);
        Thread.sleep(2000);
        Action drawAction = builder.moveToElement(signatureBox, 20, -50)
                //signatureBox is the element that holds the signature you have in the DOM
                .clickAndHold()
                .moveByOffset(50, 40)
                .moveByOffset(-50, 0)
                .moveByOffset(50, 40)
                .moveByOffset(-20, -70)
                .moveByOffset(-20, -30)
                .moveByOffset(50, 0)
                .moveByOffset(-80, -50)
                .moveByOffset(100, 50)
                .release(signatureBox)
                .build();
        drawAction.perform();
    }
}