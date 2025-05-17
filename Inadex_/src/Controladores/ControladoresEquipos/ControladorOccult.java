package Controladores.ControladoresEquipos;

import Inadex_gui.VistaDetalles;
import Modelos.Jugador;
import Modelos.Tecnica;
import Servicios.Servicios;
import java.util.List;
import javax.swing.JLabel;

public class ControladorOccult {
    private Servicios servicios = new Servicios();

    public void mostrarDetallesJugador(JLabel label) {
        try {
            String nombre = label.getName(); // "_49", "_50", etc.
            int id = Integer.parseInt(nombre.substring(1));
            Jugador jugador = servicios.getJugadorPorId(id);
            List<Tecnica> tecnicas = servicios.getTecnicasPorJugador(id);

            VistaDetalles detalles = new VistaDetalles();
            detalles.setDatosJugador(jugador, tecnicas, label.getIcon());
            detalles.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}