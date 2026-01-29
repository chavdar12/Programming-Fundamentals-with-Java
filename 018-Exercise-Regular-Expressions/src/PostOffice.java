import java.util.Scanner;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];
        String capitalLetters = getCapitalLetters(firstPart);
        String[] firstPartTokens = secondPart.split("\\s+");
        for (String currentToken : firstPartTokens) {
            if (currentToken.length() == 2) {
                char firstChar = currentToken.charAt(0);
                char secondChar = currentToken.charAt(1);
                if (Character.isDigit(firstChar) && Character.isLetter(secondChar)) {
                    int length = Integer.parseInt(String.valueOf(firstChar));
                    String word = getWord(thirdPart, secondChar, length);
                    System.out.println(word);
                }
            }
        }
    }

    private static String getWord(String thirdPart, char capitalLetter, int length) {
        String word = "";
        int startIndex = thirdPart.indexOf(capitalLetter);
        if (startIndex != -1) {
            int endIndex = startIndex + length;
            if (endIndex < thirdPart.length()) {
                word = thirdPart.substring(startIndex, endIndex + 1);
            }
        }
        return word;
    }

    private static String getCapitalLetters(String firstPart) {
        StringBuilder capitalLetters = new StringBuilder();
        for (int i = 0; i < firstPart.length(); i++) {
            char currentChar = firstPart.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                capitalLetters.append(currentChar);
            }
        }
        return capitalLetters.toString();
    }
}
