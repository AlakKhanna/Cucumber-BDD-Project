import io.cucumber.java.en.*;
import org.testng.annotations.Test;

public class Search {

    @Given("user opens the application")
    public void user_opens_the_application() {
        System.out.println("application open");
    }

    @When("user enters the valid product in the search field")
    public void user_enters_the_valid_product_in_the_search_field() {
        System.out.println("Enetered valid product");
    }

    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {
        System.out.println("clicked serach button");
    }

    @Then("valid product should get displayed in search results")
    public void valid_product_should_get_displayed_in_search_results() {
        System.out.println("Valid product is reflecting");
    }


    @When("user enters non-existing product in the search field")
    public void userEntersNonExistingProductInTheSearchField() {
        System.out.println("enter search without entering product");
    }

    @And("proper text informing the user about no product matching should be displayed")
    public void properTextInformingTheUserAboutNoProductMatchingShouldBeDisplayed() {
        System.out.println("error message should reflect");
    }

    @When("user dont enter any product in the search field")
    public void userDontEnterAnyProductInTheSearchField() {
        System.out.println("user not entering any product");
    }
}
