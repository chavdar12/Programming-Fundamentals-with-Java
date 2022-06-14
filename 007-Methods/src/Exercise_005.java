import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println(calcPrice(product, quantity));

    }

    private static double calcPrice(String product, int quantity) {
        return switch (product) {
            case "coffee" -> 1.50 * quantity;
            case "water" -> 1.00 * quantity;
            case "coke" -> 1.40 * quantity;
            case "snacks" -> 2.00 * quantity;
            default -> -1.00;
        };
    }
}
