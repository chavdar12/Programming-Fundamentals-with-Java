import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        StringBuilder wordWithoutNum = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            if (Character.isDigit(word.charAt(i))) {
                numbers.add(Integer.parseInt(word.charAt(i) + ""));
            } else {
                wordWithoutNum.append(word.charAt(i));
            }

        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }

        int indexForSkip = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < takeList.size(); i++) {
            String sub = wordWithoutNum.substring(indexForSkip,
                                                  Math.min(indexForSkip + takeList.get(i), wordWithoutNum.length()));
            result.append(sub);
            indexForSkip = indexForSkip + skipList.get(i) + takeList.get(i);
        }
        System.out.println(result);
    }
}