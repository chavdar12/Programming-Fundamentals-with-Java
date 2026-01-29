import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalSum = 0;
        int number = Integer.parseInt(input);

        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt("" + input.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }
        if (number == totalSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
