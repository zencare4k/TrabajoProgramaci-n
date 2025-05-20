/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author zenca
 */
public class JugadorConPosicion {
    private Jugador jugador;
    private int posX;
    private int posY;
    private int nombreX;
    private int nombreY;
    private int Id_E;
    
    
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setNombreX(int nombreX) {
        this.nombreX = nombreX;
    }

    public void setNombreY(int nombreY) {
        this.nombreY = nombreY;
    }

    public JugadorConPosicion(Jugador jugador, int posX, int posY, int nombreX, int nombreY, int Id_E) {
        this.jugador = jugador;
        this.posX = posX;
        this.posY = posY;
        this.nombreX = nombreX;
        this.nombreY = nombreY;
        this.Id_E = Id_E;
        
    }

    public Jugador getJugador() { return jugador; }
    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
    public int getNombreX() { return nombreX; }
    public int getNombreY() { return nombreY; }

    public int getId_E() {
        return Id_E;
    }

    public void setId_E(int id_E) {
        Id_E = id_E;
    }
}