import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextLine().charAt(0);
        int end = scanner.nextLine().charAt(0);
        for (int i = start; i <= end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
