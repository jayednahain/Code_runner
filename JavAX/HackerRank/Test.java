import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

            Calculate obj = new Calculate();
            
            int resultAdd = obj.add(5, 4);
            int resultSub = obj.sub(5, 4);
            System.out.println(resultAdd);
            System.out.println(resultSub);
          
      
    }
}

/**
 * Calculate
 */
class Calculate {
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    public int sub(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

}