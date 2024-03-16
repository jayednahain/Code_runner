public class Student {
    
    String Name;
    int Id;
    static String UniversityName = "LU";

    Student(String n, int i) {
        Name = n;
        Id = i;
    }

    void displayInformation(){
        System.out.println("Name: " + Name);
        System.out.println("Id: " +Id);
        System.out.println("UniversityName: " + UniversityName);
        System.out.println('\n');
    }

}
