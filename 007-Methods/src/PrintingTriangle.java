import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int i1) {
        for (int j = 1; j <= i1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
