package LeetCode;

public class Problems {
    //https://leetcode.com/problems/contains-duplicate/description/
    //Brute Force Approach
    // boolean containsDuplicate(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.println(nums[i]);
    //         for (int j = i+1; j < nums.length; j++) {
    //             if (nums[i] == nums[j])
    //             {
    //                 return true;
    //             }
    //             System.out.println("j ==" + nums[j]);
    //         }
    //     }
    //     return false;
    // }

    // boolean containsDuplicateUsingSort(int[] nums) {
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length-1; i++) {
    //       System.out.println(nums[i]);
    //       if (nums[i] == nums[i+1]){
    //         return true;
    //       }
    //     }
    //     return false;
    // }
    
    
    // 219
    // https://leetcode.com/problems/contains-duplicate-ii/description/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    System.out.println("true");
                    return true;
                }
            
                
            }
            System.out.println("false");
        }
        return false;
    }
}
