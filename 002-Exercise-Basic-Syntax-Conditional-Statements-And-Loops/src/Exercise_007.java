import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coin = scanner.nextLine();

        double sumCoins = 0;

        while (!"Start".equals(coin)) {
            switch (coin) {
                case "0.1", "0.2", "0.5", "1", "2" -> sumCoins = sumCoins + Double.parseDouble(coin);
                default -> System.out.printf("Cannot accept %s%n", coin);
            }
            coin = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double productPrice = 0;

        while (!"End".equals(product)) {
            switch (product) {
                case "Nuts" -> productPrice = 2.0;
                case "Water" -> productPrice = 0.7;
                case "Crisps" -> productPrice = 1.5;
                case "Soda" -> productPrice = 0.8;
                case "Coke" -> productPrice = 1.0;
                default -> System.out.println("Invalid product");
            }

            if (sumCoins >= productPrice) {
                System.out.printf("Purchased %s%n", product);
                sumCoins = sumCoins - productPrice;
                productPrice = 0;
            } else if (productPrice > 0) {
                System.out.println("Sorry, not enough money");
                productPrice = 0;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
