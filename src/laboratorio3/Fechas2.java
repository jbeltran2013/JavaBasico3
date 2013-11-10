/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.text.*;
/**
 *
 * @author alumno
 */
public class Fechas2 {
 public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now.getTime());
    DateFormat df = DateFormat.getDateInstance();
    DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
    SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");   
    
    //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
     DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
     
    String s = df.format(now);
    String s1 = df1.format(now);
    String s2 = df2.format(now);
    String s3 = df3.format(now);
    String s4 = df4.format(now);
    String s5 = df5.format(now);
    String s6 = df6.format(now); 
    System.out.println("(Default) Hoy es " + s);
    System.out.println("(SHORT) Hoy es " + s1);
    System.out.println("(MEDIUM) Hoy es " + s2);
    System.out.println("(LONG) Hoy es " + s3);
    System.out.println("(FULL) Hoy es " + s4);
    System.out.println("(CUSTOM) Hoy es " + s5);
    System.out.println("(Short americano) Hoy es " + s6);
    
    
    }
}
