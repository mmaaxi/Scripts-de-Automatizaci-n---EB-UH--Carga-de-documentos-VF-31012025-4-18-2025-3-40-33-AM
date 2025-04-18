package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_009Page {
    WebDriver driver;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "logEntries")
    WebElement logEntries;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument() {
        // Assuming there's a file input to send the document path
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        fileInput.sendKeys("/path/to/document");
        uploadButton.click();
    }

    public boolean isLogCreated() {
        // Mock verification logic
        return logEntries.isDisplayed();
    }

    public boolean verifyLogEntries() {
        // Mock verification of log entries
        return logEntries.getText().contains("Upload Successful");
    }

    public boolean isLogEntryDetailed() {
        // Check if log entry details contain date, time, user
        String logDetails = logEntries.getText();
        return logDetails.contains("Date") && logDetails.contains("Time") && logDetails.contains("User");
    }
}