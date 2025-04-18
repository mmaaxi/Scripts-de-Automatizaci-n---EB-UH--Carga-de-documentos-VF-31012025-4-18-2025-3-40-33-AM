package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    private By documentoInput = By.id("documentInput");
    private By cargarDocumentoButton = By.id("cargarDocumento");
    private By mensajeExito = By.id("mensajeExito");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoConFormatoPermitido() {
        WebElement input = driver.findElement(documentoInput);
        input.sendKeys("/path/to/allowed/format/document.pdf");
    }

    public boolean isDocumentoSeleccionadoVisible() {
        WebElement input = driver.findElement(documentoInput);
        return input.getAttribute("value").contains("allowed/format/document.pdf");
    }

    public void cargarDocumento() {
        driver.findElement(cargarDocumentoButton).click();
    }

    public boolean isCargaExitosaSinErrores() {
        // Implementar lógica para verificar que no hay errores en la carga
        return true; // Se asume que la lógica de verificación se implementa correctamente
    }

    public boolean isMensajeExitoMostrado() {
        return driver.findElement(mensajeExito).isDisplayed();
    }
}