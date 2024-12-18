
package hackerrank;

import java.util.*;


// public class MainTest {
//     private static final Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
//         int N = scanner.nextInt();
//         if ((N % 2) == 1) {
//             System.out.println("Weird");
//         }
//         else {
//             if (2 <= N && N <= 5 ) {
//                 System.out.println("Not Weird");
//             }
//             else if ((6 <= N && N <=20) ) {
//                 System.out.println("Weird");
//             }
//             else if (N > 20) {
//                 System.out.println("Not Weird");
//             }
//         }
        
//         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//         scanner.close();
//     }
    
// }


public class MainTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        
        String s = scan.nextLine();
        scan.nextLine();
        double d = scan.nextFloat();

    


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}