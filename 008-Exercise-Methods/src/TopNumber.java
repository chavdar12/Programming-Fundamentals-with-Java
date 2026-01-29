import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isTopNumber(int i) {
        return isDivisibleByEight(i) && hasOddDigit(i);
    }

    private static boolean isDivisibleByEight(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean hasOddDigit(int i) {
        while (i > 0) {
            if (i % 2 != 0) {
                return true;
            }
            i /= 10;
        }
        return false;
    }
}
