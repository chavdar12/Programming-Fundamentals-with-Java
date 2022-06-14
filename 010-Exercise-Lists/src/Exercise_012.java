import java.util.Scanner;

public class Exercise_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] spliced = input.split("\\s+");

        double firstRacerTime = 0;
        double secondRacerTime = 0;

        for (int i = 0; i < spliced.length / 2; i++) {
            int addToFirstRacer = Integer.parseInt(spliced[i]);
            int addToSecondRacer = Integer.parseInt(spliced[spliced.length - 1 - i]);
            if (addToFirstRacer != 0) {
                firstRacerTime += addToFirstRacer;
            } else {
                firstRacerTime *= 0.8;
            }

            if (addToSecondRacer != 0) {
                secondRacerTime += addToSecondRacer;
            } else {
                secondRacerTime *= 0.8;
            }
        }

        if (firstRacerTime < secondRacerTime) {
            System.out.printf("The winner is left with total time: %.1f", firstRacerTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", secondRacerTime);
        }
    }
}