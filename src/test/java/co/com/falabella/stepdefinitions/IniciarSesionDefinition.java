package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.CambiarClave;
import co.com.falabella.questions.InicioSesionFallido;
import co.com.falabella.tasks.IniciarSesion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionDefinition {

    @Given("^que el usuario esta en la pagina de Falabella$")
    public void queElUsuarioEstaEnLaPaginaDeFalabella() {

    }

    @When("^el usuario se loguea con las credenciales$")
    public void elUsuarioSeLogueaConLasCredenciales(Map<String, String> datos) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conDatos(datos));
    }

    @Then("^el usuario podra ver los productos de falabella$")
    public void elUsuarioPodraVerLosProductosDeFalabella() {

    }

    @When("^el usuario se loguea con las credenciales incorrectas$")
    public void elUsuarioSeLogueaConLasCredencialesIncorrectas(Map<String, String> datos) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conDatos(datos));

    }

    @Then("^el usuario no se podra loguear$")
    public void elUsuarioNoSePodraLoguear() {
        theActorInTheSpotlight().should(seeThat(InicioSesionFallido.ConEmailIncorrecto()));
    }

}
