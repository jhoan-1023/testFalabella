package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterfaces.ComprarProduct.*;

public class ComprarProducto implements Question<String> {

    /***
     * Utilice este método para validar el Assert o resultado esperado del feature comprarProducto.feature
     * @param actor - El actor es el encargado de ejecutar las acciones
     * @return - Validar el campo del resultado esperado
     */

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(Text.of(METODO_PAGO));
    }

    public static ComprarProducto conProducto(){
        return new ComprarProducto();
    }
}
