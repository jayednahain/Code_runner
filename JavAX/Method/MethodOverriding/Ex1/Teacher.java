package JavAX.Method.MethodOverriding.Ex1;

public class Teacher extends Person {

    String qualification;


    @Override
    void displayInformation() {
        System.out.println("name          : "+Name);
        System.out.println("Age           : "+Age);
        System.out.println("qualification : "+qualification);        
    }
}