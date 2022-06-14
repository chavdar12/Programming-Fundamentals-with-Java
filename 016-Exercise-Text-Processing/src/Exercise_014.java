import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.replaceAll(" ", "");
        String[] tickets = line.split(",");
        Pattern pattern = Pattern.compile("(@{6,}|\\${6,}|\\^{6,}|#{6,})");

        for (String ticket : tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            String ticketLeftHalf = ticket.substring(0, 10);
            Matcher leftHalf = pattern.matcher(ticketLeftHalf);

            String ticketRightHalf = ticket.substring(10);
            Matcher rightHalf = pattern.matcher(ticketRightHalf);

            if (leftHalf.find() && rightHalf.find()) {
                char winningSymbol = ticket.charAt(leftHalf.start());
                int winningSum = Math.min(leftHalf.end() - leftHalf.start(), rightHalf.end() - rightHalf.start());
                if (winningSum == 10) {
                    System.out.printf("ticket %s - %d%c Jackpot!\n", ticket, winningSum, winningSymbol);
                } else {
                    System.out.printf("ticket %s - %d%c\n", ticket, winningSum, winningSymbol);
                }
            } else {
                System.out.printf("ticket %s - no match\n", ticket);
            }
        }
    }
}
