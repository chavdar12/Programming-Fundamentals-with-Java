import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
        List<Integer> mergedList = new ArrayList<>();
        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            for (int i = minSize; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
            }
        } else {
            for (int i = minSize; i < secondList.size(); i++) {
                mergedList.add(secondList.get(i));
            }
        }
        for (Integer number : mergedList) {
            System.out.print(number + " ");
        }
    }
}
