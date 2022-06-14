import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumTime = hour * 60 + minutes + 30;

        hour = sumTime / 60 % 24;
        minutes = sumTime % 60;

        System.out.printf("%d:%02d", hour, minutes);
    }
}
