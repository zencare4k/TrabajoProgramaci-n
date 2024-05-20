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
                updateUsuario();
            }
        });
        
        loadUsuarios();
    }

    private void loadUsuarios() {
        try {
            List<String> usuarios = servicios.getUsuarios();
            vista.setUserComboBoxData(usuarios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Error al cargar usuarios: " + e.getMessage());
        }
    }

    private void updateUsuario() {
        String usuario = vista.getSelectedUsuario();
        String newUsuario = vista.getNewUsuario();
        String newPassword = vista.getNewPassword();
        
        try {
            servicios.updateUsuario(usuario, newUsuario, newPassword);
            loadUsuarios();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(vista, "Error al actualizar usuario: " + e.getMessage());
        }
    }
}
