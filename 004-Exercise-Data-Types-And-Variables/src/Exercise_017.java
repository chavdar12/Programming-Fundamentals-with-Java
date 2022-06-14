import java.util.Scanner;

public class Exercise_017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long left, right, sum;

        for (int i = 0; i < input; i++) {
            left = scanner.nextLong();
            right = scanner.nextLong();

            if (left < right) {
                left = right;
            }
            sum = 0;
            while (left != 0) {
                sum += left % 10;
                left /= 10;

            }
            System.out.println(Math.abs(sum));
        }
    }
}