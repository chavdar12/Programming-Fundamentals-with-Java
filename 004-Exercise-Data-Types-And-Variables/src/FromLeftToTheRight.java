import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long left = Long.parseLong(numbers[0]);
            long right = Long.parseLong(numbers[1]);
            long number = Math.abs(Math.max(left, right));
            long sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println(sum);
        }
    }
}