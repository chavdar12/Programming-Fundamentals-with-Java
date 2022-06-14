import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(str, count));

    }

    private static String repeatString(String str, int count) {
        return String.valueOf(str).repeat(Math.max(0, count));
    }
}
