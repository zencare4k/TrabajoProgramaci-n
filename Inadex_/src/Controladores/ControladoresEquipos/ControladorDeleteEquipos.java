/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.ControladoresEquipos;

import Inadex_gui.VistasEquipos.VistaDeleteEquipos;
import Servicios.Servicios;
import javax.swing.JOptionPane;

public class ControladorDeleteEquipos {
    private VistaDeleteEquipos vista;
    private Servicios servicios;

    public ControladorDeleteEquipos(VistaDeleteEquipos vista, Servicios servicios) {
        this.vista = vista;
        this.servicios = servicios;
        inicializar();
    }

    private void inicializar() {
        // Rellenar el ComboBox con los nombres de los equipos
        vista.getEquipos().removeAllItems();
        for (String nombre : servicios.getNombresEquipos()) {
            vista.getEquipos().addItem(nombre);
        }

        // Añadir acción al botón borrar
        vista.getDelete().addActionListener(e -> borrarEquipoSeleccionado());
    }

    private void borrarEquipoSeleccionado() {
        String nombreEquipo = (String) vista.getEquipos().getSelectedItem();
        if (nombreEquipo == null) {
            JOptionPane.showMessageDialog(vista, "Selecciona un equipo.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(vista, "¿Seguro que quieres borrar el equipo " + nombreEquipo + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean exito = servicios.borrarEquipoPorNombre(nombreEquipo);
            if (exito) {
                JOptionPane.showMessageDialog(vista, "Equipo borrado correctamente.");
                vista.getEquipos().removeItem(nombreEquipo);
            } else {
                JOptionPane.showMessageDialog(vista, "Error al borrar el equipo.");
            }
        }
    }
}