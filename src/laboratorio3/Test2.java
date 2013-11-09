/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

//Extacción substring
/**
 *
 * @author alumno
 */
public class Test2 {
    public static void main(String[] args) {
        String texto = "Tecsup";
        System.out.println("Número de Caracteres: "+texto.length()+"\n");
        for (int i=0; i<texto.length(); i++) {
        System.out.println(texto.substring(i,i+1)+"\n");
    }
    }
}
