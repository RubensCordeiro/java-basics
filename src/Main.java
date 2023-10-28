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
        Product productOne = new Product();
        productOne.quantity = 1;
        productOne.price = 2100;
        productOne.name = "Computer";

        Product productTwo = new Product();
        productTwo.quantity = 1;
        productTwo.price = 650.50;
        productTwo.name = "Office desk";


        int age = 30;
        int code = 5290;

        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(productOne);
        System.out.println(productTwo.name + ", " + "whose price is $" + productTwo.price);
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
