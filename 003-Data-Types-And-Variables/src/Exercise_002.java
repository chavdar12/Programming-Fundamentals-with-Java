import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        double result = num * 1.31;

        System.out.printf("%.3f", result);
    }
}
