import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        int numberOfDrums = Integer.parseInt(scanner.nextLine());
        List<Integer> initial = new ArrayList<>();
        List<Integer> drums = new ArrayList<>();
        for (int i = 0; i < numberOfDrums; i++) {
            int quality = Integer.parseInt(scanner.nextLine());
            initial.add(quality);
            drums.add(quality);
        }
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drums.size(); i++) {
                drums.set(i, drums.get(i) - hitPower);
                if (drums.get(i) <= 0) {
                    double price = initial.get(i) * 3.0;
                    if (savings >= price) {
                        savings -= price;
                        drums.set(i, initial.get(i));
                    } else {
                        drums.remove(i);
                        initial.remove(i);
                        i--;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int drum : drums) {
            System.out.print(drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
