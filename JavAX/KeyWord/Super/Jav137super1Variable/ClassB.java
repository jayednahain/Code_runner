package Jav137super1Variable;



public class ClassB  extends ClassA{
    int value = 5;

    void display(){
        // access super class variable
        System.out.println(super.value);
        System.out.println(value);
    }
}
