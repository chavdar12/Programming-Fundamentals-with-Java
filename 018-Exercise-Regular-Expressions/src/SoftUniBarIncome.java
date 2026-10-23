import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(
                "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.\\d]*(?<price>\\d+(\\.\\d+)?)\\$");
        String input = scanner.nextLine();
        double totalIncome = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double totalPrice = Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
                totalIncome += totalPrice;
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), totalPrice);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
