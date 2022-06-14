import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> customers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(
                "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+([.]\\d+)?)\\$");

        double totalIncome = 0.0;
        while (!"end of shift".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;

                if (!customers.containsKey(customer)) {
                    LinkedHashMap<String, Double> products = new LinkedHashMap<>();
                    products.put(product, totalPrice);
                    customers.put(customer, products);
                } else {
                    if (customers.get(customer).containsKey(product)) {
                        double oldValue = customers.get(customer).get(product);
                        customers.get(customer).put(product, oldValue + totalPrice);
                    } else {
                        customers.get(customer).put(product, totalPrice);
                    }
                }

                totalIncome += totalPrice;
            }
            input = scanner.nextLine();
        }

        customers.forEach((key, value) -> value.forEach((key1, value1) -> System.out.printf("%s: %s - %.2f%n", key, key1, value1)));
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
