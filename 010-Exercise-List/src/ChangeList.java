import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");

            int element = Integer.parseInt(tokens[1]);
            if (tokens[0].equals("Delete")) {

                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int index = Integer.parseInt(tokens[2]);

                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                }
            }

            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
