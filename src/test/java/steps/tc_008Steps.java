package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page uploadPage = new tc_008Page(driver);

    @Given("I am on the document upload page")
    public void iAmOnTheDocumentUploadPage() {
        uploadPage.navigateToUploadPage();
    }

    @When("I trigger an error while uploading the document")
    public void iTriggerAnErrorWhileUploadingTheDocument() {
        uploadPage.triggerUploadError();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        uploadPage.verifyErrorMessageDisplayed();
    }

    @Then("the upload field should be cleared")
    public void theUploadFieldShouldBeCleared() {
        uploadPage.verifyUploadFieldCleared();
    }

    @Given("the upload field is cleared")
    public void theUploadFieldIsCleared() {
        uploadPage.verifyUploadFieldCleared();
    }

    @When("I attempt to upload the document again")
    public void iAttemptToUploadTheDocumentAgain() {
        uploadPage.uploadDocumentAgain();
    }

    @Then("the upload should proceed successfully")
    public void theUploadShouldProceedSuccessfully() {
        uploadPage.verifyUploadSuccess();
    }
}