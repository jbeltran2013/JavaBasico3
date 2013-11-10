/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Posicion;

/**
 *
 * @author alumno
 */
public class Persona implements Posicion {
    String nombre;
    String sexo;
    private int latitud;
    private int longitud;

    
    public Persona(int longi, int lati){
    
        this.latitud = lati;
        this.longitud = longi;  
    }
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
