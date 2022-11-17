package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterfaces.Registrar.*;

public class UsuarioRegistrado implements Question<String> {

    /***
     * Utilice este método para validar el Assert o resultado esperado del feature registrar.feature
     * @param actor - El actor es el encargado de ejecutar las acciones
     * @return - Validar el campo del resultado esperado
     */

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(Text.of(USER_REGISTRADO));
    }

    public static UsuarioRegistrado conEmail(){
        return new UsuarioRegistrado();
    }

}
