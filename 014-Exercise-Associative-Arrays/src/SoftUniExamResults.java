import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            if (tokens.length == 3) {
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);
                if (!map.containsKey(name)) {
                    map.put(name, points);
                } else {
                    if (map.get(name) < points) {
                        map.put(name, points);
                    }
                }
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }
            } else {
                map.remove(name);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        map.entrySet().stream()
                .sorted((e1, e2) -> {
                    int result = e2.getValue().compareTo(e1.getValue());
                    if (result == 0) {
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((e1, e2) -> {
                    int result = e2.getValue().compareTo(e1.getValue());
                    if (result == 0) {
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
    }
}