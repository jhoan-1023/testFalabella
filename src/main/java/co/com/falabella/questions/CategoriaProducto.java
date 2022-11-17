package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.userinterfaces.Categoria.*;

public class CategoriaProducto implements Question<String> {

    /***
     * Utilice este método para validar el Assert o resultado esperado del feature buscarCategoria.feature
     * @param actor - El actor es el encargado de ejecutar las acciones
     * @return - Validar el campo del resultado esperado
     */

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(CELULARES);
    }

    public static CategoriaProducto conCategoria(){
        return new CategoriaProducto();
    }
}
