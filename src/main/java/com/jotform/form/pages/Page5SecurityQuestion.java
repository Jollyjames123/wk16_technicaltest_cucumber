package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5SecurityQuestion extends Utility {
    private static final Logger log = LogManager.getLogger(Page5SecurityQuestion.class.getName());

    public Page5SecurityQuestion() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"input_11\"]")
    WebElement questionDropdown;
    @FindBy(xpath = "//input[@id='input_12']")
    WebElement answerField;
    @FindBy(id = "form-pagebreak-next_13")
    WebElement nextButton;

    public void enterQuestion(String question) {
        log.info("selecting the question: " + question);
        pmSelectByVisibleTextFromDropDown(questionDropdown, question);
    }

    public void enterAnwser(String answer) {
        log.info("entering the answer: " + answer);
        pmSendTextToElement(answerField, answer);
    }

    public void clickOnNextButton() {
        log.info("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}