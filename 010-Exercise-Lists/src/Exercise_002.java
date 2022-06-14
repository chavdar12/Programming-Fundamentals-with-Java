import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    while (numbers.contains(Integer.parseInt(tokens[1]))) {
                        numbers.remove(Integer.valueOf(Integer.parseInt(tokens[1])));
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index < numbers.size()) {
                        numbers.add(index, element);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
