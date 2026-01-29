import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Bought furniture:");
        double totalMoneySpent = 0;
        while (!input.equals("Purchase")) {
            String[] tokens = input.split(">>>");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);
            System.out.println(name);
            totalMoneySpent += price * quantity;
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalMoneySpent);
    }
}
