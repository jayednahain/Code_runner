### hiding the implementation
### hiding function definition from user
### hiding function implementation
### 
#  two types of abstraction in java
- Abstract class (0-100%) - how much we want to abstract 5% 50% 60% ?
    - Abstract method
    - Abstract class
- interface (100%) - always 100% abstraction 

# Abstract method
- Abstract does not have any definition.
- Abstract method must be stay in Abstract class
- Abstract method must be overridden.
    - if we extends a Abstract class the Abstract method must be overridden
- Abstract method cant be final;
- 

# Abstract Class
- Abstract class has both Abstract method and non-Abstract method
- we cant create object from a Abstract class / cant instantiated 
- we can create ref variable for Abstract class
- if we extends a Abstract class all Abstract method must be overridden

# why we cant create object / cant instantiated  from a Abstract class 
-  abstract class is designed to serve as a blueprint for other classes 

```java
public abstract class MobileUser {
    abstract void sendMessage();
}

public class Rahim extends MobileUser {
    @Override
    void sendMessage() {
        System.out.println("message sending Rahim");
    }
}

public class MainTest {
    public static void main(String[] args) {
        MobileUser mobileUserObj; 
        //refer variable
        //Declared but not initialized

        mobileUserObj = new Rahim();
        // Initialize the variable
        mobileUserObj.sendMessage();
        System.out.println(mobileUserObj.hashCode());

        mobileUserObj = new Karim();
        // Initialize the variable
        mobileUserObj.sendMessage();
        System.out.println(mobileUserObj.hashCode());
    }
}

```
- refer variable :

### example -2
```java
abstract class Shape {
    double valueOne, valueTwo;
    
    Shape(double valueOne, double valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    abstract void areaCalculate();
}


class Rectangle extends Shape {
    Rectangle(double valueOne, double valueTwo) {
        // init shape class constructor
        super(valueOne, valueTwo);
    }
    @Override
    void areaCalculate() {
        double result = valueOne * valueTwo;
        System.out.println( "Rectangle radius : " + result);
    }
}

class Triangle extends Shape {
    Triangle(double valueOne, double valueTwo) {
        super(valueOne, valueTwo);
    }
    @Override
    void areaCalculate() {
        
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius, radius);
        System.out.println("current radius: "+radius);
    }

    @Override
    void areaCalculate() {
        double result = Math.PI * valueOne * valueTwo;
        System.out.println("Circle radius : " + result);

    }
}

public class MainTest {
    public static void main(String[] args) {
        Shape shape;

        // create object o Rectangle class
        shape = new Rectangle(5, 8);
        // calling Rectangle class areaCalculate method 
        shape.areaCalculate();

        shape = new Circle(5);
        shape.areaCalculate();
    }
}
```