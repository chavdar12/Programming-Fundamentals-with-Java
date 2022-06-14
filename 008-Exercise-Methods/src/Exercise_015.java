import java.util.Scanner;

public class Exercise_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line1x1 = Integer.parseInt(scanner.nextLine());
        int line1y1 = Integer.parseInt(scanner.nextLine());
        int line1x2 = Integer.parseInt(scanner.nextLine());
        int line1y2 = Integer.parseInt(scanner.nextLine());

        int line2x1 = Integer.parseInt(scanner.nextLine());
        int line2y1 = Integer.parseInt(scanner.nextLine());
        int line2x2 = Integer.parseInt(scanner.nextLine());
        int line2y2 = Integer.parseInt(scanner.nextLine());

        double line1Length = getLineLength(line1x1, line1x2, line1y1, line1y2);
        double line2Length = getLineLength(line2x1, line2x2, line2y1, line2y2);

        if (line1Length >= line2Length) {
            printLine(line1x1, line1x2, line1y1, line1y2);
        } else {
            printLine(line2x1, line2x2, line2y1, line2y2);
        }

    }

    private static void printLine(int x1, int x2, int y1, int y2) {
        if (findDiagonal(x1, y1) <= findDiagonal(x2, y2)) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }

    }

    private static double getLineLength(int x1, int x2, int y1, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private static double findDiagonal(int x, int y) {
        double a = x * 1.0;
        double b = y * 1.0;

        return Math.sqrt(Math.abs((Math.pow(a, 2)) + (Math.pow(b, 2))));
    }
}
