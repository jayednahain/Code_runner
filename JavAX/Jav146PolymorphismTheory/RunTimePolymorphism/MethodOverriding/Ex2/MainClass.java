package Ex2;

public class MainClass {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.displayInformation();

        obj1 = new Teacher();
        obj1.displayInformation();

        obj1 = new Student();
        obj1.displayInformation();
    }
}
