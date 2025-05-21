/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package Controladores.ControladoresEquipos;

import Inadex_gui.VistasEquipos.VistaCrearJugador;
import Servicios.Servicios;
import javax.swing.JOptionPane;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
 public class ControladorCrearJugador {
    private VistaCrearJugador vista;
    private Servicios servicios;

    public ControladorCrearJugador(VistaCrearJugador vista, Servicios servicios) {
        this.vista = vista;
        this.servicios = servicios;
    }
    public void cargarEquiposEnComboBox() {
    java.util.List<String> equipos = servicios.getNombresEquipos();
    vista.setEquiposComboBox(equipos);
}
    // En el controlador
public void cargarTecnicasEnComboBox() {
    java.util.List<String> tecnicas = servicios.getNombresTecnicas();
    vista.setTecnicasComboBox(tecnicas);
}public void crearJugador() {
    // Recoge los datos de la vista
    String id = vista.getID().getText().trim();
    String nombre = vista.getNombre().getText().trim();
    String pt = vista.getPT().getText().trim();
    String pe = vista.getPE().getText().trim();
    String tiro = vista.getTiro().getText().trim();
    String aguante = vista.getAguante().getText().trim();
    String fisico = vista.getFisico().getText().trim();
    String control = vista.getControl().getText().trim();
    String defensa = vista.getDefensa().getText().trim();
    String rapidez = vista.getRapidez().getText().trim();
    String valor = vista.getValor().getText().trim();
    String elemento = (String) vista.getElemento().getSelectedItem();
    String posicion = (String) vista.getPosicion().getSelectedItem();
    String equipo = (String) vista.getjComboBox1().getSelectedItem();
    String rutaImagen = vista.getRutaImagenSeleccionada();

   String tecnica1 = (String) vista.getSM1().getSelectedItem();
String tecnica2 = (String) vista.getSM2().getSelectedItem();
String tecnica3 = (String) vista.getSM3().getSelectedItem();
String tecnica4 = (String) vista.getSm4().getSelectedItem();

    // Validación de campos vacíos
    if (id.isEmpty() || nombre.isEmpty() || pt.isEmpty() || pe.isEmpty() || tiro.isEmpty() ||
        aguante.isEmpty() || fisico.isEmpty() || control.isEmpty() || defensa.isEmpty() ||
        rapidez.isEmpty() || valor.isEmpty() || elemento == null || posicion == null ||
        equipo == null || rutaImagen == null ||
        tecnica1 == null || tecnica2 == null || tecnica3 == null || tecnica4 == null) {
        JOptionPane.showMessageDialog(vista, "No puede quedar ningún campo vacío ni técnica sin seleccionar.");
        return;
    }

    // Validación de posición
    if (!posicion.equals("PR") && !posicion.equals("DL") && !posicion.equals("MD") && !posicion.equals("DF")) {
        JOptionPane.showMessageDialog(vista, "La posición debe ser PR, DL, MD o DF.");
        return;
    }

    // Validación de ID único
    if (servicios.getJugadorPorId(Integer.parseInt(id)) != null) {
        JOptionPane.showMessageDialog(vista, "El ID de jugador ya existe.");
        return;
    }

    // Validación de técnicas repetidas
    java.util.Set<String> tecnicasSet = new java.util.HashSet<>();
    tecnicasSet.add(tecnica1);
    tecnicasSet.add(tecnica2);
    tecnicasSet.add(tecnica3);
    tecnicasSet.add(tecnica4);
    if (tecnicasSet.size() < 4) {
        JOptionPane.showMessageDialog(vista, "No puedes seleccionar técnicas repetidas.");
        return;
    }

    // Mover y renombrar la imagen
    String carpetaEquipo = "src/Img/" + equipo.toLowerCase();
    File carpeta = new File(carpetaEquipo);
    if (!carpeta.exists()) carpeta.mkdirs();
    String extension = rutaImagen.substring(rutaImagen.lastIndexOf('.'));
    String nombreImagen = id + extension;
    File destino = new File(carpeta, nombreImagen);
    try {
        Files.copy(
            Paths.get(rutaImagen),
            destino.toPath(),
            StandardCopyOption.REPLACE_EXISTING
        );
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(vista, "Error al copiar la imagen.");
        return;
    }

    // Guardar en la base de datos
    boolean exito = servicios.insertarJugador(
        Integer.parseInt(id), nombre, Integer.parseInt(pt), Integer.parseInt(pe),
        Integer.parseInt(tiro), Integer.parseInt(aguante), Integer.parseInt(fisico),
        Integer.parseInt(control), Integer.parseInt(defensa), Integer.parseInt(rapidez),
        Integer.parseInt(valor), elemento, posicion
    );
    if (!exito) {
        JOptionPane.showMessageDialog(vista, "Error al guardar el jugador.");
        return;
    }

    // Insertar en equipo_jugador_posicion
    int idEquipo = servicios.getIdEquipoPorNombre(equipo);
    boolean relOk = servicios.insertarEquipoJugadorPosicion(idEquipo, Integer.parseInt(id));
    if (!relOk) {
        JOptionPane.showMessageDialog(vista, "Error al asignar el jugador al equipo.");
        return;
    }

    // Insertar en jugador_tecnica las 4 técnicas
    int idJugador = Integer.parseInt(id);
    int idTec1 = servicios.getIdTecnicaPorNombre(tecnica1);
    int idTec2 = servicios.getIdTecnicaPorNombre(tecnica2);
    int idTec3 = servicios.getIdTecnicaPorNombre(tecnica3);
    int idTec4 = servicios.getIdTecnicaPorNombre(tecnica4);

    boolean ok1 = servicios.insertarJugadorTecnica(idJugador, idTec1);
    boolean ok2 = servicios.insertarJugadorTecnica(idJugador, idTec2);
    boolean ok3 = servicios.insertarJugadorTecnica(idJugador, idTec3);
    boolean ok4 = servicios.insertarJugadorTecnica(idJugador, idTec4);

    if (!ok1 || !ok2 || !ok3 || !ok4) {
        JOptionPane.showMessageDialog(vista, "Error al asignar las técnicas al jugador.");
        return;
    }

    JOptionPane.showMessageDialog(vista, "Jugador creado correctamente.");
}
}