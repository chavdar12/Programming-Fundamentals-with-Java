import java.util.*;
import java.util.stream.Collectors;

public class Judge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> users = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String user = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            contains(contests, user, contest, points);

            contains(users, contest, user, points);

            input = scan.nextLine();
        }

        contests.forEach((key, value) -> {
            System.out.printf("%s: %d participants%n", key, value.size());
            int counter = 1;
            for (Map.Entry<String, Integer> entry : value.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).collect(Collectors.toList())) {
                System.out.printf("%d. %s <::> %d%n", counter, entry.getKey(), entry.getValue());
                counter++;
            }
        });

        System.out.println("Individual standings:");
        int counter = 1;
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet().stream().sorted((a, b) -> {
            int sumA = 0;
            int sumB = 0;
            for (Map.Entry<String, Integer> entry1 : a.getValue().entrySet()) {
                sumA += entry1.getValue();
            }
            for (Map.Entry<String, Integer> entry1 : b.getValue().entrySet()) {
                sumB += entry1.getValue();
            }
            return Integer.compare(sumB, sumA);
        }).toList()) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry1 : entry.getValue().entrySet()) {
                sum += entry1.getValue();
            }
            System.out.printf("%d. %s -> %d%n", counter, entry.getKey(), sum);
            counter++;
        }
    }

    private static void contains(Map<String, Map<String, Integer>> contests, String user, String contest, int points) {
        if (!contests.containsKey(contest)) {
            contests.put(contest, new LinkedHashMap<>());
        }

        if (!contests.get(contest).containsKey(user)) {
            contests.get(contest).put(user, points);
        } else {
            if (contests.get(contest).get(user) < points) {
                contests.get(contest).put(user, points);
            }
        }
    }
}