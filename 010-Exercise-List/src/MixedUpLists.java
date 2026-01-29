import java.util.Scanner;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstList = new int[n];
        int[] secondList = new int[n];
        for (int i = 0; i < n; i++) {
            firstList[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            secondList[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] mixedList = new int[2 * n];
        for (int i = 0; i < n; i++) {
            mixedList[i] = firstList[i];
            mixedList[2 * n - 1 - i] = secondList[i];
        }
        int min = Math.min(firstList[0], firstList[n - 1]);
        int max = Math.max(firstList[0], firstList[n - 1]);
        for (int i = 0; i < 2 * n; i++) {
            if (mixedList[i] > min && mixedList[i] < max) {
                System.out.print(mixedList[i] + " ");
            }
        }
    }
}
