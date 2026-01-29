import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (distance1 <= distance2) {
            System.out.printf("(%f, %f)", x1, y1);
        } else {
            System.out.printf("(%f, %f)", x2, y2);
        }
    }
}
