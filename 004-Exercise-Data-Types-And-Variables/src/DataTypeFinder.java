import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isInteger = true;
            boolean isFloatingPoint = true;
            boolean isString = true;
            boolean isCharacter = true;
            boolean isBoolean = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '.') {
                    isInteger = false;
                    isCharacter = false;
                    isBoolean = false;
                } else if (input.charAt(i) == 't' || input.charAt(i) == 'f') {
                    isInteger = false;
                    isFloatingPoint = false;
                    isCharacter = false;
                    isString = false;
                } else if (input.charAt(i) == '\'') {
                    isInteger = false;
                    isFloatingPoint = false;
                    isString = false;
                    isBoolean = false;
                } else if (input.charAt(i) == '\"') {
                    isInteger = false;
                    isFloatingPoint = false;
                    isCharacter = false;
                    isBoolean = false;
                }
            }
            if (isInteger) {
                System.out.printf("%s is integer type%n", input);
            } else if (isFloatingPoint) {
                System.out.printf("%s is floating point type%n", input);
            } else if (isString) {
                System.out.printf("%s is string type%n", input);
            } else if (isCharacter) {
                System.out.printf("%s is character type%n", input);
            } else if (isBoolean) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is not a valid type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}