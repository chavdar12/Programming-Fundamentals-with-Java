import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int swapIndex = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[swapIndex];
            words[swapIndex] = temp;
        }
        System.out.println(Arrays.toString(words));
    }
}
