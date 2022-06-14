import java.util.Scanner;

public class Exercise_016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num <= 0) {
            System.out.println(0);
        } else if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println("1 1");
        } else if (num == 3) {
            System.out.println("1 1 2");
        } else {
            System.out.print("1 1 2 ");
            GetFibonacci(num);
        }

    }

    private static void GetFibonacci(int num) {
        int first = 1;
        int second = 1;
        int third = 2;
        int max = num;
        for (int i = 0; i < max - 3; i++) {
            num = first + second + third;
            first = second;
            second = third;
            third = num;
            System.out.printf("%d ", num);
        }
    }
}
