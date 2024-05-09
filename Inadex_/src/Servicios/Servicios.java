/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Controladores.ControladorLogin;
import Inadex_gui.VistaLogin;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Jose
 */
public class Servicios {
	private Connection connection;
	static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbName = "inadex";
	static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
	static String user = "root";
	static String pass = "";
	static String driver = "com.mysql.cj.jdbc.Driver";
    
    static Connection conexion;
    static Statement consulta;
    static ResultSet resultado;
    private ControladorLogin controladorLogin;

    //Conectar a la base de datos
    public static void Conectar(){
    	try {
           Class.forName(driver) ;
           conexion = DriverManager.getConnection(url, user, pass);
           System.out.println("Base de datos clientes.fdb situada en :\n "+url);
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
public boolean registrarUsuario(String Usuario, String Contrasena, String Correo, String Nombre, String Apellido) {
    String query = "INSERT INTO usuarios (Usuario, Contrasena, Correo, Nombre, Apellido) VALUES (?, ?, ?, ?, ?)";
    try {
        Conectar();

        PreparedStatement preparedStatement = conexion.prepareStatement(query);
        preparedStatement.setString(1, Usuario);
        preparedStatement.setString(2, Contrasena);
        preparedStatement.setString(3, Correo);
        preparedStatement.setString(4, Nombre);
        preparedStatement.setString(5, Apellido);

        int rowsInserted = preparedStatement.executeUpdate();

        // Cerrar la conexión
        CerrarConexion();
        if (Nombre.isEmpty() || Usuario.isEmpty() || Contrasena.isEmpty() || Correo.isEmpty() ||Apellido.isEmpty()) {
            CerrarConexion();
            controladorLogin.OcultarLogin();
            throw new IllegalArgumentException("Todos los campos son obligatorios.");
        }
        
        return rowsInserted > 0;
        
        
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    
}
    
}
