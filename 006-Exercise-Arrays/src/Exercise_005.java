import java.util.Arrays;
import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
