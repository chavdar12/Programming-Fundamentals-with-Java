import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        return getSumOfEvenDigits(number) * getSumOfOddDigits(number);
    }

    private static int getSumOfEvenDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    private static int getSumOfOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}