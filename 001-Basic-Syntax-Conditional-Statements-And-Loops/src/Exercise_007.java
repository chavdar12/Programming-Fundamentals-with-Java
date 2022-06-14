import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        if (0 <= age && age <= 18) {
            switch (dayType) {
                case "Weekday" -> ticketPrice = 12;
                case "Weekend" -> ticketPrice = 15;
                case "Holiday" -> ticketPrice = 5;
            }
        } else if (18 < age && age <= 64) {
            ticketPrice = switch (dayType) {
                case "Weekday" -> 18;
                case "Weekend" -> 20;
                case "Holiday" -> 12;
                default -> ticketPrice;
            };
        } else if (64 < age && age <= 122) {
            ticketPrice = switch (dayType) {
                case "Weekday" -> 12;
                case "Weekend" -> 15;
                case "Holiday" -> 10;
                default -> ticketPrice;
            };
        }

        if (ticketPrice == 0) {
            System.out.println("Error!");
        } else {
            System.out.println(ticketPrice);
        }
    }
}
