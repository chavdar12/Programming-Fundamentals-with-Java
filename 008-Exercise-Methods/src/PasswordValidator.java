import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isValid = true;
        if (!isBetween6And10Chars(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!isOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        if (!hasAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean hasAtLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count >= 2;
    }

    private static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBetween6And10Chars(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
}
