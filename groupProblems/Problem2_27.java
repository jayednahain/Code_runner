package groupProblems;

import java.util.Arrays;

public class Problem2_27 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] element = {1,2,2,3,5,6};
        
        System.err.println(solution.removeElement(element, 3));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
            if (nums[i]== val){
                System.out.println("found");
            }

        }

        return 0;

        // Arrays.sort(nums);
        // int i = 0;
        // for (; i < nums.length; i++) {
        //     if (nums[i] == val) break;
        // }
        // int j = i;
        // for (; j < nums.length; j++) {
        //     if (nums[j] != val) nums[i++] = nums[j];
        // }
        // return i;
    }
}