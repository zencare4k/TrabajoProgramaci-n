/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author zenca
 */
public class Jugador {
    private String NombreJugador;

    public  Jugador(String NombreJugador, int PT, int PE, int Tiro, int Aguante, int Fisico, int Control, int Defensa, int Rapidez, int Valor, String Elemento, String Posicion) {
        this.NombreJugador = NombreJugador;
        this.PT = PT;
        this.PE = PE;
        this.Tiro = Tiro;
        this.Aguante = Aguante;
        this.Fisico = Fisico;
        this.Control = Control;
        this.Defensa = Defensa;
        this.Rapidez = Rapidez;
        this.Valor = Valor;
        this.Elemento = Elemento;
        this.Posicion = Posicion;
    }

    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public int getPT() {
        return PT;
    }

    public void setPT(int PT) {
        this.PT = PT;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public int getTiro() {
        return Tiro;
    }

    public void setTiro(int Tiro) {
        this.Tiro = Tiro;
    }

    public int getAguante() {
        return Aguante;
    }

    public void setAguante(int Aguante) {
        this.Aguante = Aguante;
    }

    public int getFisico() {
        return Fisico;
    }

    public void setFisico(int Fisico) {
        this.Fisico = Fisico;
    }

    public int getControl() {
        return Control;
    }

    public void setControl(int Control) {
        this.Control = Control;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getRapidez() {
        return Rapidez;
    }

    public void setRapidez(int Rapidez) {
        this.Rapidez = Rapidez;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String Elemento) {
        this.Elemento = Elemento;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    private int PT;
    private int PE;
    private int Tiro;
    private int Aguante;
    private int Fisico;
    private int Control;
    private int Defensa;
    private int Rapidez;
    private int Valor;
    private String Elemento;
    private String Posicion;



}
