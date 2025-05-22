/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Controladores.ControladorLogin;
import Inadex_gui.VistaMenu;
import Modelos.Jugador;
import Modelos.Tecnica;
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
import Modelos.JugadorConPosicion;
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
        private VistaMenu menu;
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
public boolean borrarEquipoPorNombre(String nombreEquipo) {
    String sql = "DELETE FROM equipo WHERE Nombre_E = ?";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nombreEquipo);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
 public java.util.List<String> getNombresTecnicas() {
    java.util.List<String> lista = new java.util.ArrayList<>();
    try {
        Conectar();
        String sql = "SELECT nombre FROM tecnicas";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            lista.add(rs.getString("nombre"));
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return lista;
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


    public boolean insertarEquipo(int id, String nombre, String elemento, String tipo) {
    String sql = "INSERT INTO equipo (Id_E, Nombre_E, elemento, tipo) VALUES (?, ?, ?, ?)";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        ps.setString(3, elemento);
        ps.setString(4, tipo);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    public boolean insertarEquipo(int id, String nombre) {
    String sql = "INSERT INTO equipo (Id_E, Nombre_E) VALUES (?, ?)";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    public boolean borrarUsuario(String usuario) {
    String sql = "DELETE FROM usuarios WHERE Usuario = ?";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
public boolean loginUsuario(String Usuario, String Contrasena) {
    String sent = "SELECT * FROM usuarios WHERE Usuario = ? AND Contrasena = ?";
    if (Usuario.isEmpty() || Contrasena.isEmpty()) {
        menu = new VistaMenu();
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

public boolean insertarJugador(int id, String nombre, int pt, int pe, int tiro, int aguante, int fisico,
                              int control, int defensa, int rapidez, int valor, String elemento, String posicion) {
    String sql = "INSERT INTO jugador (Id_J, Nombre_J, PT, PE, Tiro, Aguante, Fisico, Control, Defensa, Rapidez, Valor, Elemento, Posicion) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, nombre);
        ps.setInt(3, pt);
        ps.setInt(4, pe);
        ps.setInt(5, tiro);
        ps.setInt(6, aguante);
        ps.setInt(7, fisico);
        ps.setInt(8, control);
        ps.setInt(9, defensa);
        ps.setInt(10, rapidez);
        ps.setInt(11, valor);
        ps.setString(12, elemento);
        ps.setString(13, posicion);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
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

            CerrarConexion();
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
    *Conseguir jugadores 
    *
    */
    public boolean insertarJugadorTecnica(int idJugador, int idTecnica) {
    String sql = "INSERT INTO jugador_tecnica (jugador_id, tecnica_id) VALUES (?, ?)";
    try {
        Conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idJugador);
        ps.setInt(2, idTecnica);
        ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

public int getIdTecnicaPorNombre(String nombre) {
    int id = -1;
    try {
        Conectar();
        String sql = "SELECT id FROM tecnicas WHERE nombre = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}
    
public Jugador getJugadorPorId(int id) {
    Jugador jugador = null;
    try {
        Conectar();
        String sql = "SELECT * FROM jugador WHERE Id_J = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            jugador = new Jugador(
                rs.getInt("Id_J"),
                rs.getString("Nombre_J"),
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
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return jugador;
}
 

public boolean insertarEquipoJugadorPosicion(int idEquipo, int idJugador) {
    String sql = "INSERT INTO equipo_jugador_posicion (Id_E, Id_J, posX, posY, nombreX, nombreY) VALUES (?, ?, 400, 300, 400, 379)";
    try {
        Conectar();
        java.sql.PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idEquipo);
        ps.setInt(2, idJugador);
        int filas = ps.executeUpdate();
        ps.close();
        CerrarConexion();
        return filas > 0;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}


public java.util.List<Tecnica> getTecnicasPorJugador(int idJugador) {
    java.util.List<Tecnica> tecnicas = new java.util.ArrayList<>();
    try {
        Conectar();
        String sql = "SELECT t.id, t.nombre, t.TP, t.elemento, t.tipo " +
                     "FROM jugador_tecnica jt " +
                     "JOIN tecnicas t ON jt.tecnica_id = t.id " +
                     "WHERE jt.jugador_id = ? LIMIT 4";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idJugador);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            tecnicas.add(new Tecnica(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("TP"),
                rs.getString("elemento"),
                rs.getString("tipo")
            ));
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return tecnicas;
}public List<JugadorConPosicion> getJugadoresYPosicionesPorEquipo(int idEquipo) {
    List<JugadorConPosicion> lista = new ArrayList<>();
    try {
        Conectar();
        String sql = "SELECT j.*, ejp.posX, ejp.posY, ejp.nombreX, ejp.nombreY, ejp.Id_E " +
                     "FROM jugador j " +
                     "JOIN equipo_jugador_posicion ejp ON j.Id_J = ejp.Id_J " +
                     "WHERE ejp.Id_E = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idEquipo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Jugador jugador = new Jugador(
                rs.getInt("Id_J"),
                rs.getString("Nombre_J"),
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
            int posX = rs.getInt("posX");
            int posY = rs.getInt("posY");
            int nombreX = rs.getInt("nombreX");
            int nombreY = rs.getInt("nombreY");
            int id_E = rs.getInt("Id_E");
            lista.add(new JugadorConPosicion(jugador, posX, posY, nombreX, nombreY, id_E));
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return lista;
}

    
public void actualizarPosicionJugadorCompleta(int idEquipo, int idJugador, int posX, int posY, int nombreX, int nombreY) throws SQLException {
    try {
        Conectar();
        String sql = "UPDATE equipo_jugador_posicion SET posX = ?, posY = ?, nombreX = ?, nombreY = ? WHERE Id_E = ? AND Id_J = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, posX);
        ps.setInt(2, posY);
        ps.setInt(3, nombreX);
        ps.setInt(4, nombreY);
        ps.setInt(5, idEquipo);
        ps.setInt(6, idJugador);
        ps.executeUpdate();
        ps.close();
        CerrarConexion();
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    }
}
public void actualizarPosicionJugador(int idEquipo, int idJugador, int posX, int posY) throws SQLException {
    try {
        Conectar();
        String sql = "UPDATE equipo_jugador_posicion SET posX = ?, posY = ? WHERE Id_E = ? AND Id_J = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, posX);
        ps.setInt(2, posY);
        ps.setInt(3, idEquipo);
        ps.setInt(4, idJugador);
        ps.executeUpdate();
        ps.close();
        CerrarConexion();
    } catch (SQLException e) {
        e.printStackTrace();
        throw e;
    }
}
 
public List<String> getNombresEquipos() {
    List<String> equipos = new ArrayList<>();
    try {
        Conectar();
        String sql = "SELECT Nombre_E FROM equipo";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            equipos.add(rs.getString("Nombre_E"));
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Equipos encontrados: " + equipos); // <-- Añade esto
    return equipos;
}

public int getIdEquipoPorNombre(String nombre) {
    int idEquipo = -1;
    try {
        Conectar();
        String sql = "SELECT Id_E FROM equipo WHERE Nombre_E = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            idEquipo = rs.getInt("Id_E");
        }
        rs.close();
        ps.close();
        CerrarConexion();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return idEquipo;
}
}

