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
public class Person {
    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public String getFullname() {
        return name + " " + surname;
    }
    
    public int getAge(){
        Date today = new Date(); 
        return (int)((today.getTime()-birthday.getTime())/(1000*60*60*24*365.25));
    }
}
