package JavAX.Jav129InheritePrivatemenebers;

/**
 * Persons
 */
public class Persons {
    private String Name;
    private int Age;


    public String getName() {
        if (Name != null) {
            return Name;
        }
        else {
            return showError("name");
        }
    }

    public void setName(String name) {
        Name = name;
    }


    public Integer getAge() {
        if (Age != 0) {
            return Age;
        }
        else {
            return 0;
        }
        
    }
    
    public String showError(String value) {
        System.out.println("runn");
        return "|-- No " + value + " set yet -- |";
        // System.out.println("|-- No " + value + " set yet -- |");
    }
    


    public void setAge(int age) {
        Age = age;
    }

}
