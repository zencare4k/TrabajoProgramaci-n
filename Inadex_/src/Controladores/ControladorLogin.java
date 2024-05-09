/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Inadex_gui.VistaLogin;
import Servicios.ServiciosLogin;
import Servicios.conexion_BBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marban
 */
public class ControladorLogin {
    private VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public void metodoControlLogin() {
        // Obtener el usuario y la contraseña de la vista
        String usuario = vista.obtenerUsuario();
        String contrasena = vista.obtenerPass();

        // Llamar al servicio de inicio de sesión para autenticar al usuario
         ServiciosLogin.loginService(usuario, contrasena);    
    }
}
           


