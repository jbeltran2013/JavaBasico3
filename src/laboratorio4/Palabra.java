/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 *
 * @author alumno
 */
public class Palabra implements Capitalizable {
    String texto;
    
    Palabra(String n){
       texto=n.replaceAll(" ","");
    }
    
    //metodos de Interfase
    public String cambiaMayuscula(){
        return texto.toUpperCase();
    } 
    public String cambiaMinuscula(){
        return texto.toLowerCase();
    }
}
