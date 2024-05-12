package StaticUse.StaticVariable.Ex1;


public class Test {
    public static void main(String[] args) {
        Student objOne = new Student("jayed",555);
        Student objTwo = new Student("nahian",555);

        System.out.println();
        // System.out.println(objOne);
        
        //Access direct static variable
        Student.UniversityName ="test";
        System.out.println(Student.UniversityName);
        // objOne.displayInformation();
        // objTwo.displayInformation();
    }
}
