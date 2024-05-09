package Servicios;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que proporciona servicios relacionados con el inicio de sesión.
 * Extiende la clase conexion_BBDD.
 * 
 * @author Carlos Marban
 */
public class ServiciosLogin extends conexion_BBDD {

    /**
     * Método para realizar el inicio de sesión.
     */
    public static boolean loginService(String usuario, String pass) {
        try {
            // Consulta parametrizada para evitar la inyección SQL
            String query = "SELECT Usuario, Contrasena FROM usuarios WHERE Usuario = ? AND Contrasena = ?";
            conexion_BBDD.Conectar();

            // Crear una consulta parametrizada
            java.sql.PreparedStatement statement = conexion_BBDD.conexion.prepareStatement(query);
            statement.setString(1, usuario);
            statement.setString(2, pass);

            // Ejecutar la consulta
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()) {
                // Si el usuario y la contraseña son correctos, devuelve verdadero
                return true;
            } else {
                // Si el usuario o la contraseña son incorrectos, muestra un mensaje de error
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                return false;
            }
        } catch (SQLException e) {
            // En caso de error de SQL, muestra un mensaje de error y devuelve falso
            JOptionPane.showMessageDialog(null, "Error en la consulta SQL: " + e.getMessage());
            return false;
        } finally {
            // Asegúrate de cerrar la conexión después de usarla
            conexion_BBDD.CerrarConexion();
        }
    }
}
