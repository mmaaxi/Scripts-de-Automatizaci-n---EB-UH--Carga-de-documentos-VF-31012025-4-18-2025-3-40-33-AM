package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page = new tc_009Page();
        page.navigateToUploadPage();
    }

    @When("el usuario realiza una carga exitosa de un documento")
    public void el_usuario_realiza_una_carga_exitosa_de_un_documento() {
        page.uploadDocument();
    }

    @Then("el sistema registra todos los detalles de la carga en un log interno")
    public void el_sistema_registra_todos_los_detalles_de_la_carga_en_un_log_interno() {
        Assert.assertTrue(page.isLogCreated());
    }

    @Then("verifica que se hayan creado las entradas correspondientes en el log")
    public void verifica_que_se_hayan_creado_las_entradas_correspondientes_en_el_log() {
        Assert.assertTrue(page.verifyLogEntries());
    }

    @Then("el log muestra entradas detalladas del proceso de carga, incluyendo fecha, hora y usuario")
    public void el_log_muestra_entradas_detalladas_del_proceso_de_carga_incluyendo_fecha_hora_y_usuario() {
        Assert.assertTrue(page.isLogEntryDetailed());
    }
}