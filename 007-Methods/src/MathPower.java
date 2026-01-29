import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = raiseToPower(number, power);
        System.out.println(result);
    }

    private static double raiseToPower(double number, int power) {
        return Math.pow(number, power);
    }
}
