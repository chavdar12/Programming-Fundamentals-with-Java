import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = factorialDivision(firstNumber, secondNumber);
        System.out.println(result);
    }

    private static double factorialDivision(double firstNumber, double secondNumber) {
        double firstFactorial = findFactorial(firstNumber);
        double secondFactorial = findFactorial(secondNumber);
        return firstFactorial / secondFactorial;
    }

    private static double findFactorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
