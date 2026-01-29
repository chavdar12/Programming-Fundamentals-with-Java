import java.util.Scanner;

public class Exercise_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            double money = Double.parseDouble(scanner.nextLine());

            double spend = 0;

            while (true) {
                String game = scanner.nextLine();

                if ("Game Time".equals(game)) {
                    break;
                }

                double price;

                switch (game) {
                    case "OutFall 4", "RoverWatch Origins Edition" -> price = 39.99;
                    case "CS: OG" -> price = 15.99;
                    case "Zplinter Zell" -> price = 19.99;
                    case "Honored 2" -> price = 59.99;
                    case "RoverWatch" -> price = 29.99;
                    default -> {
                        System.out.println("Not Found");
                        continue;
                    }
                }

                if (price > money) {
                    System.out.println("Too Expensive");
                    continue;
                }

                money -= price;
                spend += price;
                System.out.printf("Bought %s%n", game);

                if (money == 0) {
                    System.out.println("Out of money!");
                    return;
                }
            }

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, money);
        }
    }
}