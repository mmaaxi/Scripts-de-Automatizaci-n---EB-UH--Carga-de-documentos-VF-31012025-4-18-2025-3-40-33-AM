package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page uploadPage = new tc_005Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        uploadPage.openUploadPage();
    }

    @When("el usuario selecciona múltiples archivos con formatos permitidos")
    public void el_usuario_selecciona_múltiples_archivos_con_formatos_permitidos() {
        uploadPage.selectMultipleFiles();
    }

    @Then("el sistema muestra todos los archivos seleccionados")
    public void el_sistema_muestra_todos_los_archivos_seleccionados() {
        uploadPage.verifyDisplayedFiles();
    }

    @When("el usuario hace clic en 'Cargar documentos'")
    public void el_usuario_hace_clic_en_cargar_documentos() {
        uploadPage.clickUploadDocuments();
    }

    @Then("cada documento se procesa individualmente")
    public void cada_documento_se_procesa_individualmente() {
        uploadPage.verifyIndividualProcessing();
    }

    @Then("se muestra un mensaje de confirmación para cada carga exitosa")
    public void se_muestra_un_mensaje_de_confirmación_para_cada_carga_exitosa() {
        uploadPage.verifySuccessMessages();
    }
}