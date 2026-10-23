import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] sequence = new long[Math.max(n, 3)];
        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 2;
        for (int i = 3; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}