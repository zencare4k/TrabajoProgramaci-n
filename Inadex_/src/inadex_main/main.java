/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inadex_main;
import Controladores.ControladoresEquipos.ControladorRaimon;
import Controladores.ControladorUpdate;
import Inadex_gui.VistaDelete;
import Inadex_gui.VistaLogin;
import Inadex_gui.VistaMenu;
import Inadex_gui.VistaMusica;
import javax.swing.SwingUtilities;
import Servicios.Servicios;
import Inadex_gui.VistaUpdate;
/**
 *
 * @author zenca
 */
public class main {
    public static void main(String[] args) {
         VistaMusica musica = new VistaMusica();
        VistaLogin vista = new VistaLogin();
        musica.playSound("src/resources_audio/Mark_inazuma.wav");
        musica.playSound("src/resources_audio/Login_Background.wav");
        System.out.println("inadex_main.main.main()");
        vista.setVisible(true);
        vista.setSize(583, 760);
        vista.setTitle("Inadex");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
       
    }
            
    }
            

