package StaticUse.StaticVariable.Ex1;

//109 playlist
public class Student {
    
    String Name;
    int Id;
    
    static String UniversityName = "LU";
    // this variable is common 
    // not need to update from user
    // so we keep it as static


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
