package laboratorio3;
import java.text.NumberFormat;
import java.util.Locale;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class NumberFormatTest1 {
    public static void main(String[] args) {
    // Establecer el Locale como US para usar el punto como 
    // separador decimal.
    NumberFormat nf = NumberFormat.getInstance(Locale.US);
    
    // Agrupar 
    nf.setGroupingUsed(true); 
    System.out.println(nf.format(10000000.0045451));
    
    // No agrupar
    nf.setGroupingUsed(false); 
    System.out.println(nf.format(10000000.0045451));
    System.out.println("Con 3 enteros mínimo");
    nf.setMinimumIntegerDigits(3);
    System.out.println(nf.format(12));
    System.out.println("Con 5 enteros máximo");
    nf.setMaximumIntegerDigits(5);
    System.out.println(nf.format(123456));
    System.out.println("Con 4 enteros máximo en los decimales");
    nf.setMaximumFractionDigits(4);
    System.out.println(nf.format(123.981454));
    System.out.println("Con 2 enteros mínimo en los decimales");
    nf.setMinimumFractionDigits(2);
    System.out.println(nf.format(45.2));
    }
}
