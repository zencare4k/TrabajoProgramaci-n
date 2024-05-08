/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import static Controladores.ControladorLogin.ComprobarUsuario;
import Inadex_gui.VistaLogin;
import Servicios.conexion_BBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marban
 */
public class ControladorLogin {
    private VistaLogin vistalogin;
    
   
    /**
     *
     * @return  */
    public static boolean ComprobarUsuario(){
            try {
            
            conexion_BBDD.Conectar();

            String usuario = vistalogin.getUsuarioLogin();
            String pass_login = vistalogin.getPassLogin();

            String query = "SELECT Usuario, Contrasena FROM usuarios WHERE Usuario = '" + usuario + "' AND Contrasena = '" + pass_login + "'";

            ResultSet rs = conexion_BBDD.EjecutarSentencia(query);
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Sesión iniciada");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

            
            conexion_BBDD.CerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta SQL: " + e.getMessage());
        }
    }
 
}


