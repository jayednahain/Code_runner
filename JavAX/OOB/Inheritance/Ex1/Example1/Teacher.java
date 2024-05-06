package Jav128InheritancePratice.Example1;

public class Teacher extends Person {

    String department;
    String subject;

    Teacher() {
        System.out.println("|| Teacher || init -");
    }
    
    void displayInfoFromTeacher() {
        displayPersonInfo();
        System.out.println("department : " + department);
        System.out.println("subject : "+ subject);
        
    }
    
    
}
