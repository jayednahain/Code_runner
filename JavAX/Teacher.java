public class Teacher {
    String name, gender;
    int phoneNumber;

    Teacher(String n, String g, int number){
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
    }
}
