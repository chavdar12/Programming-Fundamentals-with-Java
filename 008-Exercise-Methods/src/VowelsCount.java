import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if ("aeiouAEIOU".indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
