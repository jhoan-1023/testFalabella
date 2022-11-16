package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterfaces.ComprarProduct.*;

public class ComprarProducto implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(Text.of(METODO_PAGO));
    }

    public static ComprarProducto conProducto(){
        return new ComprarProducto();
    }
}
