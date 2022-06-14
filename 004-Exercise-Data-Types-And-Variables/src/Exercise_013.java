import java.util.Scanner;

public class Exercise_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        System.out.println(Math.abs(firstNum - secondNum) < eps);
    }
}