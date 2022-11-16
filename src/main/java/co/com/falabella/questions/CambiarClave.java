package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.falabella.userinterfaces.CambiarContrasena.*;

public class CambiarClave implements Question<String> {

    /***
     *
     * @param actor
     * @return
     */
    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(Text.of(RECUPERAR_CLAVE));
    }

    public static CambiarClave withEmail(){
        return new CambiarClave();
    }
}
