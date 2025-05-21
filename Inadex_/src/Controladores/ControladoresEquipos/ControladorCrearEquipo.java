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

    if (nombre.isEmpty() || id.isEmpty()) {
        JOptionPane.showMessageDialog(vista, "No puede haber campos vacíos.");
        return;
    }

    boolean exito = servicios.insertarEquipo(Integer.parseInt(id), nombre);
    if (exito) {
        // Crear carpeta dinámica para el equipo
        String carpeta = getCarpetaEquipo(nombre);
        java.io.File dir = new java.io.File("src/Img/" + carpeta);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        JOptionPane.showMessageDialog(vista, "Equipo creado correctamente y carpeta creada: " + carpeta);
    } else {
        JOptionPane.showMessageDialog(vista, "Error al crear el equipo.");
    }
}

// Método para obtener el nombre de la carpeta de forma dinámica
private String getCarpetaEquipo(String nombreEquipo) {
    // Normaliza el nombre: minúsculas, reemplaza espacios y caracteres especiales
    String normalizado = nombreEquipo.trim().toLowerCase()
        .replace(" ", "_")
        .replace("-", "_")
        .replace("á", "a")
        .replace("é", "e")
        .replace("í", "i")
        .replace("ó", "o")
        .replace("ú", "u")
        .replace("ñ", "n");
    return normalizado;
}
}