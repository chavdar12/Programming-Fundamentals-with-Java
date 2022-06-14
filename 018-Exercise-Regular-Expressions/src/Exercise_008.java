import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> furniture = new ArrayList<>();
        double totalPrice = 0.0;
        String regex = ">>(?<name>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!"Purchase".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(name);
                totalPrice += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
