/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Inadex_gui.VistaLogin;
import Inadex_gui.VistaMusica;
import java.awt.TextField;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.sound.sampled.Clip;
/**
 *
 * @author Carlos Marban
 */
public class ServiciosLogin extends conexion_BBDD{
    public static void loginService(){
    VistaLogin login = new VistaLogin();
    
    
        
    String query = "SELECT Usuario, Contrasena FROM usuarios WHERE Usuario = '" + usuario_login + "' AND Contrasena = '" + pass_login + "'";

    try {
        conexion_BBDD.Conectar();
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
