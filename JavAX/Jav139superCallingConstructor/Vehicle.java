package Jav139superCallingConstructor;

public class Vehicle {

    String color;
    double weight;
    int wheel;

    Vehicle(String c, double we , int wh){
        // this.color = color;
        // this.weight = weight;
        // this.wheel = wheel;
        color = c;
        weight = we;
        wheel = wh;
    }

    void vehicleAttribute(){
        System.out.println("Color   : "+ color);
        System.out.println("weight  : "+ weight);
        System.out.println("Color   : "+ wheel);
    }
}
