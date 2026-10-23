import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());
        double firstLine = Math.hypot(x1 - x2, y1 - y2);
        double secondLine = Math.hypot(x3 - x4, y3 - y4);
        if (firstLine >= secondLine) {
            printLine(x1, y1, x2, y2);
        } else {
            printLine(x3, y3, x4, y4);
        }
    }

    private static void printLine(double x1, double y1, double x2, double y2) {
        // the point closer to the center goes first
        if (Math.hypot(x1, y1) <= Math.hypot(x2, y2)) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
        }
    }
}
