public class Test {
    
    public static void main(String[] args) {
        // Teacher teacherObj;
        Teacher teacherObj= new Teacher();
        System.out.println(teacherObj.toString());   


        teacherObj.name = "jayed";
        teacherObj.gender ="male";
        teacherObj.phoneNumber = 4554645;

        teacherObj.displayPhoneNumber();

    }
   
}
