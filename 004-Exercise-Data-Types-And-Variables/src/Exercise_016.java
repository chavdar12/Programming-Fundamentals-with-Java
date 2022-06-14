import java.util.Scanner;

public class Exercise_016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean balanced = true;

        int openCount = 0;

        while (n-- > 0) {
            String line = scanner.nextLine();
            if ("(".equals(line)) {
                openCount++;
            } else if (")".equals(line)) {
                if (openCount == 1) {
                    openCount = 0;
                } else {
                    balanced = false;
                }
            }
        }
        if (balanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}