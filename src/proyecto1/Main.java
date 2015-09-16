/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Date;

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
        p1 = new Person("Enrique", "Ramon", new Date (64,7,3));
        System.out.println(p1.getFullname());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
    }
}
