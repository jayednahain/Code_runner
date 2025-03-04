package QAProblems.solve2;
import java.util.Arrays;
import java.util.HashSet;


public class solve2 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        LongestConsecutiveSequence solve2Obj = new LongestConsecutiveSequence();
        solve2Obj.longestConsecutive(nums);

        System.out.println(solve2Obj.longestConsecutive(nums)); // Output: 4

    }

}

class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums){
        if (nums.length == 0) return 0;

        HashSet<Integer> currentSet = new HashSet<>();
        //This code transfers all elements from the array
        // into a HashSet to enable O(1) lookup time instead of O(n)
        // scanning for each check.
        
        for (int num : nums) {
            currentSet.add(num); // Store all numbers in a HashSet for O(1) lookups
        }

        int maxLength = 0;


        System.out.println(currentSet.contains(200));

        return maxLength;
    }
}