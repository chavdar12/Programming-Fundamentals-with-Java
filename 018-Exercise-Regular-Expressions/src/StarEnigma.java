import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(
                "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int key = input.replaceAll("[^starSTAR]", "").length();
            StringBuilder decryptedMessage = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                decryptedMessage.append((char) (input.charAt(j) - key));
            }

            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                (matcher.group("attackType").equals("A") ? attacked : destroyed).add(matcher.group("planet"));
            }
        }

        printPlanets("Attacked", attacked);
        printPlanets("Destroyed", destroyed);
    }

    private static void printPlanets(String label, List<String> planets) {
        System.out.printf("%s planets: %d%n", label, planets.size());
        planets.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }
}
