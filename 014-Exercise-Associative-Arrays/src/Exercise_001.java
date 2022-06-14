import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char letter : input) {
            if (letter == ' ') {
                continue;
            }
            letters.putIfAbsent(letter, 0);
            letters.put(letter, letters.get(letter) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
