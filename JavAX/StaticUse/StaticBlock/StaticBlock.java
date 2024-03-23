package StaticUse.StaticBlock;

public class StaticBlock {
    static int val =1;

    static{
        val =2;
        System.out.println("static block 1");
    }


    static{
        val =3;
        System.out.println("static block 2");
    }

    // public static void main(String[] args) {
    //     System.out.println("this is a main method "+val);
    // }
}
