import java.util.Arrays;
import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            int currentSum;
            for (int j = i + 1; j < numbers.length; j++) {
                currentSum = numbers[i] + numbers[j];
                if (currentSum == magicSum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
