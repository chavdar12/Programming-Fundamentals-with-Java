import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String message = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }
            int index = sum % message.length();
            result.append(message.charAt(index));
            message = message.substring(0, index) + message.substring(index + 1);
        }
        System.out.println(result);
    }
}
