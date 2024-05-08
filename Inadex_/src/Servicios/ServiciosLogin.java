package Servicios;

import Inadex_gui.VistaLogin;
import Inadex_gui.VistaMusica;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 * Clase que proporciona servicios relacionados con el inicio de sesión.
 * Extiende la clase conexion_BBDD.
 * 
 * @author Carlos Marban
 */
public class ServiciosLogin extends conexion_BBDD {
    private VistaLogin vistalogin;

    /**
     * Método para realizar el inicio de sesión.
     */
    public void loginService() {
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
