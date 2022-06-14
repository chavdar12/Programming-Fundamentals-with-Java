import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = line[0];
                secondArr[i] = line[1];
            } else {
                secondArr[i] = line[0];
                firstArr[i] = line[1];
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
