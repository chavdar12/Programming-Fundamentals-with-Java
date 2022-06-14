import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            boolean isPalindrome = isPalindrome(input);

            if (isPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        int number = Integer.parseInt(input);
        if (number >= 0 && number <= 9) {
            return true;
        } else {
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
