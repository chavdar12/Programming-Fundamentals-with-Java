import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        Arrays.stream(secondArray).forEachOrdered(value -> Arrays.stream(firstArray).filter(value::equals).map(s -> value + " ").forEachOrdered(System.out::print));
    }
}
