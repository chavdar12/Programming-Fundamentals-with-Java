import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {
                case "Add":
                    String elementToAdd = tokens[1];
                    numbers.add(elementToAdd);
                    break;
                case "Insert":
                    String elementToInsert = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (isValidIndex(index, numbers)) {
                        numbers.add(index, elementToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (isValidIndex(index, numbers)) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int rotCount = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])) {
                        for (int i = 0; i < rotCount % numbers.size(); i++) {
                            String temp = numbers.get(0);
                            for (int j = 0; j < numbers.size() - 1; j++) {
                                String nextElement = numbers.get(j + 1);
                                numbers.set(j, nextElement);
                            }
                            numbers.set(numbers.size() - 1, temp);
                        }
                    } else {
                        for (int i = 0; i < rotCount % numbers.size(); i++) {
                            String temp = numbers.get(numbers.size() - 1);
                            for (int j = numbers.size() - 1; j > 0; j--) {
                                String nextElement = numbers.get(j - 1);
                                numbers.set(j, nextElement);
                            }
                            numbers.set(0, temp);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", numbers));
    }

    private static boolean isValidIndex(int index, List<String> collection) {
        return index >= 0 && index < collection.size();
    }
}
