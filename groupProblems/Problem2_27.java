package groupProblems;
import java.util.Arrays;

public class Problem2_27 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] element = {3, 2, 2, 3};
        solution.removeElement(element, 2);
        // System.err.println(solution.removeElement(element, 2));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int nonValCounter = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[nonValCounter] = nums[i];
                nonValCounter++ ;
            }

        }
        return nonValCounter;

    }
}