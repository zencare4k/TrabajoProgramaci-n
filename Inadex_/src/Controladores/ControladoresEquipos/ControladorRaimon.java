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
    private Servicios servicios = new Servicios();
    private ArrayList<Jugador> jugadores;
        private VistaRaimon vista = new VistaRaimon(jugadores);

    
    // Constructor que toma VistaMenu, VistaRaimon y Servicios
      public ControladorRaimon(Servicios servicios) {
        this.servicios = new Servicios(); // Inicializamos el objeto servicios con el valor pasado como argumento
    }

    // Método para inicializar el controlador
 
    // Método para cargar jugadores
     public ArrayList<Jugador> cargarJugadores() {
        if (servicios != null) { 
            
            ArrayList<Jugador> jugadoresList = servicios.getJugadores();
            vista.setJugadores(jugadoresList);
        } else {
            System.err.println("El objeto servicios no ha sido inicializado correctamente.");
        }
        return servicios.getJugadores();
    }
}