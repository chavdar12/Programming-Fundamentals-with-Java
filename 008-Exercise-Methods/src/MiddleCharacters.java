import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(middleCharacters(input));
    }

    private static char middleCharacters(String input) {
        if (input.length() % 2 == 0) {
            return input.charAt(input.length() / 2 - 1);
        } else {
            return input.charAt(input.length() / 2);
        }
    }
}
