import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(middleCharacters(input));
    }

    private static String middleCharacters(String input) {
        int middle = input.length() / 2;
        if (input.length() % 2 == 0) {
            return input.substring(middle - 1, middle + 1);
        } else {
            return input.substring(middle, middle + 1);
        }
    }
}
