package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navegarAPaginaDeCarga();
    }

    @When("el usuario selecciona un archivo con formato no permitido")
    public void elUsuarioSeleccionaUnArchivoConFormatoNoPermitido() {
        page.seleccionarArchivoNoPermitido();
    }

    @When("el usuario hace clic en 'Cargar documento'")
    public void elUsuarioHaceClicEnCargarDocumento() {
        page.cargarDocumento();
    }

    @Then("se muestra un mensaje de error indicando que el formato no es soportado")
    public void seMuestraUnMensajeDeError() {
        Assert.assertTrue(page.verificarMensajeDeError());
    }
}