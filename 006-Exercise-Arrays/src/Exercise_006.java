import java.util.Arrays;
import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                found = true;
                System.out.println(i);
                break;
            }
        }
        if (!found) {
            System.out.println("no");
        }
    }
}
