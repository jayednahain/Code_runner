package QAProblems.solve2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class solve2 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2,2,22};
        LongestConsecutiveSequence solve2Obj = new LongestConsecutiveSequence();
        // solve2Obj.longestConsecutive(nums);
        System.out.println(solve2Obj.longestConsecutive(nums)); // Output: 4
    }
}

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        //This creates a new instance of the HashSet class.
        //The new keyword allocates memory for the HashSet object.
        //set is interface
        // Set is an interface, and Integer is a wrapper class for the primitive type int.
       
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;
        for (int num : nums) {
            System.out.println("num :" + num);
            if (!numSet.contains(num - 1)) { 

                System.out.println("1---num :"+ (num-1));
                int currentNum = num;
                int count = 1;

                while (numSet.contains(currentNum + 1)) { 
                    currentNum++;
                    count++;
                }
                maxLength = Math.max(maxLength, count); 
            }
        }
        return maxLength;
    }


}