import java.util.Scanner;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            String name = input.substring(input.indexOf('%') + 1, input.indexOf('<'));
            String product = input.substring(input.indexOf('<') + 1, input.indexOf('>'));
            int quantity = Integer.parseInt(input.substring(input.indexOf('|') + 1, input.indexOf('|') + 2));
            double price = Double.parseDouble(input.substring(input.indexOf('$') + 1, input.indexOf('$') + 4));
            double totalPrice = quantity * price;
            totalIncome += totalPrice;
            System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
