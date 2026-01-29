import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = Arrays.stream(input).map(Integer::parseInt).toList();
        List<Integer> result = numbers.stream().filter(number -> number >= 0).toList();

        if (result.size() == 0) {
            System.out.println("empty");
        } else {
            for (int i = result.size() - 1; i >= 0; i--) {
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
