package Step.defination;

import io.cucumber.java.en.*;
import org.testng.annotations.Test;

public class Login {

    @Given("User navigates to Login Page")
    public void user_navigates_to_login_page() {
        System.out.println("user navigate to login page");
    }
    @When("User enters valid email address {string}")
    public void user_enters_valid_email_address(String email) {
        System.out.println("user enters email" + email);
    }
    @When("Enters valid password {string}")
    public void enters_valid_password(String pass) {
        System.out.println("user enters pass" + pass);
    }
    @When("Clicks on Login button")
    public void clicks_on_login_button() {
        System.out.println("user click on login button");
    }
    @Then("User Should login successfully")
    public void user_should_login_successfully() {
        System.out.println("login page is reflecting");
    }

    @Then("User Should get a proper warning message")
    public void userShouldGetAProperWarningMessage() {
    }
}
