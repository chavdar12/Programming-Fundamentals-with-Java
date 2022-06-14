import java.util.Scanner;

public class Exercise_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = findResult(num);
        System.out.println(result);

    }

    static int findResult(int num) {
        return findSumOfOdds(num) * findSumOfEvens(num);
    }

    static int findSumOfOdds(int num) {
        int sumOfOdds = 0;

        while (num > 0) {

            int nextNum = num % 10;
            num /= 10;
            if (nextNum % 2 != 0) {
                sumOfOdds += nextNum;
            }

        }

        return sumOfOdds;
    }

    static int findSumOfEvens(int num) {
        int sumOfEvens = 0;
        while (num > 0) {
            int nextNum = num % 10;
            num /= 10;
            if (nextNum % 2 == 0) {
                sumOfEvens += nextNum;
            }

        }

        return sumOfEvens;
    }
}