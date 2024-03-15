public class Test {
    
    public static void main(String[] args) {
        // Teacher teacherObj;
        Teacher teacherObj1= new Teacher();
        Teacher teacherObj2= new Teacher();
        System.out.println(teacherObj1.toString()); 
        System.out.println(teacherObj2.toString());     

    
        teacherObj1.getInformation("rohim", "male", 123456);
        teacherObj1.displayPhoneNumber();

        teacherObj1.getInformation("rohim2", "male", 123456);
        teacherObj1.displayPhoneNumber();

        teacherObj2.getInformation("karim", "male", 558855);
        teacherObj2.displayPhoneNumber();

    }
   
}
