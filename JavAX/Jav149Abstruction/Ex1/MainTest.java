package Jav149Abstruction.Ex1;

public class MainTest {
    public static void main(String[] args) {
        MobileUser mobileUserObj; // refer variable
        mobileUserObj = new Rahim();
        mobileUserObj.sendMessage();
        System.out.println(mobileUserObj.hashCode());

        mobileUserObj = new Karim();
        mobileUserObj.sendMessage();
        System.out.println(mobileUserObj.hashCode());
    }
}
