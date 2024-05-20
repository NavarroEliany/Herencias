
package com.mycompany.herencia.people;

public class Teacher extends Person {
    private String[] subjects;

    public Teacher(String[] subjects, String ID, String name, int age) {
        super(ID, name, age);
        this.subjects = subjects;
    }
    
    public void seeStudentData(){
        System.out.println("Profesor viendo los datos del estudiante"  );
    }
    public void setsStudentGrades(){
        System.out.println("Profesor viendo las notas del estudiante" );
    }
}
