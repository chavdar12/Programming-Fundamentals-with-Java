import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|",
                ".---", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";

        String input = scanner.nextLine();

        morseToEnglish(input, alphabet, morse);
    }

    private static void morseToEnglish(String input, String alphabet, String[] morse) {
        String[] morseCodeChars = input.split("\\s+");
        StringBuilder decoded = new StringBuilder();
        for (String morseCodeChar : morseCodeChars) {
            for (int j = 0; j < morse.length; j++) {
                if (morseCodeChar.equals(morse[j])) {
                    decoded.append(alphabet.charAt(j));
                }
            }
        }
        System.out.println(decoded);
    }
}
