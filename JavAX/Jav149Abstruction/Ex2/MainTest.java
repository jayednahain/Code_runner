package Jav149Abstruction.Ex2;




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


