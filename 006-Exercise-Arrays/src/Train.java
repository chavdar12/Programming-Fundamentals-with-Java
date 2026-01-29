import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];
        }
        for (int i = 0; i < wagons; i++) {
            System.out.print(people[i] + " ");
        }
    }
}
