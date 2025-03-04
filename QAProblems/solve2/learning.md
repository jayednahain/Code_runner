# solution -1
```java
class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums){
        int maxLength = 0; 
        for (int i : nums) {
            int currentNum = i;
            int count = 1;
            // System.out.println("currentNum: "+currentNum);
            // System.out.println("|| currentNum: " + currentNum);


            while (contains(nums, currentNum+1)) {
                //check the sequence inside the list or not
                //if inside the list then count the squence
                
                currentNum++;
                // To continue checking for the subsequent numbers, we need to update currentNum to be the number we just found (currentNum + 1).
                count++;
               

            }

            //store the max length
            //if maxlength = 0 , count =2,
            // current maxlength = 2
            // it will update every time
            maxLength = Math.max(maxLength, count);


        }
        return maxLength;
    }

    static boolean contains(int[] nums, int currentItem){
        for (int i : nums) {
            if (i == currentItem ) return true;
        }
        return false;
    };
}

```

# solution-2

```java

```