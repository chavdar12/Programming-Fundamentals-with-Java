import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printTotalPrice(product, quantity);
    }

    private static void printTotalPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee" -> price = 1.50;
            case "water" -> price = 1.00;
            case "coke" -> price = 1.40;
            case "snacks" -> price = 2.00;
        }
        System.out.printf("%.2f", price * quantity);
    }
}
