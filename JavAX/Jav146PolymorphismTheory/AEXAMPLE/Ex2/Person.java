package Ex2;

public class Person {
    String name;
    int age;

    Person() {
        System.out.println("Person CLASS init----");
    }

    void displayInformation() {
        System.out.println("Name: "+name);
        System.out.println("Age : " + age);
        System.out.println("Person information");
    }
}
