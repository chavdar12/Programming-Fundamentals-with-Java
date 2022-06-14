import java.util.Scanner;

public class Exercise_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nOriginalValue = n;
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int targetPoke = 0;
        while (n > m) {
            n -= m;
            targetPoke++;
            if (n * 2 == nOriginalValue && y != 0) {
                n = n / y;
            }
        }
        System.out.print(n + "\n" + targetPoke);
    }
}
