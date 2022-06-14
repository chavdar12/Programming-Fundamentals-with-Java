import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(number)) {
            int bombIndex = numbers.indexOf(number);
            int leftBound = Math.max(bombIndex - power, 0);
            int rightBound = Math.min(bombIndex + power, numbers.size() - 1);

            if (rightBound >= leftBound) {
                numbers.subList(leftBound, rightBound + 1).clear();
            }
        }
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
