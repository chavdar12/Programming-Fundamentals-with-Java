import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println("\n" + sum);
    }
}
