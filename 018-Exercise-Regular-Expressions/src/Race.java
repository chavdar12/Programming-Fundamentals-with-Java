import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] participants = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        int[] participantsTime = new int[participants.length];
        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            int distance = 0;
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (Character.isAlphabetic(currentChar)) {
                    name.append(currentChar);
                } else if (Character.isDigit(currentChar)) {
                    distance += Integer.parseInt(String.valueOf(currentChar));
                }
            }
            for (int i = 0; i < participants.length; i++) {
                if (name.toString().equals(participants[i])) {
                    participantsTime[i] += distance;
                }
            }
            input = scanner.nextLine();
        }
        int first = 0;
        int second = 0;
        int third = 0;
        for (int j : participantsTime) {
            if (j > first) {
                first = j;
            }
        }
        for (int j : participantsTime) {
            if (j > second && j < first) {
                second = j;
            }
        }
        for (int j : participantsTime) {
            if (j > third && j < second) {
                third = j;
            }
        }
        for (int i = 0; i < participantsTime.length; i++) {
            if (participantsTime[i] == first) {
                System.out.println("1st place: " + participants[i]);
            }
        }

        for (int i = 0; i < participantsTime.length; i++) {
            if (participantsTime[i] == second) {
                System.out.println("2nd place: " + participants[i]);
            }
        }

        for (int i = 0; i < participantsTime.length; i++) {
            if (participantsTime[i] == third) {
                System.out.println("3rd place: " + participants[i]);
            }
        }
    }
}
