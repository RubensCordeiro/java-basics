package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStudy {
    public static void main(String[] args) {
        //    Fixed size arrays
        int[] numArray = new int[]{1, 2, 3, 4, 5}; // This array has fixed size
        ArrayList<Integer> numArray2 = new ArrayList<>(); // This array is dynamic

        numArray = Arrays.stream(numArray).map(x -> x * 2).toArray();
        Arrays.stream(numArray).forEach(item -> numArray2.add(item));
        Arrays.stream(numArray).forEach(numArray2::add);

//        Printing arrays
        Arrays.stream(numArray).forEach(item -> System.out.println(item)); // Lambda like syntax
        Arrays.stream(numArray).forEach(System.out::println); // Method reference syntax
        System.out.println(Arrays.toString(numArray)); // Arrays.toString syntax

//        Enhanced for loop
        for(int num : numArray) {
            System.out.println(num);
        }

//        Querying the arrays
        System.out.println(numArray[2]);
        System.out.println(numArray2.get(2));
    }
}
