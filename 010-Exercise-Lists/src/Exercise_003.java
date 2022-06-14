import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+", 2);
            String name = tokens[0];
            if (tokens[1].equals("is going!")) {
                if (guestList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestList.add(name);
                }
            } else {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        System.out.println(String.join("\n", guestList));
    }
}
