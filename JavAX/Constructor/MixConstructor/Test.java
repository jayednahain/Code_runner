package Constructor.MixConstructor;

public class Test {
    
    public static void main(String[] args) {
        // Teacher teacherObj;
        // Teacher teacherObj1= new Teacher();
        // Teacher teacherObj2= new Teacher();
        // System.out.println(teacherObj1.toString()); 
        // System.out.println(teacherObj2.toString());     

        // 102 : class method for getting values and showing values
        // teacherObj1.getInformation("rohim", "male", 123456);
        // teacherObj1.displayPhoneNumber();
        // teacherObj1.getInformation("rohim2", "male", 123456);
        // teacherObj1.displayPhoneNumber();
        // teacherObj2.getInformation("karim", "male", 558855);
        // teacherObj2.displayPhoneNumber();

        //103: sending class values using constructor
        Teacher teacherObj1= new Teacher();
        teacherObj1.displayInformation();
        Teacher teacherObj2= new Teacher("rohim3", "male", 123456);
        teacherObj2.displayInformation();


    }
   
}
