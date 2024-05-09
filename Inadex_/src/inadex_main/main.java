/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inadex_main;

import Servicios.Servicios;
import Inadex_gui.VistaLogin;
import Inadex_gui.VistaSign_In;
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
import javax.swing.border.*;
/**
 *
 * @author Carlos Marban
 */


public class main {
           
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaLogin vistalogin = new VistaLogin();
      vistalogin.setVisible(true);
      vistalogin.setResizable(false);
      vistalogin.setLocationRelativeTo(null);

    }

}



