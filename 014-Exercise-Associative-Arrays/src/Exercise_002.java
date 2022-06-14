import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> mine = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!"stop".equals(resource)) {

            int quantity = Integer.parseInt(scanner.nextLine());

            mine.putIfAbsent(resource, 0);
            mine.put(resource, mine.get(resource) + quantity);
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mine.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
