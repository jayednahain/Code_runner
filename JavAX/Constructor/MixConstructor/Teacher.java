package Constructor.MixConstructor;

public class Teacher {
    String name, gender;
    int phoneNumber;

    Teacher(){
        System.out.println("default constructor");
    }

    Teacher(String n, String g, int number){
        System.out.println("param constructor");
        name = n;
        gender = g;
        phoneNumber = number;
    }

    // void getInformation (String n, String g, int number){
    //     name = n;
    //     gender = g;
    //     phoneNumber = number;
    // }

    void displayInformation(){
        System.out.println("name: " +name);
        System.out.println("gender: " +gender);
        System.out.println("gender: " + phoneNumber);
        System.out.println("---------------------------");
        System.out.println('\n');
    }
}
