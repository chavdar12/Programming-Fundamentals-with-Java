import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(calculate(a, operation, b));
    }

    private static double calculate(double a, String operation, double b) {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0.0;
        };
    }
}