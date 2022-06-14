import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int littersInTank = 0;
        int maxTankCapacity = 255;

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (littersInTank + litters > maxTankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                littersInTank += litters;
            }
        }
        System.out.println(littersInTank);
    }
}
