import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] bugsIndexes = scanner.nextLine().split(" ");
        int[] field = new int[fieldSize];
        for (String bugsIndex : bugsIndexes) {
            int index = Integer.parseInt(bugsIndex);
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            int bugIndex = Integer.parseInt(commandArray[0]);
            String direction = commandArray[1];
            int flyLength = Integer.parseInt(commandArray[2]);
            if (bugIndex >= 0 && bugIndex < field.length && field[bugIndex] == 1) {
                field[bugIndex] = 0;
                if (direction.equals("right")) {
                    bugIndex += flyLength;
                    while (bugIndex < field.length && field[bugIndex] == 1) {
                        bugIndex += flyLength;
                    }
                    if (bugIndex < field.length) {
                        field[bugIndex] = 1;
                    }
                } else {
                    bugIndex -= flyLength;
                    while (bugIndex >= 0 && field[bugIndex] == 1) {
                        bugIndex -= flyLength;
                    }
                    if (bugIndex >= 0) {
                        field[bugIndex] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}
