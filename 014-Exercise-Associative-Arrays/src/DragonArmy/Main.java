package DragonArmy;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            String type = tokens[0];
            String name = tokens[1];
            int damage = 45;
            int health = 250;
            int armor = 10;
            if (!tokens[2].equals("null")) {
                damage = Integer.parseInt(tokens[2]);
            }
            if (!tokens[3].equals("null")) {
                health = Integer.parseInt(tokens[3]);
            }
            if (!tokens[4].equals("null")) {
                armor = Integer.parseInt(tokens[4]);
            }
            int[] stats = new int[]{damage, health, armor};
            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }
            dragons.get(type).put(name, stats);
        }
        dragons.forEach((key, value) -> {
            double damage = value.values().stream().mapToInt(x -> x[0]).average().getAsDouble();
            double health = value.values().stream().mapToInt(x -> x[1]).average().getAsDouble();
            double armor = value.values().stream().mapToInt(x -> x[2]).average().getAsDouble();
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, damage, health, armor);
            value.forEach((k, v) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", k, v[0], v[1], v[2]));
        });
    }
}