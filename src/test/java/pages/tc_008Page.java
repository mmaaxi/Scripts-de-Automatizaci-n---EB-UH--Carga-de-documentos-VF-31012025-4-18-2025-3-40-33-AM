package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    By uploadField = By.id("uploadField");
    By errorMessage = By.id("errorMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void triggerUploadError() {
        // Simulate an upload error
        driver.findElement(uploadField).sendKeys("/path/to/invalid/file");
        // Code to interrupt connection or cause error
    }

    public void verifyErrorMessageDisplayed() {
        assert driver.findElement(errorMessage).isDisplayed();
    }

    public void verifyUploadFieldCleared() {
        assert driver.findElement(uploadField).getText().isEmpty();
    }

    public void uploadDocumentAgain() {
        driver.findElement(uploadField).sendKeys("/path/to/valid/file");
    }

    public void verifyUploadSuccess() {
        // Assert successful upload logic here
    }
}