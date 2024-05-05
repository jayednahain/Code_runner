package Jav128InheritancePratice.Example1;

public class Student extends Person {

    String academicClass;
    String section;
    
    Student() {
        System.out.println("|| Student || init -");
    }

    void displayInfoFromStudent() {
        displayPersonInfo();
        System.out.println("academicClass : " + academicClass);
        System.out.println("section : "+ section);
        
    }
    
}
