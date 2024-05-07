package JavAX.Jav130InstanceOfOperator;

public class Test {
    
    
    public static void main(String[] args) {
        Animal animalObj = new Animal();
        Person personObj = new Person();
        Teacher teacherObj = new Teacher();
        // System.out.println(animalObj instanceof Animal);
        // System.out.println(personObj instanceof Animal);
        // System.out.println(teacherObj instanceof Animal);

        if (teacherObj instanceof Animal) {
            System.out.println("true UU");
        }
    }


}
