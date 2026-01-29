import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String s : input) {
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            double number = Double.parseDouble(s.substring(1, s.length() - 1));
            if (Character.isUpperCase(first)) {
                number /= first - 64;
            } else {
                number *= first - 96;
            }
            if (Character.isUpperCase(last)) {
                number -= last - 64;
            } else {
                number += last - 96;
            }
            sum += number;
        }
        System.out.printf("%.2f", sum);
    }
}
