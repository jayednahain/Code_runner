package Constructor.ConstructorOverLoading;

public class Test {
    
    public static void main(String[] args) {
        Teacher teacherObj= new Teacher();
        teacherObj.displayInformation();
        Teacher teacherObj1= new Teacher("rohim3", "male");
        teacherObj1.displayInformation();
        Teacher teacherObj2= new Teacher("rohim3", "male", 123456);
        teacherObj2.displayInformation();
    }
   
}
