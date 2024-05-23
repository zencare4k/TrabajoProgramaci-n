/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Inadex_gui.VistaDelete;
import Servicios.Servicios;
import java.awt.List;

/**
 *
 * @author zenca
 */
public class ControladorBorrar {
    Servicios servicios = new Servicios();
    public boolean ControladorBorrarv(){
    return servicios.borrarUsuarios();
}
}