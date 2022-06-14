import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }

            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                }
                case "Remove", "RemoveAt" -> {
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemove);
                }
                case "Insert" -> {
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numberToInsert);
                }
            }
        }
        System.out.println(numbers.stream().map(Object::toString)
                                   .collect(Collectors.joining(" ")));
    }
}
