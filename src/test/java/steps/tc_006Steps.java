package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento válido")
    public void elUsuarioCargaUnDocumentoValido() {
        page.uploadValidDocument();
    }

    @Then("el sistema procesa la carga sin modificar el contenido del archivo")
    public void elSistemaProcesaLaCargaSinModificarElContenidoDelArchivo() {
        Assert.assertTrue(page.isUploadProcessedCorrectly());
    }

    @When("el usuario descarga el documento cargado desde la interfaz de usuario")
    public void elUsuarioDescargaElDocumentoCargadoDesdeLaInterfazDeUsuario() {
        page.downloadUploadedDocument();
    }

    @Then("el archivo descargado mantiene su integridad y formato original")
    public void elArchivoDescargadoMantieneSuIntegridadYFormatoOriginal() {
        Assert.assertTrue(page.isDownloadedFileIntact());
    }
}