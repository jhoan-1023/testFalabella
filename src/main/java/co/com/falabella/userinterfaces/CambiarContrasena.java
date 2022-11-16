package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CambiarContrasena {

    public static final Target BTN_INICIAR = Target.the("Btn iniciar")
            .locatedBy("//div[@class = 'UserInfo-module_info__name__29Sjz']");

    public static final Target BTN_RESTABLECER_CONTRASENA = Target.the("btn restablecer contrasena")
            .locatedBy("//*[@id=\"testId-cc-login-form\"]/form/p/a");

    public static final Target CORREO = Target.the("ingresar correo")
            .locatedBy("//*[@id=\"rutId\"]");

    public static final Target BTN_CONTINUAR = Target.the("btn restablecer contrasena")
            .locatedBy("//*[@id=\"botonContinuarOC\"]/div[1]/a\n");

    public static final Target RECUPERAR_CLAVE = Target.the("recuperar clave")
            .locatedBy("//*[@id=\"tituloRegistroZP\"]/div[2]");
}
