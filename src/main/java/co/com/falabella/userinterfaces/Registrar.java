package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Registrar {

    public static final Target BTN_INICIAR = Target.the("Btn iniciar")
            .locatedBy("//div[@class = 'UserInfo-module_info__name__29Sjz']");

    public static final Target BTN_REGISTRATE = Target.the("btn registrate")
            .locatedBy("//a[@href = 'https://www.falabella.com.co/falabella-co/myaccount/register.jsp']");

    public static final Target NOMBRE = Target.the("ingresar nombre")
            .locatedBy("//input[@id= 'testId-Input-firstName']");

    public static final Target APELLIDO = Target.the("ingresar apellido")
            .locatedBy("//input[@id= 'testId-Input-lastName']");

    public static final Target NUMERO_DOCUMENTO = Target.the("ingresar numero de documento")
            .locatedBy("//input[@id = 'testId-Input-document']");

    public static final Target CELULAR = Target.the("ingresar celular")
            .locatedBy("//input[@id = 'testId-Input-phoneNumber']");

    public static final Target CORREO = Target.the("ingresar correo")
            .locatedBy("//input[@id = 'testId-Input-email']");

    public static final Target CONTRASENA = Target.the("ingresar contrasena")
            .locatedBy("//input[@id = 'testId-Input-password']");

    public static final Target CHECK_TERMINOS = Target.the("aceptar terminos y condiciones")
            .locatedBy("//*[@id=\"__next\"]/div/div/div/div[1]/div[2]/div[9]/div[1]/label/span");

    public static final Target BTN_REGISTRARSE = Target.the("boton registrarse")
            .locatedBy("//button[@id = 'testId-Button-submit']");

    public static final Target USER_REGISTRADO = Target.the("usuario registrado")
            .locatedBy("//*[@id=\"__next\"]/div/div/div/div[1]/div[2]/div[6]/div[2]/span/span");

}
