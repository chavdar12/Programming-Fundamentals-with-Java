import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        ArrayList<String> result = new ArrayList<>();
        for (int i = input.length - 1; i >= 0; i--) {
            String[] arr = input[i].trim().split("\\s+");
            result.addAll(Arrays.asList(arr));
        }
        result.remove("");
        System.out.println(String.join(" ", result));
    }
}
