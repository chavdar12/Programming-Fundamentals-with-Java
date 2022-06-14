import java.util.Arrays;
import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
}
