package groupProblems;

import java.util.Arrays;

public class Problem1_128 {
    Solution solution = new Solution();
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        solution.merge(nums1, 3, nums2, 3);
    }

}



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointerOne = m -1;
        int pointerTwo = n -1;
        int pointerMarged = m + n -1;

        System.out.println();

        for (int i = pointerMarged; i >= 0; i--) {
            if (pointerTwo < 0) {
                System.out.println("-----1--start");
                nums1[i] = nums1[pointerOne];
                pointerOne--;
            } else if (pointerOne < 0) {
                System.out.println("-----2--start");
                nums1[i] = nums2[pointerTwo];
                pointerTwo--;
            } else if (nums1[pointerOne] > nums2[pointerTwo]) {
                System.out.println("-----3--start");
                nums1[i] = nums1[pointerOne];
                pointerOne--;
            } else {
                System.out.println("-----4--start");
                System.out.println(Arrays.toString(nums1));
                nums1[i] = nums2[pointerTwo];
                pointerTwo--;
                System.out.println(Arrays.toString(nums1));
            }
        }


    }
}