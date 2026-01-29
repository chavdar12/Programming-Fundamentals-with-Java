import java.util.Scanner;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                char decryptedChar = (char) (currentChar - key);
                decryptedMessage.append(decryptedChar);
            }
            String message = decryptedMessage.toString();
            if (message.contains("@")) {
                int startIndex = message.indexOf("@");
                int endIndex = message.indexOf("|");
                String name = message.substring(startIndex + 1, endIndex);
                startIndex = message.indexOf("|");
                endIndex = message.indexOf("#");
                String behaviour = message.substring(startIndex + 1, endIndex);
                System.out.println(name + " " + behaviour);
            }
            input = scanner.nextLine();
        }
    }
}
