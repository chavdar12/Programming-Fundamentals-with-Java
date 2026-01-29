import java.util.Scanner;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int key = 0;
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r' || currentChar == 'S' || currentChar == 'T' || currentChar == 'A' || currentChar == 'R') {
                    key++;
                }
            }
            StringBuilder decryptedMessage = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                decryptedMessage.append((char) (currentChar - key));
            }
            String decryptedString = decryptedMessage.toString();
            String pattern = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)";
            if (decryptedString.matches(pattern)) {
                System.out.println("Valid message");
            } else {
                System.out.println("Invalid message");
            }
        }
    }
}
