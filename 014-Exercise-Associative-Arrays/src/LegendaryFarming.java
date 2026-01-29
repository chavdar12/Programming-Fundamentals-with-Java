import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junkMaterials = new TreeMap<>();
        boolean isObtained = false;
        while (!isObtained) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        switch (material) {
                            case "shards" -> System.out.println("Shadowmourne obtained!");
                            case "fragments" -> System.out.println("Valanyr obtained!");
                            case "motes" -> System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, quantity);
                    } else {
                        junkMaterials.put(material, junkMaterials.get(material) + quantity);
                    }
                }
            }
        }
        keyMaterials.entrySet().stream().sorted((a, b) -> {
            int result = b.getValue().compareTo(a.getValue());
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junkMaterials.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}
