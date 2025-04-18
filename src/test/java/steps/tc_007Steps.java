package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        page.openApplication();
    }

    @When("I simulate an unstable network")
    public void i_simulate_an_unstable_network() {
        page.simulateUnstableNetwork();
    }

    @Then("I should see an error message related to network connection")
    public void i_should_see_an_error_message_related_to_network_connection() {
        Assert.assertTrue(page.isNetworkErrorMessageDisplayed());
    }

    @When("I stabilize the network and retry loading the document")
    public void i_stabilize_the_network_and_retry_loading_the_document() {
        page.stabilizeNetwork();
        page.retryDocumentLoading();
    }

    @Then("the document should load successfully")
    public void the_document_should_load_successfully() {
        Assert.assertTrue(page.isDocumentLoadedSuccessfully());
    }
}