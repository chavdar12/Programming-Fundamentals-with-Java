import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[input];
        String[] secondArray = new String[input];
        for (int i = 0; i < input; i++) {
            String[] inputArray = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = inputArray[0];
                secondArray[i] = inputArray[1];
            } else {
                firstArray[i] = inputArray[1];
                secondArray[i] = inputArray[0];
            }
        }
        for (String s : firstArray) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : secondArray) {
            System.out.print(s + " ");
        }
    }
}
