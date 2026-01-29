import java.util.Scanner;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        StringBuilder result = new StringBuilder();
        int uniqueSymbolsCount = 0;
        for (int i = 0; i < input.length; i += 2) {
            String text = input[i].toUpperCase();
            int repeatCount = Integer.parseInt(input[i + 1]);
            result.append(text.repeat(Math.max(0, repeatCount)));
        }
        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == i) {
                uniqueSymbolsCount++;
            }
        }
        System.out.println("Unique symbols used: " + uniqueSymbolsCount);
        System.out.println(result);
    }
}
