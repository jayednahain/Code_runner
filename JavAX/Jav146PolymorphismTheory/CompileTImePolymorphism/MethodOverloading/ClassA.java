package Jav146PolymorphismTheory.CompileTImePolymorphism.MethodOverloading;

/**
 * ClassA
 */
public class ClassA {
    void show() {
        System.out.println("init method");
    }
    void show(int age) {
        System.out.println("age is : "+age);
    }

    void show(String name) {
        System.out.println("name : " + name);
    }
}