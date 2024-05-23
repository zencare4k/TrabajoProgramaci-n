/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inadex_gui;
import Servicios.Servicios;
import Inadex_gui.VistaLogin;

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
 * @author Carlos Marban
 */
public class VistaMusica {
   private static Clip backgroundMusic;
   private static Clip OK; 
      public  void playSound(String filename){
        try {
            File file = new File (filename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            OK = AudioSystem.getClip();
            OK.open(audioInputStream);
            OK.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
   //Musica de fondo
   public static void playBackgroundMusic(String filename){
         try {
            File file = new File(filename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            backgroundMusic = AudioSystem.getClip();
            backgroundMusic.open(audioInputStream);
            backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY); 
            backgroundMusic.start();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }

}
