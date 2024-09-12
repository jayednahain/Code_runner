package Jav146PolymorphismTheory.AEXAMPLE.Ex3;

public class Triangle extends Shape {
    double height, base;
    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5 * height * base ;
    }
}
