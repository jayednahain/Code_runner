package JavAX.Jav129InheritePrivatemenebers;

public class Students extends Persons {

    String qualification;

    public String getQualification() {
        if (qualification != null) {
            return qualification;

        }
        else
        {
            return "No qualification added";
        }
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void displayInformation() {
        
    }
    
    
}
