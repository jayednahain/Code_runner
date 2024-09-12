package A1Topic;

/**
 * UpcastingDowncaseting
 */

 class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Dog barks");
        
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

/**
 * UpcastingDowncaseting
 */
public class UpcastingDowncaseting {

    public static void main(String[] args) {


        Dog dog = new Dog();

        dog.speak();


        // Animal animal = new Dog();
        // animal.speak();

        // Dog dog = (Dog) animal;
        // dog.speak();
    }
}