import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int open = 0;
        int close = 0;
        boolean balanced = true;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            if ("(".equals(line)) {
                open++;
            } else if (")".equals(line)) {
                close++;
            }
            if (open - close != 0) {
                balanced = false;
            }
        }
        if (balanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}