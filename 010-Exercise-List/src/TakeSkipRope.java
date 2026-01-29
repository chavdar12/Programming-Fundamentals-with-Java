import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder nonNumbers = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                numbers.append(input.charAt(i));
            } else {
                nonNumbers.append(input.charAt(i));
            }
        }
        int[] take = new int[numbers.length() / 2];
        int[] skip = new int[numbers.length() / 2];
        for (int i = 0; i < numbers.length(); i++) {
            if (i % 2 == 0) {
                take[i / 2] = numbers.charAt(i) - '0';
            } else {
                skip[i / 2] = numbers.charAt(i) - '0';
            }
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < take.length; i++) {
            int takeCount = take[i];
            int skipCount = skip[i];
            if (takeCount + index > nonNumbers.length()) {
                takeCount = nonNumbers.length() - index;
            }
            result.append(nonNumbers.substring(index, index + takeCount));
            index += takeCount + skipCount;
        }
        System.out.println(result);
    }
}
