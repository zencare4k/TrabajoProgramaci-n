package Controladores.ControladoresEquipos;

import Inadex_gui.VistasEquipos.VistaCrearEquipo;
import Servicios.Servicios;
import javax.swing.JOptionPane;

public class ControladorCrearEquipo {
    private VistaCrearEquipo vista;
    private Servicios servicios;

    public ControladorCrearEquipo(VistaCrearEquipo vista, Servicios servicios) {
        this.vista = vista;
        this.servicios = servicios;
    }

    public void crearEquipo() {
       String nombre = vista.getNombreEquipo().getText().trim();
String id = vista.getIDEquipo().getText().trim();
        // Si tienes JComboBox para elemento y tipo, descomenta y usa estas líneas:
        // String elemento = (String) vista.getElementoComboBox().getSelectedItem();
        // String tipo = (String) vista.getTipoComboBox().getSelectedItem();

        // Validación básica
        if (nombre.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "No puede haber campos vacíos.");
            return;
        }

        // Si tienes más campos, agrégalos aquí y en el método insertarEquipo
      boolean exito = servicios.insertarEquipo(Integer.parseInt(id), nombre );
        if (exito) {
            JOptionPane.showMessageDialog(vista, "Equipo creado correctamente.");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al crear el equipo.");
        }
    }
}