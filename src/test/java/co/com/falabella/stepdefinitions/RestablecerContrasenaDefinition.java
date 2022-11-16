package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.CambiarClave;
import co.com.falabella.tasks.RestablecerContrasena;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RestablecerContrasenaDefinition {

    @Given("^que el usuario esta en la pagina de inicio de sesion$")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeSesion() {

    }

    @When("^el usuario restablece la contrasena$")
    public void elUsuarioRestableceLaContrasena(Map<String, String> correo) {
        theActorInTheSpotlight().attemptsTo(RestablecerContrasena.conCorreo(correo));
    }

    @Then("^el usuario recibira un correo con las indicaciones para cambiarla$")
    public void elUsuarioRecibiraUnCorreoConLasIndicacionesParaCambiarla() {
        theActorInTheSpotlight().should(seeThat(CambiarClave.withEmail()));
    }
}
