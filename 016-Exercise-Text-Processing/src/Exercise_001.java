import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");

        for (String username : userNames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char letter = username.charAt(i);
            if (!Character.isLetterOrDigit(letter) && letter != '_' && letter != '-') {
                return false;
            }
        }
        return true;
    }
}
