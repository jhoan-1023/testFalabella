package co.com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprarProduct {

    public static final Target PRODUCTO = Target.the("buscar producto")
            .locatedBy("//input[@id= 'testId-SearchBar-Input']");

    public static final Target SELECCIONAR_PRODUCTO = Target.the("seleccionar producto")
            .locatedBy("//*[@id='testId-pod-image-48949571']");

    public static final Target BTN_AGREGAR_A_BOLSA = Target.the("boton agregar a la bolsa")
            .locatedBy("//button[@class = 'jsx-2166277967 button button-primary button-primary-xtra-large']");

    public static final Target BTN_VER_BOLSA = Target.the("boton agregar a la bolsa")
            .locatedBy("//a[@id= 'linkButton']");

    public static final Target BTN_IR_A_COMPRAR = Target.the("boton ir a comprar")
            .locatedBy("//button[@class = 'fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");

    public static final Target CORREO = Target.the("ingresar correo")
            .locatedBy("//input[@id = 'emailAddress']");

    public static final Target BTN_CONTINUAR = Target.the("boton continuar")
            .locatedBy("//button[@class = 'fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton']");

    public static final Target SELECCIONAR_DEPTO = Target.the("seleccionar departamento")
            .locatedBy("//*[@id='region']");

    public static final Target ANTIOQUIA = Target.the("antioquia")
            .locatedBy("//*[@id=\"region\"]/option[2]");

    public static final Target SELECCIONAR_CIUDAD = Target.the("seleccionar ciudad")
            .locatedBy("//*[@id='ciudad']");

    public static final Target MEDELLIN = Target.the("medellin")
            .locatedBy("//select[@id=\"ciudad\"]/option[40]");

    public static final Target SELECCIONAR_BARRIO = Target.the("seleccionar barrio")
            .locatedBy("//select[@id='comuna']");

    public static final Target MEDALLO = Target.the("medallo")
            .locatedBy("//select[@id=\"comuna\"]/option[2]");

    public static final Target CONTINUAR_BTN = Target.the("continuar boton")
            .locatedBy("//button[@class=\"fbra_button fbra_test_button fbra_formItem__field04\"]");

    public static final Target INGRESAR_DIRECCION = Target.the("ingresar direccion")
            .locatedBy("//input[@id='address']");

    public static final Target INGRESAR_APARTAMENTO = Target.the("ingresar apartamento")
            .locatedBy("//input[@id='departmentNumber']");

    public static final Target BTN_INGRESAR_DIRECCION = Target.the("boton ingresar direccion")
            .locatedBy("//button[@class=\"fbra_button fbra_test_button fbra_formItem__useAddress\"]");

    public static final Target CONTINUAR = Target.the("continuar")
            .locatedBy("//button[@class=\"fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton\"]");

    public static final Target SELECCIONAR_METODOPAGO = Target.the("seleccionar metodo de pago")
            .locatedBy("//span[@class=\"smallScreen otherPaymentOptions  anchorTitle fpay-wallet-leftcont \"]");






}
