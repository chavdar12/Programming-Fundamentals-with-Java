import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = new StringBuffer(username).reverse().toString();
        String inputPassword;
        boolean lodgedIn = false;
        for (int i = 0; i < 4; i++) {
            inputPassword = scanner.nextLine();
            if (password.equals(inputPassword)) {
                lodgedIn = true;
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!lodgedIn) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
