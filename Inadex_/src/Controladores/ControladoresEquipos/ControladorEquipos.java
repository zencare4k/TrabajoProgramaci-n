package Controladores.ControladoresEquipos;

import Servicios.Servicios;
import Inadex_gui.VistasEquipos.VistaCampoGeneral;
import Modelos.Jugador;
import java.util.List;
import Modelos.JugadorConPosicion;
public class ControladorEquipos {
    private VistaCampoGeneral vista;
    private Servicios servicios;

    public ControladorEquipos(VistaCampoGeneral vista, Servicios servicios) {
        this.vista = vista;
        this.servicios = servicios;
        cargarEquiposEnComboBox();
        addComboBoxListener();
    }

    public void cargarEquiposEnComboBox() {
        List<String> equipos = servicios.getNombresEquipos(); // Debes tener este método en Servicios
        vista.getTeamChanger().removeAllItems();
        for (String nombre : equipos) {
            vista.getTeamChanger().addItem(nombre);
        }
    }

    private void addComboBoxListener() {
        vista.getTeamChanger().addActionListener(e -> {
            String nombreEquipo = (String) vista.getTeamChanger().getSelectedItem();
            int idEquipo = servicios.getIdEquipoPorNombre(nombreEquipo); // Debes tener este método en Servicios
           List<JugadorConPosicion> jugadores = servicios.getJugadoresYPosicionesPorEquipo(idEquipo);
vista.mostrarJugadoresConPosicion(jugadores);
        });
    }
}