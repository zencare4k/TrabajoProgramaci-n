/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Servicios.conexion_BBDD;
import Inadex_gui.VistaLogin;
import Inadex_gui.VistaSign_In;
import inadex_main.main;
import Inadex_gui.VistaMenu;
import java.awt.TextField;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author zenca
 */
public class Controlador{

 /* public void SigIn_LoginB(){
      stopBackgroundMusic();
      playSound("src/resources_audio/OK.wav");
      sigin.setResizable(false);
      sigin.setTitle("Inadex SigIn");
      sigin.setLocationRelativeTo(null);
      sigin.setSize(547, 768);
      sigin.setVisible(true);
      VistaLogin login = new VistaLogin();
      login.setVisible(false);
      dispose();
  }*/
/**
 * Controladores de el Sonido
 */
/*private static Clip backgroundMusic;
private static Clip OK;
private static VistaLogin login = new VistaLogin();*/

    public static void Login_Setting(){
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setTitle("Inadex Login");
        JFrame framel = new JFrame();        
        conexion_BBDD.Conectar();
    }
    //Audio al pulsar.
 
    //Audio de fondo en bucle.
   

  //Parar la musica.

    
    /**
     * Botones
     */
  //Acción del botón de el login funcional.
    /*public static void BLogin_Login(){
    JTextField field = new JTextField();
    
    playSound("src/resources_audio/OK.wav");

  

}
