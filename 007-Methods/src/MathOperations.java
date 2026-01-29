import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = calculate(firstNum, operator, secondNum);
        System.out.printf("%.0f", result);
    }

    private static double calculate(int firstNum, String operator, int secondNum) {
        return switch (operator) {
            case "/" -> firstNum / (double) secondNum;
            case "*" -> firstNum * (double) secondNum;
            case "+" -> firstNum + (double) secondNum;
            case "-" -> firstNum - (double) secondNum;
            default -> 0;
        };
    }
}