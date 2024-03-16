package StaticUse.StaticVariable;

public class Test {
    public static void main(String[] args) {
        Student objOne = new Student("jayed",555);
        Student objTwo = new Student("nahian",555);
        System.out.println(objOne);
        objOne.displayInformation();
        objTwo.displayInformation();
    }
}
