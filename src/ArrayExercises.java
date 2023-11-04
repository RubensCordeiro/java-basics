import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayExercises {
    public static void main(String[] args) {
        Random rd = new Random();

//        1. Write a Java program to sort a numeric array and a string array.
        int[] numericArray = new int[]{5, 7, 1, 9, 11, 4, 3};
        String[] strArray = new String[]{"apple", "banana", "pear", "blueberry"};

        Arrays.sort(numericArray);
        Arrays.sort(strArray);

        System.out.println(Arrays.toString(numericArray));
        System.out.println(Arrays.toString(strArray));

//        2. Write a Java program to sum values of an array.
        int sum = 0;

        // For each method
        for (int j : numericArray) {
            sum += j;
        }

        // Stream method
        int sum2 = Arrays.stream(numericArray).sum();

        // Reduce method
        int sum3 = Arrays.stream(numericArray).reduce(0, (acum, value) -> acum += value);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);

//        4. Write a Java program to calculate the average value of array elements.
        int sum4 = Arrays.stream(numericArray).sum();
        double avg = (double) sum4 / numericArray.length;
        System.out.println(avg);

        // Stream method
        System.out.println(Arrays.stream(numericArray).average().orElse(-1));

//        7. Write a Java program to remove a specific element from an array.
        // Manual method
        int ignoreNumber = 5;
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i : numericArray) {
            if (i != ignoreNumber) {
                newArray.add(i);
            }
        }

        System.out.println(Arrays.toString(numericArray));
        System.out.println(newArray);

        // Using filter
        int[] filteredArray = Arrays.stream(numericArray).filter(item -> item != ignoreNumber).toArray();
        System.out.println(Arrays.toString(filteredArray));

    }
}
