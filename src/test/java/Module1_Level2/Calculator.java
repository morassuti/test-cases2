package Module1_Level2;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /):");
        char choice = scanner.next().charAt(0);

        double result = switch (choice) {
            case '+' -> add(num1, num2);
            case '-' -> subtract(num1, num2);
            case '*' -> multiply(num1, num2);
            case '/' -> divide(num1, num2);
            default -> 0;
        };

        System.out.println("Result is: " + result);
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Number cannot be divided by 0");
            System.exit(1);
        }
        return num1 / num2;
    }

}
