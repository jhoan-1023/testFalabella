package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.falabella.userinterfaces.ComprarProduct.*;

import java.util.Map;

public class ComprarProducto implements Task {

    Map<String, String> producto;

    public ComprarProducto(Map<String, String> producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(producto.get("producto")).into(PRODUCTO));

    }

    public static ComprarProducto conProducto(Map<String, String> producto){
        return Tasks.instrumented(ComprarProducto.class, producto);
    }
}
