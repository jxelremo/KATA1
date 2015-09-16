/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Person p1;
        Calendar f1;
        f1 = new GregorianCalendar().getInstance();
        f1.set(1964,7,3);
        
        p1 = new Person("Enrique", "Ramon", f1);
        System.out.println(p1.getFullname());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
    }
}
