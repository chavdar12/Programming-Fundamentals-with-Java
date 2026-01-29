import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split(" ");
        int specialNumber = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);
        int index = numbers.indexOf(specialNumber);
        while (index != -1) {
            int left = Math.max(0, index - power);
            int right = Math.min(numbers.size() - 1, index + power);
            if (right >= left) {
                numbers.subList(left, right + 1).clear();
            }
            index = numbers.indexOf(specialNumber);
        }
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);

    }
}
