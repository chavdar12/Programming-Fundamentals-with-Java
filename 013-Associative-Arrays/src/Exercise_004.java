import java.util.Arrays;
import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+")).filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);

    }
}
