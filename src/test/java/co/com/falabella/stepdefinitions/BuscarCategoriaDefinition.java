package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.CategoriaProducto;
import co.com.falabella.questions.InicioSesionFallido;
import co.com.falabella.tasks.BuscarCategoria;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarCategoriaDefinition {

    @Given("^que el usuario esta en la plataforma$")
    public void queElUsuarioEstaEnLaPlataforma() {

    }

    @When("^el usuario busca una categoria$")
    public void elUsuarioBuscaUnaCategoria() {
        theActorInTheSpotlight().attemptsTo(BuscarCategoria.conCategoria());
    }

    @Then("^podra ver los productos de la categoria$")
    public void podraVerLosProductosDeLaCategoria() {
        theActorInTheSpotlight().should(seeThat(CategoriaProducto.conCategoria()));;
    }
}
