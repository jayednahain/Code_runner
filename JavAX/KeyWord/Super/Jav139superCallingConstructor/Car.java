package Jav139superCallingConstructor;

public class Car extends Vehicle {
    int gear;
    Car(String color,double weight, int number , int gear){
        
        // color ="black";
        // wheel =4;
        // weight = 25;

        super(color,weight,number);
        this.gear = gear;
        System.out.println("Car constructor run");

    }

    @Override
    void vehicleAttribute() {

        super.vehicleAttribute();
        System.out.println("Gear    : " + gear);
    }

}
