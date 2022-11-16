package co.com.falabella.stepdefinitions;

import co.com.falabella.tasks.SeleccionarProducto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductoDefinition {
    
    @Given("^que el usuario inicia sesion en la pagina de falabella$")
    public void queElUsuarioIniciaSesionEnLaPaginaDeFalabella() {
    }

    @When("^el usuario selecciona un producto disponible$")
    public void elUsuarioSeleccionaUnProductoDisponible(Map<String, String> producto) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.conProducto(producto));
    }

    @Then("^el usuario podra comprar el producto$")
    public void elUsuarioPodraComprarElProducto() {

    }
}
