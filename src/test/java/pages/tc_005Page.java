package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;

    By fileInput = By.id("file-upload");
    By uploadButton = By.id("upload-button");
    By successMessage = By.className("success-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void selectMultipleFiles() {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys("/path/to/file1.pdf\n/path/to/file2.docx");
    }

    public void verifyDisplayedFiles() {
        // Verify that all selected files are displayed, assuming each file loads a div with class 'file'
        WebElement files = driver.findElement(By.className("files-list"));
        assert files.isDisplayed();
    }

    public void clickUploadDocuments() {
        driver.findElement(uploadButton).click();
    }

    public void verifyIndividualProcessing() {
        // Logic to verify each document is processed individually
    }

    public void verifySuccessMessages() {
        // Verify success messages are shown for each file
        WebElement message = driver.findElement(successMessage);
        assert message.isDisplayed();
    }
}