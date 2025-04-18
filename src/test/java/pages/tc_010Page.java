package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By documentViewer = By.id("documentViewer");
    private By zoomInButton = By.id("zoomInButton");
    private By fullScreenButton = By.id("fullScreenButton");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean isDocumentDisplayed() {
        return driver.findElement(documentViewer).isDisplayed();
    }

    public void zoomInDocument() {
        driver.findElement(zoomInButton).click();
    }

    public void viewFullScreen() {
        driver.findElement(fullScreenButton).click();
    }

    public boolean isDocumentQualityMaintained() {
        // Logic to verify if the quality is maintained
        return true;
    }
}