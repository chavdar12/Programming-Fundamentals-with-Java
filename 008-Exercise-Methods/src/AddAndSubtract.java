import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(firstNum, secondNum, thirdNum));
    }

    private static int subtract(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum - thirdNum;
    }
}
