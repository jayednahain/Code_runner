package jav141this2;


public class Person {
   
    void displayMessage(){
        System.out.println("displayMessage called");
    }

    void displayInfo (){
        this.displayMessage();
        System.out.println("displayInfo called");

        System.out.println(this);
    }
}
