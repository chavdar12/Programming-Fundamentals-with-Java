import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int padawansCnt = Integer.parseInt(scanner.nextLine());
        double pricePerLightsaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double lightSabersPrice = Math.ceil(padawansCnt * 1.1) * pricePerLightsaber;
        double robesTotalPrice = padawansCnt * pricePerRobe;
        int freeBelts = padawansCnt / 6;
        double beltsTotalPrice = (padawansCnt - freeBelts) * pricePerBelt;

        double finalPrice = lightSabersPrice + robesTotalPrice + beltsTotalPrice;

        if (finalPrice > budget) {
            double moneyNeed = finalPrice - budget;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        }
    }
}
