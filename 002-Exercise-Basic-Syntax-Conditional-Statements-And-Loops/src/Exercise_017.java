import java.util.Scanner;

public class Exercise_017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfPushes = Integer.parseInt(scanner.nextLine());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbersOfPushes; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();
            char oneDigit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offset + digitLength - 1;
            int letterCode = letterIndex + 97;

            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message.append(letter);

        }
        System.out.println(message);

    }
}