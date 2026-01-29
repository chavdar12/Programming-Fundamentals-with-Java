import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            String sequence = scanner.nextLine();
            int len = sequence.length();
            int sum = 0;
            for (int j = 0; j < sequence.length(); j++) {
                char currentChar = sequence.charAt(j);
                if (isVowel(currentChar)) {
                    sum += currentChar * len;
                } else {
                    sum += currentChar / len;
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int element : numbers) {
            System.out.println(element);
        }
    }

    private static boolean isVowel(char currentChar) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(currentChar + "");
    }
}