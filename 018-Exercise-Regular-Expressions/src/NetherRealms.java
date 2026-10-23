import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] demons = scanner.nextLine().split(",\\s*");
        Map<String, List<Double>> demonsInfo = new TreeMap<>();
        for (String demon : demons) {
            String name = demon.trim();
            double health = calculateHealth(demon);
            double damage = calculateDamage(demon);
            demonsInfo.put(name, new ArrayList<>());
            demonsInfo.get(name).add(health);
            demonsInfo.get(name).add(damage);
        }
        demonsInfo.forEach((key, value) -> System.out.printf("%s - %.0f health, %.2f damage%n", key, value.get(0), value.get(1)));
    }

    private static double calculateDamage(String demon) {
        double damage = 0;
        Matcher matcher = Pattern.compile("[+-]?\\d+(\\.\\d+)?").matcher(demon);
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        for (int i = 0; i < demon.length(); i++) {
            if (demon.charAt(i) == '*') {
                damage *= 2;
            } else if (demon.charAt(i) == '/') {
                damage /= 2;
            }
        }
        return damage;
    }

    private static double calculateHealth(String demon) {
        double health = 0;
        for (int i = 0; i < demon.length(); i++) {
            char symbol = demon.charAt(i);
            if (!Character.isDigit(symbol) && symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/' && symbol != '.') {
                health += symbol;
            }
        }
        return health;
    }
}
