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

    public JugadorConPosicion(Jugador jugador, int posX, int posY) {
        this.jugador = jugador;
        this.posX = posX;
        this.posY = posY;
    }

    public Jugador getJugador() { return jugador; }
    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
}