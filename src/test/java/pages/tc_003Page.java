package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    WebDriver driver;

    By inputArchivo = By.id("fileUpload");
    By mensajeError = By.id("errorMessage");
    By botonCargar = By.id("uploadButton");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoExcedente() {
        WebElement input = driver.findElement(inputArchivo);
        // Asumimos un método para simular la selección de archivo que excede el límite.
        input.sendKeys("/path/to/large/file.jpg");
    }

    public void intentarCargarDocumento() {
        driver.findElement(botonCargar).click();
    }

    public boolean esVisibleMensajeErrorTamaño() {
        WebElement mensaje = driver.findElement(mensajeError);
        return mensaje.isDisplayed() && mensaje.getText().contains("tamaño del archivo es demasiado grande");
    }

    public boolean esArchivoCargadoExitosamente() {
        // Este método verifica si el archivo ha sido cargado exitosamente
        // Implementación según el flujo de negocio
        return false;
    }
}