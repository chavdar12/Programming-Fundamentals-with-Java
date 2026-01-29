package Orders;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new LinkedList<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);
            Product product = new Product(name, price, quantity);
            if (!products.contains(product)) {
                products.add(product);
            } else {
                Product existingProduct = products.get(products.indexOf(product));
                existingProduct.setPrice(price);
                existingProduct.setQuantity(existingProduct.getQuantity() + quantity);
            }
            input = scanner.nextLine();
        }
        for (Product product : products) {
            System.out.printf("%s -> %.2f%n", product.getName(), product.getPrice() * product.getQuantity());
        }
    }
}
