/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.text.SimpleDateFormat;
/**
 *
 * @author alumno
 */
public class Fechas3 {
    public static void main(String args[]){
        Calendar c1 = new GregorianCalendar(2011,9,1);
        Date d1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2011,9,3);
        Date d2 = c2.getTime();
        if (d1.after(d2)) {
            System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
            System.out.println("d1 es antes que d2");
        }
        compararFechas();
     }
    
    public static String compararFechas(){
        Calendar c1 = new GregorianCalendar(2012,9,1);
        Date d1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2011,9,3);
        Date d2 = c2.getTime();
        if (d1.after(d2)) {
            System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
            System.out.println("d1 es antes que d2");
        }
        
         SimpleDateFormat df1 = new SimpleDateFormat();
         //System.out.println("df1 "+df1.format());
         
        return "";
    }
}
