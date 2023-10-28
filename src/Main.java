import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        Locale.setDefault(Locale.US);

//        Printing formatted numbers and assigning variables
        double numberOne = 1.12345;

        System.out.println(numberOne); // Printing just the number
        System.out.printf("%.2f%n", numberOne); // Printing the number with 2 decimal places
        System.out.printf("%.4f%n", numberOne); // Printing the number with 4 decimal places


//        String manipulation exercise - now with classes
        Product productOne = new Product("Computer", 2100.0, 1);
        Product productTwo = new Product("Office Desk", 650.50, 1);
        Product productThree = new Product("Guitar", 5000);
        Product productFour = new Product("Piano");



        int age = 30;
        int code = 5290;

        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(productOne);
        System.out.println(productTwo);
        System.out.println(productFour);
        System.out.println("Record: " + age + " years old, code " + code + " and gender F");
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded to three places: %.3f%n", measure);

//        Dealing with user input
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number");

        int input = sc.nextInt();
        System.out.println("You have typed: " + input);

        sc.close();*/
    }
}
