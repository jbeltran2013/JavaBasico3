/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.*;
import java.text.*;
/**
 *
 * @author alumno
 */
public class NumberFormatTest2 {
    public static void main(String[] args) {
    // Formato de moneda
    NumberFormat nfe = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    nfe.setGroupingUsed(false);
    NumberFormat nfd = NumberFormat.getCurrencyInstance(Locale.US);
    nfd.setGroupingUsed(false);
    Locale lp = new Locale("es", "PE");
    NumberFormat nfp = NumberFormat.getCurrencyInstance(lp);
    nfp.setGroupingUsed(false);
    System.out.println("Moneda Euro :"+nfe.format(150));
    System.out.println("Moneda Dolar :"+nfd.format(150));
    System.out.println("Moneda Soles :"+nfp.format(150));
    }
}
