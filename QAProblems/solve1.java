package QAProblems;

import java.util.ArrayList;
import java.util.List;

class main {
    public static void main(String[] args) {
        
        Solution solution = new Solution();

       
        int[] myArrayOne = { 1, 2, 3, 4, 5 };
        int[] myArrayTwo = { 1, 2, 3, 4, 4, 5 };
        
        int[] result = solution.intersection(myArrayOne, myArrayTwo); // Store the returned array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {

    // 349
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write a function to find the intersection of two arrays.
        // pick the common item between two array
        // set the pciekd item to abother array,
        // and find the unique numbers

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