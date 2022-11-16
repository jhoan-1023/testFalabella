package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.falabella.userinterfaces.CambiarContrasena.*;

import java.util.Map;

public class RestablecerContrasena implements Task {

    Map<String, String> correo;

    public RestablecerContrasena(Map<String, String> correo){
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_INICIAR),
                Click.on(BTN_RESTABLECER_CONTRASENA),
                Enter.theValue(correo.get("correo")).into(CORREO),
                Click.on(BTN_CONTINUAR));

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static RestablecerContrasena conCorreo(Map<String, String> correo){
        return Tasks.instrumented(RestablecerContrasena.class, correo);
    }
}
