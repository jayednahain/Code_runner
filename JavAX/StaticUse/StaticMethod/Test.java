package StaticUse.StaticMethod;

public class Test {
    public static void main(String[] args) {

        // not need to create object for calling this method
        StaticMethod._staticMethod();

        StaticMethod obj1 = new StaticMethod();
        obj1._nonStaticMethod();

    }
}
