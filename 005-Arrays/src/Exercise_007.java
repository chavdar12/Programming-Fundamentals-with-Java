import java.util.Arrays;
import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (arr.length > 1) {
            int[] condensed = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                condensed[i] = arr[i] + arr[i + 1];
            }
            arr = condensed;
        }
        System.out.println(arr[0]);
    }
}
