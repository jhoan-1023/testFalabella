package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.falabella.userinterfaces.Categoria.*;

public class BuscarCategoria implements Task {

    /***
     * Utilice este método para que el actor pueda ejecutar todas las acciones
     * @param actor - Encargado de ejecutar las acciones
     * @param <T>
     */

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_CATEGORIA),
                Click.on(BTN_CELULARES),
                Click.on(TELEFONIA));

    }

    public static BuscarCategoria conCategoria(){
        return Tasks.instrumented(BuscarCategoria.class);
    }
}
