import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();
        while (n-- > 0) {
            String regex = "[STARstar]";
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            int decryptionKey = 0;
            while (matcher.find()) {
                decryptionKey++;
            }
            StringBuilder decryptedMessage = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                decryptedMessage.append((char) (input.charAt(i) - decryptionKey));
            }

            String planetRegex = "@(?<name>[A-Za-z]+)([^@:!\\->]*):(?<population>[0-9]+)([^@:!\\->]*)!(?<type>([AD]))!([^@:!\\->]*)->(?<count>[0-9]+)";
            pattern = Pattern.compile(planetRegex);
            matcher = pattern.matcher(decryptedMessage.toString());

            while (matcher.find()) {

                String name = matcher.group("name");
                String type = matcher.group("type");

                if ("A".equals(type)) {
                    attackedPlanets.add(name);
                } else {
                    destroyedPlanets.add(name);
                }
            }

        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        attackedPlanets.forEach(p -> System.out.println("-> " + p));
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        destroyedPlanets.forEach(p -> System.out.println("-> " + p));
    }
}
