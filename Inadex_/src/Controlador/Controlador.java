/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BBDD.conexion_BBDD;
import Inadex_gui.Login;
import Inadex_gui.Sign_In;
import inadex_.main;
import Inadex_gui.Menu;
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
public class Controlador extends Login {
    
Sign_In sigin = new Sign_In();
Menu menu = new Menu();
JTextField textField = new  JTextField();
  public void SigIn_LoginB(){
      stopBackgroundMusic();
      playSound("src/resources_audio/OK.wav");
      sigin.setResizable(false);
      sigin.setTitle("Inadex SigIn");
      sigin.setLocationRelativeTo(null);
      sigin.setSize(547, 768);
      sigin.setVisible(true);
      Login login = new Login();
      login.setVisible(false);
      dispose();
  }
/**
 * Controladores de el Sonido
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
        conexion_BBDD.Conectar();
    }
    //Audio al pulsar.
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
    //Audio de fondo en bucle.
   
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
  //Parar la musica.
    public static void stopBackgroundMusic() {
      do {          
          backgroundMusic.close();
          backgroundMusic.stop();
          
      } while (login == null);
    }
    
    /**
     * Botones
     */
  //Acción del botón de el login funcional.
     public static void BLogin_Login(){
    playSound("src/resources_audio/OK.wav");
    String usuario_login = Usuario_SignIn.getText();
    String pass_login = Contrasena_SignIn.getText();
    Menu menu = new Menu();

    String query = "SELECT Usuario, Contrasena FROM usuarios WHERE Usuario = '" + usuario_login + "' AND Contrasena = '" + pass_login + "'";

    try {
        conexion_BBDD.Conectar();
        ResultSet rs = conexion_BBDD.EjecutarSentencia(query);

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Sesión iniciada");
            stopBackgroundMusic();
            menu.setVisible(true);
            menu.setSize(615, 843);
            menu.setTitle("Inadex");
            menu.setResizable(false);
            menu.setLocationRelativeTo(null);
            dispose();

        } else { 
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }

        conexion_BBDD.CerrarConexion();
    } catch (SQLException e) { 
        JOptionPane.showMessageDialog(null, "Error en la consulta SQL: " + e.getMessage());
    }
    }

}
