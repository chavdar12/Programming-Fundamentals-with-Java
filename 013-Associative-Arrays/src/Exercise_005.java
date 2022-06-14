import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().trim().split("\\s+")).map(Integer::parseInt).sorted(Comparator.reverseOrder())
                .limit(3).forEach(n -> System.out.print(n + " "));
    }
}
