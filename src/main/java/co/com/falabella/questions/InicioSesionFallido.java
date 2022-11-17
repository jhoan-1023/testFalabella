package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterfaces.InicioSesion.*;

public class InicioSesionFallido implements Question<String> {

    /***
     * Utilice este método para validar el Assert o resultado esperado del feature iniciarSesion.feature
     * @param actor - El actor es el encargado de ejecutar las acciones
     * @return - Validar el campo del resultado esperado
     */

    @Override
    public String answeredBy(Actor actor) {

        return String.valueOf(Text.of(CORREO_INCORRECTO));
    }

    public static InicioSesionFallido ConEmailIncorrecto(){

        return new InicioSesionFallido();
    }
}
