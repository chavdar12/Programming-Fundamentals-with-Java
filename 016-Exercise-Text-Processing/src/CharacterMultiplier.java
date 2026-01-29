import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String first = strings[0];
        String second = strings[1];
        int sum = 0;
        int minLength = Math.min(first.length(), second.length());
        for (int i = 0; i < minLength; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        if (first.length() > second.length()) {
            for (int i = minLength; i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = minLength; i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
