/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Posicion;

/**
 *
 * @author alumno
 */
public class Auto implements Posicion {
    int nroPuertas;
    String color;
    private int latitud;
    private int longitud;

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public Auto(int longi, int lati){
    
        this.latitud = lati;
        this.longitud = longi;  
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }
    
}
