import java.util.*;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String student = tokens[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);

            input = scanner.nextLine();
        }

        courses.entrySet().stream().sorted((c1, c2) -> {
            int first = c1.getValue().size();
            int second = c2.getValue().size();
            return Integer.compare(second, first);

        }).forEach(c -> {
            System.out.printf("%s: %d%n", c.getKey(), c.getValue().size());

            c.getValue().stream().sorted().forEach(s -> System.out.printf("-- %s%n", s));

        });
    }
}
