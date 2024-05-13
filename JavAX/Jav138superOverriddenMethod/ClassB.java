package Jav138superOverriddenMethod;



public class ClassB  extends ClassA{
    // extends ClassA it means we inherit All the methods inside classA
    @Override
    void displayMethod() {
        // TODO Auto-generated method stub
        System.out.println("inside B Class");
        super.displayMethod();
    }

}
