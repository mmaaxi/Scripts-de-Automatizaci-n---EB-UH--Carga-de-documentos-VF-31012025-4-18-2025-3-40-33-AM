package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navegarAPaginaDeCarga() {
        driver.get("http://example.com/cargar");
    }

    public void seleccionarArchivoNoPermitido() {
        WebElement inputFile = driver.findElement(By.id("file-upload"));
        inputFile.sendKeys("path/to/archivo_no_permitido.exe");
    }

    public void cargarDocumento() {
        WebElement uploadButton = driver.findElement(By.id("cargar-documento"));
        uploadButton.click();
    }

    public boolean verificarMensajeDeError() {
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        return errorMessage.isDisplayed() && errorMessage.getText().contains("formato no es soportado");
    }
}