/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

//Concatenando Strings
/**
 *
 * @author alumno
 */
public class Test1 {
    public static void main(String[] args) {
        String nombre = "James";
        String apellido = "Gosling";
        if(nombre.equals("James")) {
        System.out.println(nombre+" "+apellido);
    }
    
    String completo = nombre.concat(" "+apellido);
    if(nombre.equals("James")) {
    System.out.println(completo);
}
}
}
