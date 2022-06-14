import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if ("int".equals(type)) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1, num2));
        } else if ("char".equals(type)) {
            char char1 = scanner.nextLine().charAt(0);
            char char2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(char1, char2));
        } else if ("string".equals(type)) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(getMax(str1, str2));
        }

    }

    private static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    private static char getMax(char char1, char char2) {
        if (char1 > char2) {
            return char1;
        }
        return char2;
    }

    private static String getMax(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return str1;
        }
        return str2;
    }
}
