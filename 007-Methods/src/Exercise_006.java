import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = calcRectangleArea(width, height);
        System.out.printf("%.0f%n", area);
    }

    public static double calcRectangleArea(double width, double height) {
        return width * height;
    }
}
