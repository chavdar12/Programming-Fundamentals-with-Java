import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> results = new LinkedHashMap<>();

        String input = scanner.nextLine();

        Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        while (!"end of race".equals(input)) {
            StringBuilder name = new StringBuilder();
            Matcher nameMatcher = letterPattern.matcher(input);
            Matcher digitMatcher = digitPattern.matcher(input);
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            if (racers.contains(name.toString())) {
                results.putIfAbsent(name.toString(), 0);
                int oldKm = results.get(name.toString());
                int newKm = 0;
                while (digitMatcher.find()) {
                    newKm += Integer.parseInt(digitMatcher.group());
                }
                results.put(name.toString(), oldKm + newKm);
            }

            input = scanner.nextLine();
        }
        int[] number = {1};
        results.entrySet().stream().sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue())).limit(3).forEach(r -> {
            switch (number[0]) {
                case 1 -> System.out.printf("1st place: %s%n", r.getKey());
                case 2 -> System.out.printf("2nd place: %s%n", r.getKey());
                case 3 -> System.out.printf("3rd place: %s%n", r.getKey());
            }
            number[0]++;
        });
    }
}
