package sv;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Servicios")
public class Servicios {

    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "password") String password, @WebParam(name = "username") String username) {

        int verificado = 0;
        for (int i = 0; i < listUsuarios.size(); i++) {
            if (username.equals(listUsuarios.get(i).getUsername()) && password.equals(listUsuarios.get(i).getPassword())) {
                verificado = 1;
            }
        }
        if (verificado == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Creamos una arrayLista para almacenar los datos.
    List<Usuarios> listUsuarios = new ArrayList<>();

    public Boolean registrarse(@WebParam(name = "password") String password, @WebParam(name = "username") String username, @WebParam(name = "dinero") double dinero) {
        int encontrado = 0;
        for (int i = 0; i < listUsuarios.size(); i++) {
            if (username.equals(listUsuarios.get(i).getUsername())) {
                encontrado = 1;
            }
        }
        if (encontrado == 1) {
            return false;
        } else {
            Usuarios newUsuario = new Usuarios(username, password, dinero);
            listUsuarios.add(newUsuario);
            return true;
        }
    }

    @WebMethod(operationName = "actualizarCuenta")
    public Boolean actualizarCuenta(@WebParam(name = "username") String username, @WebParam(name = "valor") double valor) {

        Usuarios usuario;
        int encontrado = 0;
        for (int i = 0; i < listUsuarios.size(); i++) {
            if (username.equals(listUsuarios.get(i).getUsername())) {
                usuario = listUsuarios.get(i);
                usuario.setDinero(valor);
                encontrado = 1;
            }
        }
        if (encontrado == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    @WebMethod(operationName = "setearSaldo")
    public Double setearSaldo(@WebParam(name = "username") String username) {
        Usuarios usuario;
        int encontrado = 0;
        double saldoCapturado = 0;
        for (int i = 0; i < listUsuarios.size(); i++) {
            if (username.equals(listUsuarios.get(i).getUsername())) {
                usuario = listUsuarios.get(i);
                saldoCapturado = usuario.getDinero();
                encontrado = 1;
            }
        }
        if (encontrado == 1) {
            return saldoCapturado;
        } else {
            return saldoCapturado;
        }
    }
    

    // ANTIGUO
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if (pago >= total) {
            // Es el vuelto del pago
            return pago - total;
        } else {
            // validar que es menos del total
            return -1;
        }
    }


}

// Clase Principal
class Usuarios {

    private String username;
    private String password;
    private double dinero;

    public Usuarios(String username, String password, double dinero) {
        this.username = username;
        this.password = password;
        this.dinero = dinero;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

}
