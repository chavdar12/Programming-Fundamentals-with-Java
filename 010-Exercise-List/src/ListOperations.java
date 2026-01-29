import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Add" -> numbers.add(Integer.parseInt(tokens[1]));
                case "Insert" -> {
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" -> {
                    int count = Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int firstElement = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            int lastElement = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
