package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6Next extends Utility {
    private static final Logger log = LogManager.getLogger(Page6Next.class.getName());

    public Page6Next() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#form-pagebreak-next_14")
    WebElement nextButton;

    public void clickOnNextButton() {
        log.info("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}
