import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int waggonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Add")) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    int currentWaggon = train.get(i);
                    int totalCount = currentWaggon + people;
                    if (totalCount <= waggonCapacity) {
                        train.set(i, totalCount);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(train.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
