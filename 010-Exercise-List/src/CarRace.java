import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        double leftTime = 0;
        double rightTime = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] == 0) {
                leftTime *= 0.8;
            } else {
                leftTime += numbers[i];
            }
        }
        for (int i = numbers.length - 1; i > numbers.length / 2; i--) {
            if (numbers[i] == 0) {
                rightTime *= 0.8;
            } else {
                rightTime += numbers[i];
            }
        }
        if (leftTime < rightTime) {
            System.out.printf("The winner is left with total time: %.1f", leftTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightTime);
        }
    }
}
