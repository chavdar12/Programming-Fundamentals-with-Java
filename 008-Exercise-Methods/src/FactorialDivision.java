import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", divide(firstNum, secondNum));
    }

    private static double divide(int firstNum, int secondNum) {
        return factorial(firstNum) / factorial(secondNum);
    }

    private static double factorial(int firstNum) {
        if (firstNum == 0) {
            return 1;
        }
        return firstNum * factorial(firstNum - 1);
    }
}
