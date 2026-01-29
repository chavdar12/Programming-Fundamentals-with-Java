import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] tokens = input.split(" \\| ");
                String forceSide = tokens[0];
                String forceUser = tokens[1];
                if (!map.containsKey(forceSide)) {
                    map.put(forceSide, new ArrayList<>());
                }
                if (!map.get(forceSide).contains(forceUser)) {
                    map.get(forceSide).add(forceUser);
                }
            } else if (input.contains("->")) {
                String[] tokens = input.split(" -> ");
                String forceUser = tokens[0];
                String forceSide = tokens[1];
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    entry.getValue().remove(forceUser);
                }
                if (!map.containsKey(forceSide)) {
                    map.put(forceSide, new ArrayList<>());
                }
                map.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }
        map.entrySet().stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(s -> System.out.printf("! %s%n", s));
                });
    }
}
