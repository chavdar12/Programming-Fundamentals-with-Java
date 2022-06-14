import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(repeatWord(word));
        }
        System.out.println(result);
    }

    private static String repeatWord(String word) {

        int times = word.length();
        return word.repeat(times);
    }
}
