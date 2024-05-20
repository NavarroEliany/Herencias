

package com.mycompany.herencia;

import com.mycompany.herencia.people.Administrative;
import com.mycompany.herencia.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person =new Person ("asd2", "Eliany", 17); //Se crea la instancia
        System.out.println(" Hola tu nombre es: " + person.getName()); //Para accederr se crea un getter
        System.out.println("Persona: " );
        person.fingerPrintRegistry();
        
        Administrative admin = new Administrative("aa1", "Pedro", 20, "División de sistemas");
        System.out.println("Hola, lo hemos identificado como: " + admin.getName());
        System.out.println("Administrativo ");
        admin.fingerPrintRegistry();
    }
}
