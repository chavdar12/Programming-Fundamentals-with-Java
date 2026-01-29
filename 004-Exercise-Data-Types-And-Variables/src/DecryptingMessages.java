import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            char letter = scanner.nextLine().charAt(0);
            message.append((char) (letter + key));
        }
        System.out.println(message);
    }
}