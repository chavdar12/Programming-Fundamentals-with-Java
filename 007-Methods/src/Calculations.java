import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add" -> add(firstNum, secondNum);
            case "multiply" -> multiply(firstNum, secondNum);
            case "subtract" -> subtract(firstNum, secondNum);
            case "divide" -> divide(firstNum, secondNum);
        }
    }

    private static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }

    private static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    private static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    private static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
