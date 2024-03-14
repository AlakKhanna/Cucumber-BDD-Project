package Step.defination;

import io.cucumber.java.en.*;

public class Register {

    @Given("^user navigate to register account home$")
    public void user_navigate_to_register_account_home() {
        System.out.println(">> user got navigated to register account page");
    }

    @When("User enter first name {string} into the First Name field")
    public void User_enter_first_name_into_the_First_Name_field(String firstNameText) {
        System.out.println(">> user has entered firstname " + firstNameText + "into the  first name field");
    }


    @And("enters last name {string} in the Last Name field")
    public void entersLastNameInTheLastNameField(String lastNameText) {
        System.out.println(">> user entered lastname: " + lastNameText + " into the last name field");
    }

    @And("enters email address {string} into the EMail field")
    public void entersEmailAddressIntoTheEMailField(String emailText) {
        System.out.println(">> user has entered email :" + emailText + "into the email field");

    }

    @And("enters password {string} into the Password field")
    public void entersPasswordIntoThePasswordField(String passwordText) {
        System.out.println(">>user has entered password:" + passwordText + " into the password field");

    }

    @And("enters password {string} into the Password Confirm field")
    public void entersPasswordIntoThePasswordConfirmField(String confirmPasswordText) {
        System.out.println(">>>user has entered confirm password:" + confirmPasswordText + " into the confirm password field");
    }

    @And("Selects Privacy Policy Field")
    public void selectsPrivacyPolicyField() {
        System.out.println(">>user has selected the privacy policy");
    }

    @And("Clicks on Continue Button")
    public void clicksOnContinueButton() {
        System.out.println(">>user has clicked on continue button");
    }

    @Then("Account should get successfully created")
    public void accountShouldGetSuccessfullyCreated() {
        System.out.println(">> user account successfully created");
    }

    @And("Select Yes for Newsletter")
    public void selectYesForNewsletter() {
        System.out.println("> user has selected yes for the NewsLetter");
    }

    @When("User don't enter any fields")
    public void userDonTEnterAnyFields() {
        System.out.println("> user has kept all the fields blank");
    }


    @Then("warning message should be displayed for the mandatory fields")
    public void warningMessageShouldBeDisplayedForTheMandatoryFields() {
        System.out.println("> user should get the warning message to fill the  mandatory fields");
    }

    @Then("Warning message informing the user about duplicate email should be displayed")
    public void warningMessageInformingTheUserAboutDuplicateEmailShouldBeDisplayed() {
        System.out.println("> user should get the warning message that you have entered the register email ID");
    }



}



