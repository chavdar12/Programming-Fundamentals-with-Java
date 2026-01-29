import java.util.Scanner;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        int numberOfDrums = Integer.parseInt(scanner.nextLine());
        double[] drums = new double[numberOfDrums];
        for (int i = 0; i < numberOfDrums; i++) {
            drums[i] = Double.parseDouble(scanner.nextLine());
        }
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drums.length; i++) {
                drums[i] -= hitPower;
                if (drums[i] <= 0) {
                    if (savings >= drums[i] * (-1)) {
                        savings -= drums[i] * (-1);
                        drums[i] *= 3;
                    } else {
                        drums[i] = 0;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (double drum : drums) {
            System.out.print((int) drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
