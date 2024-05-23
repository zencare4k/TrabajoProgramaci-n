/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Controladores.ControladorLogin;
import Inadex_gui.VistaMenu;
import Modelos.Jugador;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class Servicios {
    public Jugador jugador;
	private Connection connection;
	static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbName = "inadex";
	static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
	static String user = "root";
	static String pass = "";
	static String driver = "com.mysql.cj.jdbc.Driver";
        private VistaMenu menu = new VistaMenu();
        static Connection conexion;
        static Statement consulta;
        static ResultSet resultado;
        private ControladorLogin controladorLogin;
       
    //Conectar a la base de datos
    public static void Conectar(){
    	try {
           Class.forName(driver) ;
           conexion = DriverManager.getConnection(url, user, pass);
           System.out.println("Base de datos inadex.fdb situada en :\n "+url);
           consulta = conexion.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    //Ejecutar la sentencia
    public static ResultSet EjecutarSentencia(String Sentencia){
        try {
        	resultado = consulta.executeQuery(Sentencia);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
    
    //para usar INSERT, DELETE y UPDATE  
    public static void EjecutarUpdate(String Sentencia) throws SQLException{
    	try{
    		consulta.executeUpdate(Sentencia);
    		System.out.println("Done.");
    	}catch(SQLException e){
    		//JOptionPane.showMessageDialog(null, e.getMessage());
    		throw new SQLException("");
    	} 
    }
    
    //para cerrar conexión
    public static void CerrarConexion(){
        try{
        	consulta.close();
        }catch(Exception e){}
    }
public boolean registrarUsuario(String Usuario, String Contrasena, String Correo, String Nombre, String Apellido) throws SQLException {
    String sent = "INSERT INTO usuarios (Usuario, Contrasena, Correo, Nombre, Apellido) VALUES (?, ?, ?, ?, ?)";
    if (Usuario.isEmpty() || Contrasena.isEmpty() || Correo.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        return false;
    }
    try {
        Conectar();
        PreparedStatement preparedStatement = conexion.prepareStatement(sent);
        preparedStatement.setString(1, Usuario);
        preparedStatement.setString(2, Contrasena);
        preparedStatement.setString(3, Correo);
        preparedStatement.setString(4, Nombre);
        preparedStatement.setString(5, Apellido);
        int rowsInserted = preparedStatement.executeUpdate();

        CerrarConexion();
     

        return rowsInserted > 0;
        
        
    } catch (SQLException e) {
        e.printStackTrace();

        return false;
    }
    
}
    
public boolean loginUsuario(String Usuario, String Contrasena) {
    String sent = "SELECT * FROM usuarios WHERE Usuario = ? AND Contrasena = ?";
    if (Usuario.isEmpty() || Contrasena.isEmpty()) {
        menu.dispose();
        JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        return false;
    }

    try {

        Conectar();
        PreparedStatement preparedStatement = conexion.prepareStatement(sent);
        preparedStatement.setString(1, Usuario);
        preparedStatement.setString(2, Contrasena);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        // Verificar si hay al menos una fila en el resultado
        return resultSet.next();
    } catch (SQLException e) {
        // Manejar la excepción de manera específica o proporcionar un mensaje de error descriptivo
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al intentar iniciar sesión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } finally {
        // Cerrar la conexión en un bloque finally para asegurarse de que siempre se cierre
        CerrarConexion();
}
}
/*
*VistaBorrar
*/



public boolean borrarUsuarios() {
    try {
        // Ejecutar la consulta para borrar todos los usuarios
        Conectar();
        String sent = "DELETE FROM usuarios";

        Statement statement = conexion.createStatement();
        EjecutarUpdate(sent);
        statement.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
 /*
*Servicio update    
*/

    /**
     *
     * @return
     * @throws SQLException
     */
     public List<String> getUsuarios() {
            List<String> usuarios;
            usuarios = new ArrayList<>();
        String query = "SELECT Usuario FROM usuarios";

        try {
            Conectar();
            ResultSet resultSet = EjecutarSentencia(query);

            while (resultSet.next()) {
                usuarios.add(resultSet.getString("Usuario"));
            }

            Servicios.CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public void updateUsuario(String usuario, String newUsuario, String newPassword) throws SQLException {
        String query = "UPDATE usuarios SET Usuario = '" + newUsuario + "', Contrasena = '" + newPassword + "' WHERE Usuario = '" + usuario + "'";
        
        try {
            Conectar();
            EjecutarUpdate(query);
            CerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException(e.getMessage());
        }
    }
    /*
    *Conseguir jugadores del brain
    *
    */
   
      public ArrayList<Jugador> getJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        String sql = "SELECT NombreJugador, PT, PE, Tiro, Aguante, Fisico, Control, Defensa, Rapidez, Valor, Elemento, Posicion FROM jugadores";

        try (
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                Jugador jugador = new Jugador(
                    rs.getString("NombreJugador"),
                    rs.getInt("PT"),
                    rs.getInt("PE"),
                    rs.getInt("Tiro"),
                    rs.getInt("Aguante"),
                    rs.getInt("Fisico"),
                    rs.getInt("Control"),
                    rs.getInt("Defensa"),
                    rs.getInt("Rapidez"),
                    rs.getInt("Valor"),
                    rs.getString("Elemento"),
                    rs.getString("Posicion")
                );
                jugadores.add(jugador);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jugadores;
    }
}