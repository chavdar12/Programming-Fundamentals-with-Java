package Exercise_004;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Product> products = new LinkedList<>();

        while (!"buy".equals(input)) {
            String[] tokens = input.split("\\s+");
            String productName = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);
            boolean containsProduct = false;
            for (Product product : products) {

                if (product.getName().equals(productName)) {
                    product.setPrice(price);
                    product.addQuantity(quantity);
                    containsProduct = true;
                }

            }
            if (!containsProduct) {
                Product product = new Product(productName, price, quantity);
                products.add(product);
            }

            input = scanner.nextLine();
        }

        products.forEach(
                p -> System.out.printf("%s -> %.2f%n", p.getName(), p.getPrice() * p.getQuantity()));
    }
}
