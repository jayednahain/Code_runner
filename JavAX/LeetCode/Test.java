package LeetCode;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Test obj = new Test();
        // obj.containsDuplicate(test);

        int[] test = {1,2,3,1};
        // boolean containsDuplicate = obj.containsDuplicateUsingSort(test);
        Problems prob = new Problems();
        prob.containsNearbyDuplicate(test, 3);
    }

    


}
