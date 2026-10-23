import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String[] words = input[2].split("\\s+");

        Matcher capitals = Pattern.compile("([#$%*&])(?<letters>[A-Z]+)\\1").matcher(firstPart);
        String letters = capitals.find() ? capitals.group("letters") : "";

        Map<Character, Integer> lengths = new LinkedHashMap<>();
        Matcher codes = Pattern.compile("(?<code>\\d{2}):(?<length>\\d{2})").matcher(secondPart);
        while (codes.find()) {
            char letter = (char) Integer.parseInt(codes.group("code"));
            lengths.putIfAbsent(letter, Integer.parseInt(codes.group("length")) + 1);
        }

        for (char letter : letters.toCharArray()) {
            Integer length = lengths.get(letter);
            if (length == null) {
                continue;
            }
            for (String word : words) {
                if (word.length() == length && word.charAt(0) == letter) {
                    System.out.println(word);
                    break;
                }
            }
        }
    }
}
