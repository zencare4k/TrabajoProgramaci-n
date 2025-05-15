package Controladores.ControladoresEquipos;

import Inadex_gui.VistaMenu;
import Inadex_gui.VistasEquipos.VistaRaimonCampo;
import Modelos.Jugador;
import Servicios.Servicios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorRaimon {
    private Servicios servicios = new Servicios();
    private ArrayList<Jugador> jugadores;
        private VistaRaimonCampo vista = new VistaRaimonCampo( );

    
    // Constructor que toma VistaMenu, VistaRaimon y Servicios
      public ControladorRaimon(Servicios servicios) {
        this.servicios = new Servicios(); // Inicializamos el objeto servicios con el valor pasado como argumento
    }

  
}