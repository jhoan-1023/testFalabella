package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterfaces.InicioSesion.*;

public class InicioSesionFallido implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return String.valueOf(Text.of(CORREO_INCORRECTO));
    }

    public static InicioSesionFallido ConEmailIncorrecto(){

        return new InicioSesionFallido();
    }
}
