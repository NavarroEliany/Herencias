
package com.mycompany.herencia.people;


public class Administrative extends Person { //extends para que se extienda a otra clase
    private String dependency;

    public Administrative(String ID, String name, int age,String dependency) { //Se colocan los atributos de la otra clase a la que se expandio 
        super(ID, name, age); //Super llama a la clase padre que envia los valores
        this.dependency = dependency;
    }
    
    public void seeData(){  //Se crea el metodo
        System.out.println(" Mostrar datos al administrativo " );
    }
}
