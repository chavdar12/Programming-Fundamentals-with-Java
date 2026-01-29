import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            if (input.contains(bannedWord)) {
                input = input.replace(bannedWord, repeat(bannedWord.length()));
            }
        }
        System.out.println(input);

    }

    private static CharSequence repeat(int length) {
        StringBuilder result = new StringBuilder();
        result.append("*".repeat(Math.max(0, length)));
        return result;
    }
}
