/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Inadex_gui.VistaLogin;
import Servicios.Servicios;
import Servicios.Servicios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marban
 */
public class ControladorLogin {
    private VistaLogin vista;
    private Servicios servicios;
    
    public ControladorLogin(){
    this.servicios = new Servicios();
}
    public boolean login(String usuario, String contrasena) throws SQLException{
        return servicios.loginUsuario(usuario, contrasena);
    }
        public void setVista(VistaLogin vista){
        this.vista = vista;
    }
}
           


