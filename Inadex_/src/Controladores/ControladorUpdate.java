/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Inadex_gui.VistaUpdate;
import Servicios.Servicios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author zenca
 */
public class ControladorUpdate {
 private Servicios servicios;
    private VistaUpdate vista;

    public ControladorUpdate (Servicios servicios, VistaUpdate vista) {
        this.servicios = servicios;
        this.vista = vista;
        
        vista.getUpdateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateUsuario();
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        loadUsuarios();
    }

    public void loadUsuarios() {
        try {
            List<String> usuarios = servicios.getUsuarios();
            vista.setUserComboBoxData(usuarios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Error al cargar usuarios: " + e.getMessage());
        }
    }

    public void updateUsuario() throws SQLException {
        String usuario = vista.getSelectedUsuario();
        String newUsuario = vista.getNewUsuario();
        String newPassword = vista.getNewPassword();
        
            servicios.updateUsuario(usuario, newUsuario, newPassword);
            loadUsuarios();
      
    }
}

