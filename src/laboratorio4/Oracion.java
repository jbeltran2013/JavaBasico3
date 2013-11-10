/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class Oracion implements Capitalizable {
    String texto;
    
    Oracion(String n){
          texto=n;
    }
    
    public String agregaPalabra(String t) {
       texto=texto.concat(" "+t);
       return texto;
    }
    
    //metodos de Interfase
    public String cambiaMayuscula(){
        return texto.toUpperCase();
    } 
    
    public String cambiaMinuscula(){
        return texto.toLowerCase();
    }
}
