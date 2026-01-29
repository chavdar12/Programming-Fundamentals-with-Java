import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (playerOne.size() > 0 && playerTwo.size() > 0) {
            int firstCardPlayerOne = playerOne.get(0);
            int firstCardPlayerTwo = playerTwo.get(0);

            if (firstCardPlayerOne > firstCardPlayerTwo) {
                playerOne.add(firstCardPlayerOne);
                playerOne.add(firstCardPlayerTwo);
            } else if (firstCardPlayerOne < firstCardPlayerTwo) {
                playerTwo.add(firstCardPlayerTwo);
                playerTwo.add(firstCardPlayerOne);
            }

            playerOne.remove(0);
            playerTwo.remove(0);
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player wins! Sum: " + playerOne.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.println("Second player wins! Sum: " + playerTwo.stream().mapToInt(Integer::intValue).sum());
        }
    }
}