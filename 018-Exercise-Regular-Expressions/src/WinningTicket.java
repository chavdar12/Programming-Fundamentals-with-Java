import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    private static final Pattern WINNING = Pattern.compile("([@#$^])\\1{5,}");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split(",");

        for (String ticket : tickets) {
            ticket = ticket.trim();
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            Matcher left = WINNING.matcher(ticket.substring(0, 10));
            Matcher right = WINNING.matcher(ticket.substring(10));
            if (!left.find() || !right.find() || !left.group(1).equals(right.group(1))) {
                System.out.printf("ticket \"%s\" - no match%n", ticket);
                continue;
            }

            int length = Math.min(left.group().length(), right.group().length());
            System.out.printf("ticket \"%s\" - %d%s%s%n", ticket, length, left.group(1), length == 10 ? " Jackpot!" : "");
        }
    }
}
