
package com.mycompany.herencia.people;


    public class Person {
    private String ID;
    private String name;
    private int age;

    public Person(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    
    
    public void fingerPrintRegistry(){
        System.out.println("Registre su huella dactilar ");
    }
}
