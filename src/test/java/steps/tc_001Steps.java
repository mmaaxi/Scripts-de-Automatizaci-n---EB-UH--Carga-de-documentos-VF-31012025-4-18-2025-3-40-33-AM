package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario ha seleccionado un documento con formato permitido")
    public void seleccionarDocumento() {
        page.seleccionarDocumentoConFormatoPermitido();
        Assert.assertTrue(page.isDocumentoSeleccionadoVisible());
    }

    @When("El usuario hace clic en el botón 'Cargar documento'")
    public void cargarDocumento() {
        page.cargarDocumento();
    }

    @Then("El sistema procesa el documento sin errores")
    public void verificarCargaExitosa() {
        Assert.assertTrue(page.isCargaExitosaSinErrores());
    }

    @Then("Se muestra un mensaje de confirmación de carga exitosa")
    public void verificarMensajeExito() {
        Assert.assertTrue(page.isMensajeExitoMostrado());
    }
}