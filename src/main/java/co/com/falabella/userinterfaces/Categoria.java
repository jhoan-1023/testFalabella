package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Categoria {

    public static final Target BTN_CATEGORIA = Target.the("buscar producto")
            .locatedBy("//div[@class = 'HamburgerBtn-module_icon__1ctEI']");

    public static final Target BTN_CELULARES = Target.the("seleccionar producto")
            .locatedBy("//*[@id='cross-header']/div[3]/div/div[2]/div/ul/li[2]/div/p");

    public static final Target TELEFONIA = Target.the("seleccionar producto")
            .locatedBy("//*[@id='cross-header']/div[3]/div/div[2]/div/section/div/section/ul[1]/li[1]/a");

    public static final Target CELULARES = Target.the("celulares")
            .locatedBy("//*[@id='header']/section[2]/div/b/a[2]/span");

}
