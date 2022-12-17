package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.LoginVista;
import vista.cuentaVista;
import vista.registroVista;

public class UsuarioControlador {

    // Traer las vistas y la Clase
    private LoginVista vistaLogin;
    private registroVista registroVista;
    private cuentaVista cuentaVisa;

    private Usuario usuario;

    // Creamos nuestro constructora para inciar toodas las vistas y servicios que vamos utilizar
    public UsuarioControlador(LoginVista vistaLogin, registroVista registroVista, cuentaVista cuentaVisa, Usuario usuario) {
        this.vistaLogin = vistaLogin;
        this.registroVista = registroVista;
        this.cuentaVisa = cuentaVisa;
        this.usuario = usuario;
        Iniciar();
    }

    // Crear un metodo que muestr nuestra primera pantalla
    private void Iniciar() {
        vistaLogin.setVisible(true);
        vistaLogin.setLocationRelativeTo(null);
        registroVista.msgUsuario.setVisible(false);
        cuentaVisa.msgUsuario.setVisible(false);
        vistaLogin.msgUsuario.setVisible(false);
        Botones();
    }

    int opcion = 0;

    // Botones 
    public void Botones() {

        registroVista.registerBtn.addActionListener((ActionEvent e) -> {
            registrarUsuario();
        });

        vistaLogin.registerBtn.addActionListener((ActionEvent e) -> {
            registroVista.setVisible(true);
            vistaLogin.dispose();
        });

        vistaLogin.loginBtn.addActionListener((ActionEvent e) -> {
            loginUsuario();
        });

        cuentaVisa.depositoOpcion.addActionListener((ActionEvent e) -> {
            //hacerDeposito();
            opcion = 1;
            System.out.println("Es la opcion " + opcion);
        });
        
        cuentaVisa.getCerrarBtn().addActionListener((ActionEvent e) -> {
            //hacerDeposito();
            cuentaVisa.dispose();
            vistaLogin.setVisible(true);
        });

        cuentaVisa.retiroOpcion.addActionListener((ActionEvent e) -> {
            //hacerRetiro()
            opcion = 2;
            System.out.println("Es la opcion " + opcion);
        });

        cuentaVisa.registerSaldoBtn.addActionListener((ActionEvent e) -> {
            hacerTransacciones();
        });
    }

    private void registrarUsuario() {

        String username = registroVista.usernameTxt.getText();
        String password = registroVista.paswwordTxt.getText();
        String confirmar_password = registroVista.repPaswwordTxt.getText();
        String dinero = registroVista.saldoTxt.getText();
        int saldo = Integer.parseInt(dinero);

        if (password.equals(confirmar_password)) {
            if (usuario.registarUsuario(username, password, saldo)) {
                registroVista.msgUsuario.setVisible(true);
                registroVista.msgUsuario.setText("Creado Exitosamente");
                registroVista.setVisible(false);
                vistaLogin.setVisible(true);
            } else {
                registroVista.msgUsuario.setVisible(true);
                registroVista.msgUsuario.setText("Usuario Ya existente");
            }

        } else {
            registroVista.msgUsuario.setVisible(true);
            registroVista.msgUsuario.setText("Contraseñas no coinciden :(");
        }
    }

    private void loginUsuario() {

        vistaLogin.msgUsuario.setVisible(false);

        String username = vistaLogin.userTxt.getText();
        String password = vistaLogin.paswwordTxt.getText();

        double saldoUsuario;
        String saldoCapturado;

        if (vistaLogin.userTxt.getText().isEmpty() && vistaLogin.paswwordTxt.getText().isEmpty()) {
            vistaLogin.msgUsuario.setVisible(true);
            vistaLogin.msgUsuario.setForeground(Color.red);
            vistaLogin.msgUsuario.setText("Campos Vacios");
            
        } else {
            if (usuario.loginUsario(password, username)) {

                saldoUsuario = usuario.setearSaldo(username);
                saldoCapturado = String.valueOf(saldoUsuario);

                vistaLogin.setVisible(false);
                cuentaVisa.setVisible(true);
                cuentaVisa.usernameText.setText(username);
                cuentaVisa.saldoText.setText(saldoCapturado);

            } else {
                vistaLogin.msgUsuario.setVisible(true);
                vistaLogin.msgUsuario.setForeground(Color.red);
                vistaLogin.msgUsuario.setText("Revise sus credenciales");
            }
        }

    }

    private void hacerDeposito(String username, double saldoUsuario, double valorUsuario) {

        double resultado = saldoUsuario + valorUsuario;
        usuario.actualizarCuenta(username, resultado);

        // Actualizar los Datos
        cuentaVisa.msgUsuario.setText("Deposito Exitoso");
        saldoUsuario = usuario.setearSaldo(username);
        String saldoCapturado = String.valueOf(saldoUsuario);
        cuentaVisa.saldoText.setText(saldoCapturado);
    }

    private void hacerRetiro(String username, double saldoUsuario, double valorUsuario) {
        
        if (valorUsuario > saldoUsuario) {
            cuentaVisa.msgUsuario.setVisible(true);
            cuentaVisa.msgUsuario.setText("Sobrepasa su Saldo Actual");
            JOptionPane.showMessageDialog(null, "Sobrepasa su Saldo Actual", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double resultado = saldoUsuario - valorUsuario;
            usuario.actualizarCuenta(username, resultado);
            // Actualizar los Datos
            cuentaVisa.msgUsuario.setVisible(true);
            cuentaVisa.msgUsuario.setText("Retiro Exitoso");
            saldoUsuario = usuario.setearSaldo(username);
            String saldoCapturado = String.valueOf(saldoUsuario);
            cuentaVisa.saldoText.setText(saldoCapturado);
        }

    }

    private void hacerTransacciones() {

        cuentaVisa.msgUsuario.setVisible(false);
        // Capturo lo Actual
        String username = cuentaVisa.usernameText.getText();
        String saldoUsuarioCap = cuentaVisa.saldoText.getText();
        double saldoUsuario = Double.parseDouble(saldoUsuarioCap);

        // Capturo lo nuevo
        String valorDepositar = cuentaVisa.valorTxt.getText();
        double valorUsuario = Double.parseDouble(valorDepositar);

        //System.out.println("Datos actual retiro: " + saldoUsuario + "el digtado: " + valorUsuario);
        //System.out.println("Es la opcion " + opcion);
        if (opcion == 1) {
            System.out.println("Es la opcion " + opcion);
            hacerDeposito(username, saldoUsuario, valorUsuario);
        } else if (opcion == 2) {
            System.out.println("Es la opcion " + opcion);
            hacerRetiro(username, saldoUsuario, valorUsuario);
        }
    }
}
