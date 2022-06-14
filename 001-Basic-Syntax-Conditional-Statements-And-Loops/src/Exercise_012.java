import java.util.Scanner;

public class Exercise_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (number % 2 == 0) {
                System.out.printf("The number is: %d%n", Math.abs(number));
                break;
            } else {
                System.out.println("Please write an even number.");
            }
            number = Integer.parseInt(scanner.nextLine());
        }
    }
}
