import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"3:1".equals(line)) {
            String[] commands = line.split("\\s+");

            switch (commands[0]) {
                case "merge" -> {
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > input.size() - 1) {
                        endIndex = input.size() - 1;
                    }
                    int counter = startIndex;
                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = input.get(counter) + input.get(counter + 1);
                        input.set(counter, concat);
                        input.remove(counter + 1);
                    }
                }
                case "divide" -> {
                    int index = Integer.parseInt(commands[1]);
                    int partitions = Integer.parseInt(commands[2]);
                    if (index >= 0 && index < input.size() && partitions >= 0 && partitions <= 100) {
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();

                        int portionLength = element.length() / partitions;
                        int count = 0;
                        if (element.length() % partitions == 0) {
                            for (int i = 0; i < partitions; i++) {
                                StringBuilder concat = new StringBuilder();
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat.append(symbol);
                                    count++;
                                }
                                newList.add(concat.toString());
                            }
                        } else {
                            for (int i = 0; i < partitions; i++) {
                                StringBuilder concat = new StringBuilder();

                                if (i == partitions - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        concat.append(symbol);
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        concat.append(symbol);
                                        count++;
                                    }
                                }
                                newList.add(concat.toString());
                            }
                        }
                        input.remove(index);
                        input.addAll(index, newList);
                    }
                }
            }
            line = scanner.nextLine();
        }

        for (String item : input) {
            System.out.print(item + " ");
        }
    }
}