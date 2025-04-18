package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver; // Suponemos que el WebDriver está siendo inicializado en algún contexto de prueba.
    tc_004Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page = new tc_004Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
    }

    @When("el usuario no selecciona ningún archivo y hace clic en 'Cargar documento'")
    public void el_usuario_no_selecciona_ningún_archivo_y_hace_clic_en_Cargar_documento() {
        page.clickUploadButton();
    }

    @Then("el sistema debe solicitar al usuario que seleccione un archivo antes de proceder")
    public void el_sistema_debe_solicitar_al_usuario_que_seleccione_un_archivo_antes_de_proceder() {
        String alertText = page.getAlertText();
        Assert.assertEquals("Por favor seleccione un archivo antes de proceder", alertText);
    }
}