import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double finalResult = 0.0;

        for (String string : input) {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt(string.length() - 1);

            int number = Integer.parseInt(string.substring(1, string.length() - 1));
            double result = 0.0;
            if (Character.isUpperCase(firstLetter)) {
                result = number * 1.0 / (firstLetter - 64);
            } else {
                result = number * (firstLetter - 96);
            }
            if (Character.isUpperCase(lastLetter)) {
                result -= lastLetter - 64;

            } else {
                result += lastLetter - 96;
            }
            finalResult += result;
        }
        System.out.printf("%.2f", finalResult);
    }
}
