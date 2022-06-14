import java.util.Arrays;
import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n % arr.length; i++) {
            int temp = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = temp;
        }

        for (int arrEl : arr) {
            System.out.print(arrEl + " ");
        }
    }
}
