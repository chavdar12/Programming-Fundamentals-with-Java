import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortNumbersWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();
        list.add(Integer.parseInt(scanner.nextLine()));
        list.add(Integer.parseInt(scanner.nextLine()));
        list.add(Integer.parseInt(scanner.nextLine()));

        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        list.forEach(i -> sb.append(i).append(" "));
        System.out.println(sb);
    }
}
