import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : banWords) {
            if (text.contains(banWord)) {
                String replacement = repeatStr(banWord.length());
                text = text.replace(banWord, replacement);
            }
        }
        System.out.println(text);

    }

    private static String repeatStr(int length) {
        return "*".repeat(Math.max(0, length));
    }

}
