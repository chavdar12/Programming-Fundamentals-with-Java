import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;
        while (startingYield >= 100) {
            total += startingYield - 26;
            startingYield -= 10;
            days++;
        }
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(days);
        System.out.println(total);
    }
}
