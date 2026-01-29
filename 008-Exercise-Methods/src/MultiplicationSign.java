import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplicationSign(a, b, c));
    }

    private static String multiplicationSign(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            return "zero";
        }
        if (a < 0 && b < 0 && c < 0) {
            return "negative";
        }
        if (a < 0 && b < 0) {
            return "positive";
        }
        if (a < 0 && c < 0) {
            return "positive";
        }
        if (a < 0) {
            return "negative";
        }
        if (b < 0 && c < 0) {
            return "positive";
        }
        if (b < 0) {
            return "negative";
        }
        if (c < 0) {
            return "negative";
        }
        return "positive";
    }
}
