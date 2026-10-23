import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                map.merge(symbol, 1, Integer::sum);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
