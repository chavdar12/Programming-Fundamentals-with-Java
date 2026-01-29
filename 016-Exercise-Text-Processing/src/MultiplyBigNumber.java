import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        int remainder = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            int digit = first.charAt(i) - '0';
            int product = digit * second + remainder;
            remainder = product / 10;
            output.append(product % 10);
        }
        if (remainder > 0) {
            output.append(remainder);
        }
        output.reverse();
        System.out.println(output);
    }
}
