import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextLine())).toArray();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
