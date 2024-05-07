/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Inadex_gui.VistaLogin;
import Inadex_gui.VistaMusica;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author Carlos Marban
 */
public class ServiciosLogin extends conexion_BBDD{
    public static void loginService(){
      
        
    String query = "SELECT Usuario, Contrasena FROM usuarios WHERE Usuario = '" + usuario_login + "' AND Contrasena = '" + pass_login + "'";

    try {
        conexion_BBDD.Conectar();
        ResultSet rs = conexion_BBDD.EjecutarSentencia(query);

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Sesión iniciada");
            menu.setVisible(true);
            menu.setSize(615, 843);
            menu.setTitle("Inadex");
            menu.setResizable(false);
            menu.setLocationRelativeTo(null);
            dispose();

        } else { 
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }

        conexion_BBDD.CerrarConexion();
    } catch (SQLException e) { 
        JOptionPane.showMessageDialog(null, "Error en la consulta SQL: " + e.getMessage());
    }
    }
}
