package StaticUse.StaticBlock;

public class Test {

    static int value = StaticBlock.val;

    // void _updateStatic(){
    // value =2;
    // }

    static {
        System.out.println("last update -1: " + value);
        value = 5;
        // value = StaticBlock.val +1;
    }

    static {
        System.out.println("last update -2: " + value);
        value = value + 5;
    }

    public static void main(String[] args) {
        System.out.println(value);
    }

}
