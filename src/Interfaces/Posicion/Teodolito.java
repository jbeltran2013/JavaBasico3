/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Posicion;

/**
 *
 * @author alumno
 */
public class Teodolito {
    
    public static void getDistancia( Posicion p1, Posicion p2){
        double resultado = p2.getLatitud()+p1.getLongitud();
        System.out.println("Distancia: "+resultado);
        
    }
    
    public static void main( String args[]){
        Posicion persona = new Persona(4,5);
        Posicion carro = new Auto(4,5);
                
        getDistancia(carro,persona);
        
    } 
}
