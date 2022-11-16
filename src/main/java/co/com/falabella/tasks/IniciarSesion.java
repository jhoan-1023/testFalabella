package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.falabella.userinterfaces.InicioSesion.*;

import java.util.Map;

public class IniciarSesion implements Task {

    Map<String, String> datos;

    public IniciarSesion(Map<String, String> datos){

        this.datos = datos;
    }

    /***
     * El método sajsdkjfskdjlfdsakjfksajfaksdfdkfas
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_INICIAR),
                Enter.theValue(datos.get("correo")).into(CORREO),
                Enter.theValue(datos.get("contrasena")).into(CONTRASENA),
                Click.on(BTN_INGRESAR));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static IniciarSesion conDatos(Map<String, String> datos){
        return Tasks.instrumented(IniciarSesion.class, datos);
    }
}
