import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String name = tokens[1];
            if (command.equals("register")) {
                String licensePlate = tokens[2];
                if (!map.containsKey(name)) {
                    map.put(name, licensePlate);
                    System.out.printf("%s registered %s successfully%n", name, licensePlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                }
            } else {
                if (!map.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    map.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }
        for (String name : map.keySet()) {
            System.out.printf("%s => %s%n", name, map.get(name));
        }
    }
}
