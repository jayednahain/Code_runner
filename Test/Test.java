package Test;

import java.util.Arrays;
import java.util.List;

class ArrayWalk {
    public void walk() {
       // int[] numbers = {10, 20, 30, 40, 50};

        //for each loop
        // for (int number : numbers) {
        //     System.out.println("number: " + number);
        // }

        //for loop
        // System.out.println(Arrays.toString(numbers));
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println("numbers[i]: " + numbers[i]);
        //     numbers[i] = numbers[i] + 5;
        // }
        // System.out.println(Arrays.toString(numbers));


        // // 5. Looping through a String array
        // String[] names = {"Alice", "Bob", "Charlie"};
        // System.out.println("Looping through a String array:");
        // for (String name : names) {
        //     System.out.println("Name: " + name);
        // }

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 6, 7, 8};
        List<Integer> commonList = Arrays.asList();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonList.add(array1[i]);
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayWalk arrayWalk = new ArrayWalk();
        arrayWalk.walk();
    }
}

