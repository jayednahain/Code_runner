package StaticMethod2Restrictions.StaticToNonStatic;

public class StaticTest {

    int val =3;
    static int val2 = 8;

    static void display(){
        // cant called a non-static method from static method
        // displayOne();

        //cant access non-static variable form static method
        // val =2;
        // System.out.println(val);
    }
    void displayOne(){
        // calling static method from non-static method
        display();

        // accessing static variable from non-static method
        val2 = 4;
        System.out.println(val2);

    }
}
