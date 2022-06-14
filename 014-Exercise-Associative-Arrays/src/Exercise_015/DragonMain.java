package Exercise_015;

import java.util.*;

public class DragonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Dragon>> dragons = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[0];
            String dragonName = tokens[1];
            int damage = "null".equals(tokens[2]) ? 45 : Integer.parseInt(tokens[2]);
            int health = "null".equals(tokens[3]) ? 250 : Integer.parseInt(tokens[3]);
            int armor = "null".equals(tokens[4]) ? 10 : Integer.parseInt(tokens[4]);
            if (!dragons.containsKey(type)) {
                dragons.put(type, new LinkedList<>());
            }
            boolean overwriteDragon = false;
            if (dragons.containsKey(type)) {
                for (Dragon dragon : dragons.get(type)) {
                    if (dragon.getName().equals(dragonName)) {
                        dragon.setDamage(damage);
                        dragon.setHealth(health);
                        dragon.setArmor(armor);
                        overwriteDragon = true;
                        break;

                    }
                }
            }
            if (!overwriteDragon) {
                dragons.get(type).add(new Dragon(dragonName, damage, health, armor));
            }
        }
        dragons.forEach((key, value) -> {
            double damage = value.stream().mapToDouble(Dragon::getDamage).average().getAsDouble();
            double health = value.stream().mapToDouble(Dragon::getHealth).average().getAsDouble();
            double armor = value.stream().mapToDouble(Dragon::getArmor).average().getAsDouble();
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, damage, health, armor);
            value.stream().sorted(Comparator.comparing(Dragon::getName))
                    .forEach(d -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                                                    d.getName(), d.getDamage(), d.getHealth(), d.getArmor()));
        });
    }
}