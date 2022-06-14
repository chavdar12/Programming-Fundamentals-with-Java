import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Contains" -> {
                    int contains = Integer.parseInt(data[1]);
                    if (listNumbers.contains(contains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                }
                case "Print" -> {
                    if (data[1].equals("even")) {
                        printEvenOdd(listNumbers, 0);

                    } else if (data[1].equals("odd")) {
                        printEvenOdd(listNumbers, 1);
                    }
                    System.out.println();
                }
                case "Get" -> {
                    int sum = 0;
                    for (Integer number : listNumbers) {
                        sum += number;

                    }
                    System.out.println(sum);
                }
                case "Filter" -> {
                    StringBuilder outputFilter = new StringBuilder();
                    int num = Integer.parseInt(data[2]);
                    switch (data[1]) {
                        case "<" -> {
                            for (Integer aList : listNumbers) {
                                if (aList < num) {
                                    outputFilter.append(aList).append(" ");

                                }
                            }
                            System.out.println(outputFilter);
                        }
                        case ">" -> {
                            for (Integer aList : listNumbers) {
                                if (aList > num) {
                                    outputFilter.append(aList).append(" ");

                                }
                            }
                            System.out.println(outputFilter);
                        }
                        case ">=" -> {
                            for (Integer aList : listNumbers) {
                                if (aList >= num) {
                                    outputFilter.append(aList).append(" ");

                                }
                            }
                            System.out.println(outputFilter);
                        }
                        case "<=" -> {
                            for (Integer aList : listNumbers) {
                                if (aList <= num) {
                                    outputFilter.append(aList).append(" ");

                                }
                            }
                            System.out.println(outputFilter);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
    }

    private static void printEvenOdd(List<Integer> listNumbers, int evenOdd) {
        for (Integer listNumber : listNumbers) {
            if (listNumber % 2 == evenOdd) {
                System.out.print(listNumber + " ");
            }
        }
    }
}