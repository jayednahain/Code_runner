package Jav139superCallingConstructor;

public class Vehicle {

    String color;
    double weight;
    int wheel;

    Vehicle(String c, double we, int wh) {
        System.out.println("Vehicle constructor run");
        color = c;
        weight = we;
        wheel = wh;
    }

    void vehicleAttribute() {
        System.out.println("Color   : " + color);
        System.out.println("weight  : " + weight);
        System.out.println("Color   : " + wheel);
    }

}
