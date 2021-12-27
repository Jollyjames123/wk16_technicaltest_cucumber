Feature: Technical Test Submission Form
  verifying that the user should be able to submit the form

  Background: User is on the jotform website homepage
    Given User is on the jotform website homepage

  @Regression
    Scenario:user should be able to fill in all the details and submit the form successfully
      When user enters first name "Jolly" in the first name field
      And enters last name "James" in the last name field
      And clicks on the next button of the firstpage
      And uploads the file "D:/downloads/image.png" in the form
      And clicks on the next button of the uploadfilepage
      And signs in the signature box
      And clicks on the next button of the signaturepage
      And enters the date"12-21-2021" in the datefield
      And clicks on the next button of the datepage
      And selects the security question "Favourite colour" from the dropdown
      And enters the answer"Blue" in the answerfield
      And clicks on the next button of the securityquestionpage
      And clicks on the next button of the next page
      And clicks on the submit button
      Then user submits the form and verifies message "Thank You!"
