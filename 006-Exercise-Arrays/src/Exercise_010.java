import java.util.Scanner;

public class Exercise_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] indexes = scanner.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (String s : indexes) {
            int index = Integer.parseInt(s);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);
            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = scanner.nextLine();
                continue;
            }

            field[index] = 0;

            if ("right".equals(cmd)) {
                index += flyLength;
                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else {
                index -= flyLength;
                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }
        }
        for (int j : field) {
            System.out.print(j + " ");
        }
    }
}
