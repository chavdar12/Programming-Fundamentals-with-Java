import java.util.Arrays;
import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
