package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprarProduct {

    public static final Target PRODUCTO = Target.the("buscar producto")
            .locatedBy("//input[@id= 'testId-SearchBar-Input']");

}
