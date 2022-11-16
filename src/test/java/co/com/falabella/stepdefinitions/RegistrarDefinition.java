package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.CambiarClave;
import co.com.falabella.questions.UsuarioRegistrado;
import co.com.falabella.tasks.RegistrarUsuario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarDefinition {

    @Given("^que el usuario se encuentra en la pagina de Falabella$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeFalabella() {

    }

    @When("^el usuario se registra con los datos$")
    public void elUsuarioSeRegistraConLosDatos(Map<String, String> datos) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.conDatos(datos));
    }

    @Then("^el usuerio podra iniciar sesion en el portal de Falabella$")
    public void elUsuerioPodraIniciarSesionEnElPortalDeFalabella() {

    }

    @Then("^no se puede registrar por que ya el usuario se encuentra registrado$")
    public void noSePuedeRegistrarPorQueYaElUsuarioSeEncuentraRegistrado() {
        theActorInTheSpotlight().should(seeThat(UsuarioRegistrado.conEmail()));;

    }

}
