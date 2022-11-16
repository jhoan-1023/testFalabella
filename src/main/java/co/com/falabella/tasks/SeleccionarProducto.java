package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.falabella.userinterfaces.ComprarProduct.*;

import java.util.Map;

public class SeleccionarProducto implements Task {

    Map<String, String> producto;

    public SeleccionarProducto(Map<String, String> producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Enter.theValue(producto.get("producto")).into(PRODUCTO).thenHit(Keys.ENTER),
                Click.on(SELECCIONAR_PRODUCTO),
                Click.on(BTN_AGREGAR_A_BOLSA),
                Click.on(BTN_VER_BOLSA),
                Click.on(BTN_IR_A_COMPRAR),
                Enter.theValue(producto.get("correo")).into(CORREO),
                Click.on(BTN_CONTINUAR),
                Click.on(SELECCIONAR_DEPTO),
                Click.on(ANTIOQUIA),
                Click.on(SELECCIONAR_CIUDAD),
                Click.on(MEDELLIN),
                Click.on(SELECCIONAR_BARRIO),
                Click.on(MEDALLO),
                Click.on(CONTINUAR_BTN),
                Enter.theValue(producto.get("direccion")).into(INGRESAR_DIRECCION),
                Enter.theValue(producto.get("apartamento")).into(INGRESAR_APARTAMENTO),
                Click.on(BTN_INGRESAR_DIRECCION),
                Click.on(CONTINUAR),
                Click.on(SELECCIONAR_METODOPAGO));

    }

    public static SeleccionarProducto conProducto(Map<String, String> producto){
        return Tasks.instrumented(SeleccionarProducto.class, producto);
    }
}
