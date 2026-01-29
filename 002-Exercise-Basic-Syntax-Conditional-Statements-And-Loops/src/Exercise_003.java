import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerPerson = 0;
        double totalPrice = 1;

        switch (group) {
            case "Students" -> {
                if (people >= 30) {
                    totalPrice = totalPrice * 0.85;
                }
                switch (day) {
                    case "Friday" -> pricePerPerson = 8.45;
                    case "Saturday" -> pricePerPerson = 9.80;
                    case "Sunday" -> pricePerPerson = 10.46;
                }
            }
            case "Business" -> {
                if (people >= 100) {
                    totalPrice = pricePerPerson * (people - 10);
                }
                pricePerPerson = switch (day) {
                    case "Friday" -> 10.90;
                    case "Saturday" -> 15.60;
                    case "Sunday" -> 16.00;
                    default -> pricePerPerson;
                };
            }
            case "Regular" -> {
                if (people >= 10 && people <= 20) {
                    totalPrice = totalPrice * 0.95;
                }
                pricePerPerson = switch (day) {
                    case "Friday" -> 15;
                    case "Saturday" -> 20;
                    case "Sunday" -> 22.50;
                    default -> pricePerPerson;
                };
            }
        }

        totalPrice = totalPrice * pricePerPerson * people;

        System.out.printf("Total price: %.2f", totalPrice);
    }
}