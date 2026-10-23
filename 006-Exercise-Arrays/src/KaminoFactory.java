import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] bestSequence = new int[dnaLength];
        int bestSequenceIndex = 0;
        int bestSequenceSum = -1;
        int bestSequenceLength = 0;
        int bestSequenceStartIndex = Integer.MAX_VALUE;
        int sequenceIndex = 0;

        while (!input.equals("Clone them!")) {
            sequenceIndex++;
            int[] dna = Arrays.stream(input.split("!+")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(dna).sum();

            int longestLength = 0;
            int longestStart = 0;
            int currentLength = 0;
            for (int i = 0; i < dna.length; i++) {
                currentLength = dna[i] == 1 ? currentLength + 1 : 0;
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStart = i - currentLength + 1;
                }
            }

            boolean isBetter = longestLength > bestSequenceLength
                    || (longestLength == bestSequenceLength && longestStart < bestSequenceStartIndex)
                    || (longestLength == bestSequenceLength && longestStart == bestSequenceStartIndex && sum > bestSequenceSum);
            if (isBetter) {
                bestSequence = dna;
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sum;
                bestSequenceLength = longestLength;
                bestSequenceStartIndex = longestStart;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, Math.max(bestSequenceSum, 0));
        for (int gene : bestSequence) {
            System.out.print(gene + " ");
        }
    }
}