import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int minNumber = minNumber(a, b, c);
        System.out.println(minNumber);
    }

    private static int minNumber(int first, int second, int third) {
        if (first < second) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }
}
