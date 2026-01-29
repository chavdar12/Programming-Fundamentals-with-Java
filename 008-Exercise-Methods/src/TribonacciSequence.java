import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(triboncci(n));
    }

    private static int triboncci(int n) {
        if (n <= 2)
            return 1;
        return triboncci(n - 1) + triboncci(n - 2) + triboncci(n - 3);
    }
}