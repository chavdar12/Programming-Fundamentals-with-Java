import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] tokens = command.split(" ");

            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                for (int i = startIndex; i < endIndex; i++) {
                    input.set(startIndex, input.get(startIndex) + input.get(startIndex + 1));
                    input.remove(startIndex + 1);
                }
            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);

                String element = input.get(index);
                input.remove(index);

                int partLength = element.length() / partitions;

                List<String> result = new ArrayList<>();

                for (int i = 0; i < partitions; i++) {
                    if (i == partitions - 1) {
                        result.add(element.substring(i * partLength));
                    } else {
                        result.add(element.substring(i * partLength, (i + 1) * partLength));
                    }
                }

                input.addAll(index, result);
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", input));
    }
}