package Module1_Level1;

public class Factorial {
    public static void main(String[] args) {

    }
    public static int calculateFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

}