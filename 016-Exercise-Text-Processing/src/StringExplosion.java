import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        int power = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                output.append(symbol);
            } else if (power == 0) {
                output.append(symbol);
            } else {
                power--;
            }
        }
        System.out.println(output);
    }
}
