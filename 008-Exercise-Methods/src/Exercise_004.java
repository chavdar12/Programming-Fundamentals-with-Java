import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean validPass = isValidPassword(password);
        if (validPass) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidPassword(String password) {
        int digitCounter = 0;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
            if (Character.isDigit(password.charAt(i))) {
                digitCounter++;
            }
        }
        if (digitCounter < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}
