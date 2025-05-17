/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

public class Tecnica {
    private int id;
    private String nombre;
    private int TP;
    private String elemento;
    private String tipo;

    public Tecnica(int id, String nombre, int TP, String elemento, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.TP = TP;
        this.elemento = elemento;
        this.tipo = tipo;
    }

    public int getId() {
        return id; 
    }
    
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public int getTP() { 
        return TP;
    }
    public void setTP(int TP) {
        this.TP = TP; 
    }

    public String getElemento() { 
        return elemento; 
    }
    public void setElemento(String elemento) { this.elemento = elemento; }

    public String getTipo() { 
        return tipo; 
    }
    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }
}