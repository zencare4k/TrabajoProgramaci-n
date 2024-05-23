package Controladores.ControladoresEquipos;

import Inadex_gui.VistaMenu;
import Inadex_gui.VistasEquipos.VistaRaimon;
import Modelos.Jugador;
import Servicios.Servicios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorRaimon {
    private VistaRaimon vista;
    private Servicios servicios;

    // Constructor que toma VistaMenu, VistaRaimon y Servicios
      public ControladorRaimon(VistaRaimon vista, Servicios servicios) {
        this.vista = vista;
        this.servicios = servicios; // Inicializamos el objeto servicios con el valor pasado como argumento
    }

    // Método para inicializar el controlador
 
    // Método para cargar jugadores
     public ArrayList<Jugador> cargarJugadores() {
        if (servicios != null) { // Verificamos que servicios no sea null antes de usarlo
            // Cargar los jugadores desde el modelo y actualizarlos en la vista
            List<Jugador> jugadoresList = servicios.getJugadores();
            vista.setJugadores(jugadoresList);
        } else {
            System.err.println("El objeto servicios no ha sido inicializado correctamente.");
        }
        return servicios.getJugadores();
    }
}