import java.util.Scanner;

public class Exercise_014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(findLastDigits(num));

    }

    private static String findLastDigits(int num) {
        int lastD = Math.abs(num % 10);

        if (lastD == 1) {
            return "one";
        } else if (lastD == 2) {
            return "two";
        } else if (lastD == 3) {
            return "three";
        } else if (lastD == 4) {
            return "four";
        } else if (lastD == 5) {
            return "five";
        } else if (lastD == 6) {
            return "six";
        } else if (lastD == 7) {
            return "seven";
        } else if (lastD == 8) {
            return "eight";
        } else if (lastD == 9) {
            return "nine";
        } else {
            return "zero";
        }
    }
}