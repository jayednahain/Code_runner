package Method.MethodWithReturn;


public class Test {
    
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        int result1 =  cal.squareNumber(5);
        int result2 =  cal.squareNumber(10);
        System.out.println(result1);
        System.out.println(result2);
    }
   
}
