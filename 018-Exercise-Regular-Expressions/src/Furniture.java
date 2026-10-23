import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+)");

        System.out.println("Bought furniture:");
        double totalMoneySpent = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group("name"));
                totalMoneySpent += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalMoneySpent);
    }
}
