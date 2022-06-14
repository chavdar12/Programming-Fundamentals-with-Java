import java.util.Arrays;
import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] key = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        String message = scanner.nextLine();

        while (!"find".equals(message)) {
            StringBuilder messageDecoded = new StringBuilder();
            for (int i = 0, j = 0; i < message.length(); i++, j++) {

                int decryptedChar = message.charAt(i) - key[j];
                messageDecoded.append((char) decryptedChar);
                if (j == key.length - 1) {
                    j = -1;
                }
            }
            String treasureType = messageDecoded.substring(messageDecoded.indexOf("&") + 1,
                                                           messageDecoded.lastIndexOf("&"));
            String coordinates = messageDecoded.substring(messageDecoded.indexOf("<") + 1,
                                                          messageDecoded.lastIndexOf(">"));

            System.out.printf("Found %s at %s%n", treasureType, coordinates);
            message = scanner.nextLine();
        }
    }
}
