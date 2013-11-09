/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.lang.String;
/**
 *
 * @author alumno
 */
public class StringBufferTest {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");  
    sb.insert(11," en");
    sb.delete(21,sb.length());
    System.out.println(sb);
}
}
