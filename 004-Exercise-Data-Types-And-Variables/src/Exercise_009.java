import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int yield1 = 0;
        int days = 0;
        int workersConsume = 26;
        while (startingYield >= 100) {
            days++;
            yield1 += startingYield;
            startingYield -= 10;
            yield1 -= workersConsume;
        }
        if (yield1 >= workersConsume)
            yield1 -= workersConsume;
        System.out.print(days + "\n" + yield1);
    }
}
