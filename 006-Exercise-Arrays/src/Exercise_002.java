import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String s : secondArr) {
            for (String value : firstArr) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
