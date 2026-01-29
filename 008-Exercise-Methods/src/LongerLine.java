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
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        double distance3 = Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));
        double distance4 = Math.sqrt(Math.pow(x4, 2) + Math.pow(y4, 2));
        if (distance1 <= distance2) {
            if (distance3 <= distance4) {
                System.out.printf("(%f, %f)(%f, %f)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%f, %f)(%f, %f)", x1, y1, x4, y4);
            }
        } else {
            if (distance3 <= distance4) {
                System.out.printf("(%f, %f)(%f, %f)", x3, y3, x2, y2);
            } else {
                System.out.printf("(%f, %f)(%f, %f)", x3, y3, x4, y4);
            }
        }
    }
}
