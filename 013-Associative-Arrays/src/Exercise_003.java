import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordLowerCase = word.toLowerCase();
            if (!counts.containsKey(wordLowerCase)) {
                counts.putIfAbsent(wordLowerCase, 1);
            } else {
                counts.put(wordLowerCase, counts.get(wordLowerCase) + 1);
            }

        }
        ArrayList<String> odds = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odds));

    }
}
