import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(mathPower(number, power));

    }

    private static double mathPower(double number, int power) {
        double result = 1;
        result = Math.pow(number, power);
        return result;
    }
}
