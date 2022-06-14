import java.util.Arrays;
import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean identical = true;

        if (firstArr.length != secondArr.length) {
            System.out.println("Arrays are not identical.");
        } else {
            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] != secondArr[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    identical = false;
                    break;
                } else {
                    sum += firstArr[i];
                }
            }
        }
        if (identical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
