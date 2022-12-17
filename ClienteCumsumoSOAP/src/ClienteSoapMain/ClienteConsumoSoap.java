package ClienteSoapMain;

import controlador.UsuarioControlador;
import modelo.Usuario;
import vista.LoginVista;
import vista.cuentaVista;
import vista.registroVista;

public class ClienteConsumoSoap {

    public static void main(String[] args) {
        
        // Instanciamos todos los elementos y clases a usar
        Usuario usuario = new Usuario();
        LoginVista vistaLogin = new LoginVista();
        cuentaVista vistaCuenta = new cuentaVista();
        registroVista vistaRegistro = new registroVista();
        
        // Iniciamos el Controlador
        UsuarioControlador newControlador = new UsuarioControlador(vistaLogin, vistaRegistro, vistaCuenta, usuario);

    }
    
}
