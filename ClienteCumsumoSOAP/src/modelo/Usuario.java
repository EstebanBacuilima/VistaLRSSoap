package modelo;

import sv.Servicios;
import sv.Servicios_Service;

public class Usuario {

    Servicios_Service servicios = new Servicios_Service();
    Servicios cliente = servicios.getServiciosPort();

    public Boolean loginUsario(String username, String password) {
        boolean respuestaServido = cliente.login(username, password);
        return respuestaServido;
    }

    public Boolean registarUsuario(String username, String password, double dinero) {
        boolean respuestaServido = cliente.registrarse(password, username, dinero);
        return respuestaServido;
    }

    public Boolean actualizarCuenta(String username, double valor) {
        boolean respuestaServido = cliente.actualizarCuenta(username, valor);
        return respuestaServido;
    }
    
    public double setearSaldo(String username) {
        double respuestaServido = cliente.setearSaldo(username);
        return respuestaServido;
    }
}
