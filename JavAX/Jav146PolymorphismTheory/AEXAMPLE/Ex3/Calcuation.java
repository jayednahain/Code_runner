package Jav146PolymorphismTheory.AEXAMPLE.Ex3;

public class Calcuation {
    public static void main(String[] args) {
        // Shape shapeObj = new Shape();
        // Triangle triangleObj = new Triangle(10, 25);
        // System.out.println(triangleObj.area());
        // Rectangle rectangleObj = new Rectangle(10, 35);
        // System.out.println(rectangleObj.area());

        Shape[] s = new Shape[3];

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
