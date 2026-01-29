import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedList<String>> map = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employee = tokens[1];
            if (!map.containsKey(company)) {
                map.put(company, new LinkedList<>());
            }
            if (!map.get(company).contains(employee)) {
                map.get(company).add(employee);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.printf("-- %s%n", employee);
            }
        }
    }
}
