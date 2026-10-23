import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String type;
            if (input.matches("[+-]?\\d+")) {
                type = "integer";
            } else if (input.matches("[+-]?\\d*\\.\\d+")) {
                type = "floating point";
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            } else if (input.length() == 1) {
                type = "character";
            } else {
                type = "string";
            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}