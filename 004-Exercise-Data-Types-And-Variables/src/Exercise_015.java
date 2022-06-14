import java.util.Scanner;

public class Exercise_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder decryptedMessage = new StringBuilder();
        int decryptedChar;
        while (n-- > 0) {
            char ch = scanner.nextLine().charAt(0);
            decryptedChar = (int) ch + key;
            decryptedMessage.append((char) decryptedChar);
        }
        System.out.println(decryptedMessage);
    }
}
