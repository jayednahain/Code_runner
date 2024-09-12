package Jav150Interface.Ex1;


interface AInterface {
    int data = 40;
    void play();

}


interface BInterface {
    String data = "nahian";
    void play();
}


class PureClass implements AInterface, BInterface {

    @Override
    public void play() {
        System.out.println("Class");

    }
}

public class mainTest {
    public static void main(String[] args) {
        PureClass pureClassObj = new PureClass();
        pureClassObj.play();
    }    
}





