package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;

public class tc_010Steps {

    private WebDriver driver;
    private tc_010Page documentPage;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        documentPage = PageFactory.initElements(driver, tc_010Page.class);
    }

    @Given("El documento válido es cargado exitosamente")
    public void el_documento_valido_se_carga() {
        documentPage.uploadDocument("path/to/valid/document");
        Assert.assertTrue(documentPage.isDocumentDisplayed());
    }

    @When("El usuario interactúa con el documento cargado")
    public void el_usuario_interactua_con_documento() {
        documentPage.zoomInDocument();
        documentPage.viewFullScreen();
    }

    @Then("El documento debe ser mostrado correctamente en la interfaz de usuario sin perdida de calidad")
    public void el_documento_se_muestra_correctamente() {
        Assert.assertTrue(documentPage.isDocumentQualityMaintained());
    }
}