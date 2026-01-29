import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arr = new Integer[3];
        arr[0] = Integer.parseInt(scanner.nextLine());
        arr[1] = Integer.parseInt(scanner.nextLine());
        arr[2] = Integer.parseInt(scanner.nextLine());

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
