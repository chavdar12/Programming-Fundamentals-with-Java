import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int digits = i;
            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", i, isSpecial);
        }
    }
}
