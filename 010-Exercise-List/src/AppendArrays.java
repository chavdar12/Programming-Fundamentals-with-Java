import java.util.ArrayList;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        ArrayList<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] current = input[i].split("\\s+");
            for (String s : current) {
                if (!s.equals("")) {
                    result.add(s);
                }
            }
        }

        System.out.println(String.join(" ", result));
    }
}
