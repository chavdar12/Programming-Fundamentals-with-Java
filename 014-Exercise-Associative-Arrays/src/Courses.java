import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String student = tokens[1];
            if (!map.containsKey(course)) {
                map.put(course, new ArrayList<>());
            }
            map.get(course).add(student);
            input = scanner.nextLine();
        }
        map.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(s -> System.out.printf("-- %s%n", s));
                });
    }
}
