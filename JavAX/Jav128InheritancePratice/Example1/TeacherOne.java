package Jav128InheritancePratice.Example1;

public class TeacherOne {

    TeacherOne() {
        System.out.println("|| TeacherOne  || init -");
    }

    public static void main(String[] args) {
        Teacher objOne = new Teacher();

        objOne.name = "jayed";
        objOne.age = 40;
        objOne.department = "Eng";
        objOne.subject = "physics";

        objOne.displayInfoFromTeacher();
    }
}
