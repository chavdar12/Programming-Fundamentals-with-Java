import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> distances = new LinkedHashMap<>();
        for (String participant : scanner.nextLine().split(",\\s*")) {
            distances.put(participant, 0);
        }

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            String name = input.replaceAll("[^A-Za-z]", "");
            int distance = input.replaceAll("\\D", "").chars().map(c -> c - '0').sum();
            distances.computeIfPresent(name, (key, value) -> value + distance);
            input = scanner.nextLine();
        }

        String[] places = {"1st", "2nd", "3rd"};
        String[] winners = distances.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
        for (int i = 0; i < winners.length; i++) {
            System.out.printf("%s place: %s%n", places[i], winners[i]);
        }
    }
}
