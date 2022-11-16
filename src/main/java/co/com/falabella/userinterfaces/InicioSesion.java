package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesion {

    public static final Target BTN_INICIAR = Target.the("BTN INGRESAR")
            .locatedBy("//div[@class = 'UserInfo-module_info__name__29Sjz']");

    public static final Target CORREO = Target.the("ingresar correo")
            .locatedBy("//input[@id = 'testId-cc-login-form-email-input']");

    public static final Target CONTRASENA = Target.the("ingresar contrasena")
            .locatedBy("//input[@id = 'testId-cc-login-form-password-input']");

    public static final Target BTN_INGRESAR = Target.the("boton ingresar")
            .locatedBy("//*[@id='testId-cc-login-form-submit']");

    public static final Target CORREO_INCORRECTO = Target.the("correo incorrecto")
            .locatedBy("//*[@id=\"testId-cc-login-form\"]/form/div[1]/div/div[2]");
}
