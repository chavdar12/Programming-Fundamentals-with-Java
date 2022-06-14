import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, LinkedList<String>> companies = new TreeMap<>();

        while (!"End".equals(line)) {

            String[] tokens = line.split(" -> ");
            String companyName = tokens[0];
            String employeeId = tokens[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new LinkedList());
            }
            if (!companies.get(companyName).contains(employeeId)) {
                companies.get(companyName).add(employeeId);
            }

            line = scanner.nextLine();
        }

        companies.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(n -> System.out.printf("-- %s%n", n));
        });
    }
}
