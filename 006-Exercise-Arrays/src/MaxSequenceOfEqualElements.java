import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bestStart = 0;
        int bestLength = 1;
        int currentStart = 0;
        int currentLength = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentLength++;
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = currentStart;
                }
            } else {
                currentStart = i;
                currentLength = 1;
            }
        }
        for (int i = bestStart; i < bestStart + bestLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
