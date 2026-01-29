import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long left = Long.parseLong(numbers[0]);
            long right = Long.parseLong(numbers[1]);
            long sum = 0;
            if (left > right) {
                while (left > 0) {
                    sum += left % 10;
                    left /= 10;
                }
            } else {
                while (right > 0) {
                    sum += right % 10;
                    right /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}