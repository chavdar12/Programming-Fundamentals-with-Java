import java.util.Arrays;
import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
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

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }
}