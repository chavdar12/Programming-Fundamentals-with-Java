import java.util.Scanner;

public class Exercise_016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println(reversed);
    }
}
