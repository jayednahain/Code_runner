package Jav132Overridding;
public class Test {
    public static void main(String[] args) {
        

        //base class
        Person personObj = new Person();
        personObj.Name ="faisal";
        personObj.Age =48;
        personObj.displayInformation();

        //sub class
        Teacher objOne = new Teacher();
        objOne.Name ="jayed";
        objOne.Age= 50;
        objOne.qualification ="Bsc in CSE";
        objOne.displayInformation();


    }
}
