import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        printCharsInRange(firstChar, secondChar);
    }

    private static void printCharsInRange(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
