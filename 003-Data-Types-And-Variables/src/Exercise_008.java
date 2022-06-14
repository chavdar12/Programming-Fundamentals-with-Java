import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(firstChar)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
