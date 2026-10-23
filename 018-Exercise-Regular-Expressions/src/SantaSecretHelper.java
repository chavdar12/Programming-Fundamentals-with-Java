import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behaviour>[GN])!");
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                decryptedMessage.append((char) (input.charAt(i) - key));
            }
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find() && matcher.group("behaviour").equals("G")) {
                System.out.println(matcher.group("name"));
            }
            input = scanner.nextLine();
        }
    }
}
