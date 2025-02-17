package QAProblems;
import java.util.ArrayList;
import java.util.List;
class main{
    public static void main(String[] args) {
            int[] myArrayOne = {1, 2, 3, 4, 5};
            int[] myArrayTwo = {1, 2, 3, 4,4, 5};
    
            Solution solution = new Solution();
    
            int[] result = solution.intersection(myArrayOne, myArrayTwo); // Store the returned array
    
            // Print the result (important to see what you got!)
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println(); // Add a newline for better formatting
        
        
    }
}



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // https://leetcode.com/problems/intersection-of-two-arrays/
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j && !list.contains(i)) { 
                    list.add(i);
                }
            }
        }

        int[] result = new int[list.size()]; 
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);      
        }

        return result; 
    }
}