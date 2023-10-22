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
    }
}
