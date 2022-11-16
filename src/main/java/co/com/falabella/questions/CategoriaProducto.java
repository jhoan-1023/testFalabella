package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.falabella.userinterfaces.Categoria.*;

public class CategoriaProducto implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return String.valueOf(CELULARES);
    }

    public static CategoriaProducto conCategoria(){
        return new CategoriaProducto();
    }
}
