import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sum(firstNum, secondNum);
        sum = subtract(sum, thirdNum);
        System.out.println(sum);
    }

    private static int subtract(int sum, int thirdNum) {
        return sum - thirdNum;
    }

    private static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
