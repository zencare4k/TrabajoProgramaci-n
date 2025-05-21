package Controladores.ControladoresEquipos;

import Servicios.Servicios;
import Inadex_gui.VistasEquipos.VistaCampoGeneral;
import Modelos.Jugador;
import java.util.List;
import Modelos.JugadorConPosicion;
public class ControladorEquipos {
    private VistaCampoGeneral vista;
    private Servicios servicios;

    public VistaCampoGeneral getVista() {
        return vista;
    }

    public void setVista(VistaCampoGeneral vista) {
        this.vista = vista;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
public String obtenerCarpetaEquipo(String nombreEquipo) {
    // Normaliza el nombre: minúsculas, sin espacios, sin guiones, sin tildes
    String normalizado = nombreEquipo.trim().toLowerCase()
        .replace(" ", "_")
        .replace("-", "_")
        .replace("á", "a")
        .replace("é", "e")
        .replace("í", "i")
        .replace("ó", "o")
        .replace("ú", "u");

    switch (normalizado) {
        case "royal_academy": return "royal_academy";
        case "raimon": return "raimon";
        case "brainwashing": return "brainwashing";
        case "inazuma_kids_fc": return "inazuma_kfc";
        case "zeus": return "Zeus";
        case "occult": return "occult";
        case "otaku": return "otaku";
        case "wild": return "wilds";
        case "umbrella": return "umbrella";
        case "sallys_street":
        case "street_sallys":
        case "streetsallys":
            return "street_sallys"; // Carpeta real con guion bajo
        case "shuriken": return "Shuriken";
        case "farm": return "Farm";
        case "raimon_og":
        case "inazuma_eleven":
        case "inazumaeleven":
            return "InazumaEleven";
        // Añade aquí todos los equipos y sus carpetas reales
        default: return normalizado;
    }
}
public ControladorEquipos(VistaCampoGeneral vista, Servicios servicios) {
    this.vista = vista;
    this.servicios = servicios;
    cargarEquiposEnComboBox();
    addComboBoxListener();

    // Mostrar el primer equipo automáticamente al iniciar
    if (vista.getTeamChanger().getItemCount() > 0) {
        vista.getTeamChanger().setSelectedIndex(0);
        String nombreEquipo = (String) vista.getTeamChanger().getSelectedItem();
        int idEquipo = servicios.getIdEquipoPorNombre(nombreEquipo);
        List<JugadorConPosicion> jugadores = servicios.getJugadoresYPosicionesPorEquipo(idEquipo);
        String carpeta = obtenerCarpetaEquipo(nombreEquipo);
        vista.mostrarJugadoresConPosicion(jugadores, carpeta);
    }
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
        int idEquipo = servicios.getIdEquipoPorNombre(nombreEquipo);
        List<JugadorConPosicion> jugadores = servicios.getJugadoresYPosicionesPorEquipo(idEquipo);
        String carpeta = obtenerCarpetaEquipo(nombreEquipo);
        vista.mostrarJugadoresConPosicion(jugadores, carpeta);
    });
}

}