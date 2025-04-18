package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("El usuario selecciona un documento cuyo tamaño excede el límite permitido")
    public void elUsuarioSeleccionaUnDocumentoExcedeElLimite() {
        page.seleccionarDocumentoExcedente();
    }

    @When("El usuario intenta cargar el documento")
    public void elUsuarioIntentaCargarElDocumento() {
        page.intentarCargarDocumento();
    }

    @Then("El sistema muestra un mensaje de error indicando que el tamaño del archivo es demasiado grande")
    public void elSistemaMuestraMensajeDeError() {
        Assert.assertTrue(page.esVisibleMensajeErrorTamaño());
    }

    @Then("El sistema no permite la carga del archivo")
    public void elSistemaNoPermiteCargaDelArchivo() {
        Assert.assertFalse(page.esArchivoCargadoExitosamente());
    }
}