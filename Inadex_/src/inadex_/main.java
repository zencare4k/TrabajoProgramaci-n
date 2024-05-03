/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inadex_;

import Inadex_gui.Login;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Carlos Marban
 */


public class main {
    /**
     * @param args the command line arguments
     */
private static Clip backgroundMusic;
private static Clip OK;

private static Login login = new Login();
    public static void main(String[] args) {
    
        
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setTitle("Inadex Login");
        JFrame framel = new JFrame();
        //registrarse
        
      
        
        
       
    }
  
    
 
    
    
    
    //audio al pulsar jbutton
    
    public static void playSound(String filename){
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
    
 

     
    //audio de fondo
   
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
  public static void stopBackgroundMusic() {
      do {          
          backgroundMusic.close();
          backgroundMusic.stop();
          
      } while (login == null);
    }
 
}



