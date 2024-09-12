
# Polymorphism
- Polymorphism is mechanism where a parent class reference variable can takes many forms

types of polymorphism
# Compile Time / static polymorphism / static binding
- method overloading
```java
    //same name but different parameter
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

public class ClassMain {
    public static void main(String[] args) {
        ClassA objactA = new ClassA();
        objactA.show();
        objactA.show("Jayed Nahian");
        objactA.show(5);
    }
}

```
- constructor overloading

# Run time / dynamic polymorphism / dynamic binding
- method overriding
```java
public class ClassB {
    // overridden method
    void displayInformation() {
        System.out.println("initial displayInformation Class B");
    }
}

public class ClassC extends ClassB {
    // override method
    void displayInformation() {
        System.out.println("- override displayInformation");
    }
}

public class ClassMain {   
    public static void main(String[] args) {
        //(reference variable)
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        objB.displayInformation();
        objC.displayInformation();    
    }
}

```
```java

```
- super class এর variable দিয়ে subclass এর object কে refer  

## example-1 area calculation
```java

//super class
public class Shape {
    Shape() {}
    // method declare
    double area() {
        return 0;
    }
        
}

public class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    // method override
    double area() {
        return length * width;
    }
    
}

public class Triangle extends Shape {
    double height, base;
    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    // method override
    double area() {
        return 0.5 * height * base ;
    }
}

public class Calcuation {
    public static void main(String[] args) {
        // Shape shapeObj = new Shape();
        Triangle triangleObj = new Triangle(10, 25);
        // runtime polymorphism / dynamic method dispatch
        System.out.println(triangleObj.area());

        Rectangle rectangleObj = new Rectangle(10, 35);
        System.out.println(rectangleObj.area());
    }
}

```

## ## example-1 area calculation - using array
```java
public class Calcuation {
    public static void main(String[] args) {

        Shape[] s = new Shape[3];
        // we are assign 3 object , from Shape class to this array 

        s[0] = new Shape();
        s[1] = new Triangle(20, 50);
        s[2] = new Rectangle(55, 60);

        // System.out.println(s[0].area());
        // System.out.println(s[1].area());
        // System.out.println(s[2].area());

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].area());
        }
    }
}
```
