/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inadex_main;
import Inadex_gui.VistaLogin;
/**
 *
 * @author zenca
 */
public class main {
    public static void main(String[] args) {
        VistaLogin  vista = new VistaLogin();
        System.out.println("inadex_main.main.main()");
        vista.setVisible(true);
        vista.setSize(583, 760);
        vista.setTitle("Inadex");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
    }
    
}
