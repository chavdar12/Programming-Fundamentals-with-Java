import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String result = repeatString(input, count);
        System.out.println(result);
    }

    private static String repeatString(String input, int count) {
        return String.valueOf(input).repeat(Math.max(0, count));
    }
}
