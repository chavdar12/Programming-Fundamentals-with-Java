import java.util.Scanner;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split(",\\s+");
        for (String ticket : tickets) {
            ticket = ticket.trim();
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }
            String leftHalf = ticket.substring(0, 10);
            String rightHalf = ticket.substring(10);
            String winningSymbols = getWinningSymbols(leftHalf);
            if (winningSymbols.isEmpty()) {
                System.out.println("ticket \"" + ticket + "\" - no match");
                continue;
            }
            int winningSymbolsCount = getWinningSymbolsCount(leftHalf, winningSymbols);
            if (winningSymbolsCount < 6 || winningSymbolsCount > 10) {
                System.out.println("ticket \"" + ticket + "\" - no match");
                continue;
            }
            int winningSymbolsCountRight = getWinningSymbolsCount(rightHalf, winningSymbols);
            if (winningSymbolsCountRight < 6 || winningSymbolsCountRight > 10) {
                System.out.println("ticket \"" + ticket + "\" - no match");
                continue;
            }
            int winningSymbolsCountMin = Math.min(winningSymbolsCount, winningSymbolsCountRight);
            if (winningSymbolsCountMin == 10) {
                System.out.println("ticket \"" + ticket + "\" - " + winningSymbolsCountMin + winningSymbols + " Jackpot!");
            } else {
                System.out.println("ticket \"" + ticket + "\" - " + winningSymbolsCountMin + winningSymbols);
            }
        }
    }

    private static int getWinningSymbolsCount(String leftHalf, String winningSymbols) {
        int winningSymbolsCount = 0;
        for (int i = 0; i < leftHalf.length(); i++) {
            if (leftHalf.charAt(i) == winningSymbols.charAt(0)) {
                winningSymbolsCount++;
            } else {
                winningSymbolsCount = 0;
            }
            if (winningSymbolsCount == 10) {
                break;
            }
        }
        return winningSymbolsCount;
    }

    private static String getWinningSymbols(String leftHalf) {
        String winningSymbols = "";
        if (leftHalf.matches("(@{6,}|#{6,}|\\${6,}|\\^{6,})")) {
            winningSymbols = leftHalf.substring(0, 1);
        }
        return winningSymbols;
    }
}
