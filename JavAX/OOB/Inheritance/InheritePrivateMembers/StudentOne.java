package JavAX.Jav129InheritePrivatemenebers;

public class StudentOne {
    public static void main(String[] args) {
        
        Students objOne = new Students();

        // objOne.getName();
        objOne.setName("jayed");
        objOne.setAge(50);
        objOne.setQualification("BSc in CSE");
        System.out.println(objOne.getName());
        System.out.println(objOne.getAge());
        System.out.println( objOne.getQualification());

    }
}
