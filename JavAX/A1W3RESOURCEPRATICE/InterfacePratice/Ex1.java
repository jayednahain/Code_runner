//src : https://www.w3resource.com/java-exercises/index-interface.php

interface Shape {
    double gerArea();
}

class Rectangle implements Shape{
    private double length;
    private double height;
    Rectangle(double length , double height){
        this.height = length;
        this.length = length;
    }

    @Override
    public double gerArea() {
        return length * height;
        
    }
}
// class Circle implements Shape {}
// class Triangle implements Shape{}

public class Ex1{
    public static void main(String[] args) {

        try {
            Rectangle rectangleObj = new Rectangle(25, 68);
            // rectangleObj.gerArea();
            System.out.println(rectangleObj.gerArea());    
        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }
}

