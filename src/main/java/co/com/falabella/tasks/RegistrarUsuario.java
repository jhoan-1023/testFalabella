package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.falabella.userinterfaces.Registrar.*;
import java.util.Map;

public class RegistrarUsuario implements Task {
    
    Map<String, String> datos;
    
    public RegistrarUsuario(Map<String, String> datos){
        this.datos = datos;
    }

    /***
     * Utilice este método para que el actor pueda ejecutar todas las acciones
     * @param actor - Encargado de ejecutar las acciones
     * @param <T>
     */

    @Override
    public <T extends Actor> void performAs(T actor) {
        
        actor.attemptsTo(Click.on(BTN_INICIAR),
                Click.on(BTN_REGISTRATE),
                Enter.theValue(datos.get("nombre")).into(NOMBRE),
                Enter.theValue(datos.get("apellido")).into(APELLIDO),
                Enter.theValue(datos.get("cedula")).into(NUMERO_DOCUMENTO),
                Enter.theValue(datos.get("celular")).into(CELULAR),
                Enter.theValue(datos.get("correo")).into(CORREO),
                Enter.theValue(datos.get("contrasena")).into(CONTRASENA),
                Click.on(CHECK_TERMINOS),
                Click.on(BTN_REGISTRARSE));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static RegistrarUsuario conDatos(Map<String, String> datos){
        return Tasks.instrumented(RegistrarUsuario.class, datos);
    }

}
