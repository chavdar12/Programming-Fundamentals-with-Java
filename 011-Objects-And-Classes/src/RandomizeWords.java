import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomIndex = random.nextInt(words.length);
            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;
        }
        System.out.println(Arrays.toString(words).replaceAll("[\\[\\],]", ""));
    }
}
