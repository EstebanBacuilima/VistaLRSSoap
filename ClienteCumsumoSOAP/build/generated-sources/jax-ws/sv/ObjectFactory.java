
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Login_QNAME = new QName("http://sv/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://sv/", "LoginResponse");
    private final static QName _ProcesarPago_QNAME = new QName("http://sv/", "ProcesarPago");
    private final static QName _ProcesarPagoResponse_QNAME = new QName("http://sv/", "ProcesarPagoResponse");
    private final static QName _ActualizarCuenta_QNAME = new QName("http://sv/", "actualizarCuenta");
    private final static QName _ActualizarCuentaResponse_QNAME = new QName("http://sv/", "actualizarCuentaResponse");
    private final static QName _Registrarse_QNAME = new QName("http://sv/", "registrarse");
    private final static QName _RegistrarseResponse_QNAME = new QName("http://sv/", "registrarseResponse");
    private final static QName _SetearSaldo_QNAME = new QName("http://sv/", "setearSaldo");
    private final static QName _SetearSaldoResponse_QNAME = new QName("http://sv/", "setearSaldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ProcesarPago }
     * 
     */
    public ProcesarPago createProcesarPago() {
        return new ProcesarPago();
    }

    /**
     * Create an instance of {@link ProcesarPagoResponse }
     * 
     */
    public ProcesarPagoResponse createProcesarPagoResponse() {
        return new ProcesarPagoResponse();
    }

    /**
     * Create an instance of {@link ActualizarCuenta }
     * 
     */
    public ActualizarCuenta createActualizarCuenta() {
        return new ActualizarCuenta();
    }

    /**
     * Create an instance of {@link ActualizarCuentaResponse }
     * 
     */
    public ActualizarCuentaResponse createActualizarCuentaResponse() {
        return new ActualizarCuentaResponse();
    }

    /**
     * Create an instance of {@link Registrarse }
     * 
     */
    public Registrarse createRegistrarse() {
        return new Registrarse();
    }

    /**
     * Create an instance of {@link RegistrarseResponse }
     * 
     */
    public RegistrarseResponse createRegistrarseResponse() {
        return new RegistrarseResponse();
    }

    /**
     * Create an instance of {@link SetearSaldo }
     * 
     */
    public SetearSaldo createSetearSaldo() {
        return new SetearSaldo();
    }

    /**
     * Create an instance of {@link SetearSaldoResponse }
     * 
     */
    public SetearSaldoResponse createSetearSaldoResponse() {
        return new SetearSaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "ProcesarPago")
    public JAXBElement<ProcesarPago> createProcesarPago(ProcesarPago value) {
        return new JAXBElement<ProcesarPago>(_ProcesarPago_QNAME, ProcesarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "ProcesarPagoResponse")
    public JAXBElement<ProcesarPagoResponse> createProcesarPagoResponse(ProcesarPagoResponse value) {
        return new JAXBElement<ProcesarPagoResponse>(_ProcesarPagoResponse_QNAME, ProcesarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "actualizarCuenta")
    public JAXBElement<ActualizarCuenta> createActualizarCuenta(ActualizarCuenta value) {
        return new JAXBElement<ActualizarCuenta>(_ActualizarCuenta_QNAME, ActualizarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCuentaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarCuentaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "actualizarCuentaResponse")
    public JAXBElement<ActualizarCuentaResponse> createActualizarCuentaResponse(ActualizarCuentaResponse value) {
        return new JAXBElement<ActualizarCuentaResponse>(_ActualizarCuentaResponse_QNAME, ActualizarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrarse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registrarse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "registrarse")
    public JAXBElement<Registrarse> createRegistrarse(Registrarse value) {
        return new JAXBElement<Registrarse>(_Registrarse_QNAME, Registrarse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "registrarseResponse")
    public JAXBElement<RegistrarseResponse> createRegistrarseResponse(RegistrarseResponse value) {
        return new JAXBElement<RegistrarseResponse>(_RegistrarseResponse_QNAME, RegistrarseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetearSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetearSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "setearSaldo")
    public JAXBElement<SetearSaldo> createSetearSaldo(SetearSaldo value) {
        return new JAXBElement<SetearSaldo>(_SetearSaldo_QNAME, SetearSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetearSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetearSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sv/", name = "setearSaldoResponse")
    public JAXBElement<SetearSaldoResponse> createSetearSaldoResponse(SetearSaldoResponse value) {
        return new JAXBElement<SetearSaldoResponse>(_SetearSaldoResponse_QNAME, SetearSaldoResponse.class, null, value);
    }

}
