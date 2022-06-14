import java.util.Scanner;

public class Exercise_017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        System.out.println(getSign(num1, num2, num3));
    }

    public static String getSign(double n1, double n2, double n3) {
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            return "zero";
        } else if ((n1 > 0 && n2 > 0 && n3 > 0) || (n1 < 0 && n2 < 0 && n3 > 0) || (n1 < 0 && n2 > 0 && n3 < 0)
                   || (n1 > 0 && n2 < 0 && n3 < 0)) {
            return "positive";
        } else {
            return "negative";
        }
    }
}