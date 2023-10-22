import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        Locale.setDefault(Locale.US);

//        Printing formatted numbers and assigning variables
        double numberOne = 1.12345;

        System.out.println(numberOne); // Printing just the number
        System.out.printf("%.2f%n", numberOne); // Printing the number with 2 decimal places
        System.out.printf("%.4f%n", numberOne); // Printing the number with 4 decimal places


//        String manipulation exercise
        String productOne = "Computer";
        String productTwo = "Office desk";

        int age = 30;
        int code = 5290;

        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(productOne + ", " + "whose price is $" + priceOne);
        System.out.println(productTwo + ", " + "whose price is $" + priceTwo);
        System.out.println("Record: " + age + " years old, code " + code + " and gender F");
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded to three places: %.3f%n", measure);
    }
}
