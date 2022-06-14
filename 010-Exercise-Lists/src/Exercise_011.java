import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String message = scanner.nextLine();

        for (int currentNumber : numbers) {
            int index = calculateIndex(currentNumber);

            char currentChar = getCharFromMessage(index, message);
            System.out.print(currentChar);

            int realIndex = calculateRealIndex(index, message);
            message = message.substring(0, realIndex) + message.substring(realIndex + 1);
        }
        System.out.println();

    }

    static int calculateIndex(int number) {
        int index = 0;
        while (number > 0) {
            int currentNumber = number % 10;
            index += currentNumber;
            number /= 10;
        }

        return index;
    }

    static char getCharFromMessage(int index, String message) {

        return message.charAt(index % message.length());
    }

    static int calculateRealIndex(int index, String message) {

        return index % message.length();
    }
}