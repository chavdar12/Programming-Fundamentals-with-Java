import java.util.Scanner;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            if (token.contains("@") && token.contains(".")) {
                int index = token.indexOf("@");
                if (index > 0 && index < token.length() - 1) {
                    System.out.println(token);
                }
            }
        }
    }
}
