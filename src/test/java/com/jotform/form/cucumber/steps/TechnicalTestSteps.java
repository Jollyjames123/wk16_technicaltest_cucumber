package com.jotform.form.cucumber.steps;

import com.jotform.form.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TechnicalTestSteps {
    @Given("^User is on the jotform website homepage$")
    public void userIsOnTheJotformWebsiteHomepage() {

    }

    @When("^user enters first name \"([^\"]*)\" in the first name field$")
    public void userEntersFirstNameInTheFirstNameField(String fName) {
        new Page1HomePage().enterFirstName(fName);
    }

    @And("^enters last name \"([^\"]*)\" in the last name field$")
    public void entersLastNameInTheLastNameField(String lName) {
        new Page1HomePage().enterLastName(lName);
    }

    @And("^clicks on the next button of the firstpage$")
    public void clicksOnTheNextButtonOfTheFirstpage() {
        new Page1HomePage().clickOnNextButton();
    }

    @And("^uploads the file \"([^\"]*)\" in the form$")
    public void uploadsTheFileInTheForm(String filePath) {
        new Page2DropFile().fileUploadMethod(filePath);
    }

    @And("^clicks on the next button of the uploadfilepage$")
    public void clicksOnTheNextButtonOfTheUploadfilepage() {
        new Page2DropFile().clickOnNextButton();
    }

    @And("^signs in the signature box$")
    public void signsInTheSignatureBox() throws InterruptedException {
        new Page3Signature().doingTheSignature();
    }

    @And("^clicks on the next button of the signaturepage$")
    public void clicksOnTheNextButtonOfTheSignaturepage() {
        new Page3Signature().clickOnNextButton();
    }

    @And("^enters the date\"([^\"]*)\" in the datefield$")
    public void entersTheDateInTheDatefield(String date) {
        new Page4Date().enteringTheDate(date);
    }

    @And("^clicks on the next button of the datepage$")
    public void clicksOnTheNextButtonOfTheDatepage() {
        new Page4Date().clickOnNextButton();
    }

    @And("^selects the security question \"([^\"]*)\" from the dropdown$")
    public void selectsTheSecurityQuestionFromTheDropdown(String question) {
        new Page5SecurityQuestion().enterQuestion(question);
    }

    @And("^enters the answer\"([^\"]*)\" in the answerfield$")
    public void entersTheAnswerInTheAnswerfield(String answer) {
        new Page5SecurityQuestion().enterAnwser(answer);
    }

    @And("^clicks on the next button of the securityquestionpage$")
    public void clicksOnTheNextButtonOfTheSecurityquestionpage() {
        new Page5SecurityQuestion().clickOnNextButton();
    }

    @And("^clicks on the next button of the next page$")
    public void clicksOnTheNextButtonOfTheNextPage() {
        new Page6Next().clickOnNextButton();
    }

    @And("^clicks on the submit button$")
    public void clicksOnTheSubmitButton() throws InterruptedException {
        new Page7Submit().clickOnSubmit();
    }

    @Then("^user submits the form and verifies message \"([^\"]*)\"$")
    public void userSubmitsTheFormAndVerifiesMessage(String message) {
        new Page8Verify().verifyTheMessage(message);

    }
}
