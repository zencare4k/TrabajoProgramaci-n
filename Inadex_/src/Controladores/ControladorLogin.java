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

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public  void Ususpass() {
        String usuario = vista.obtenerUsuario();
        String contrasena = vista.obtenerPass();
    }
    public void MostrarLogin(){
        vista.setVisible(true);
    }
    public void OcultarLogin(){
        vista.setVisible(false);
    }
    
}
           


