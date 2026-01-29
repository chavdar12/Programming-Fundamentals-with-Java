import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int bestSequenceLength = 0;
        int bestSequenceStartIndex = 0;
        int sequenceIndex = 0;
        while (!input.equals("Clone them!")) {
            sequenceIndex++;
            String[] dnaSequence = input.split("!");
            int currentSequenceSum = 0;
            int currentSequenceLength = 0;
            int currentSequenceStartIndex = 0;
            for (int i = 0; i < dnaSequence.length; i++) {
                int currentNumber = Integer.parseInt(dnaSequence[i]);
                currentSequenceSum += currentNumber;
                if (currentNumber == 1) {
                    currentSequenceLength++;
                    if (currentSequenceLength > bestSequenceLength) {
                        bestSequenceLength = currentSequenceLength;
                        bestSequenceStartIndex = currentSequenceStartIndex;
                        bestSequenceSum = currentSequenceSum;
                        bestSequenceIndex = sequenceIndex;
                    } else if (currentSequenceLength == bestSequenceLength) {
                        if (currentSequenceStartIndex < bestSequenceStartIndex) {
                            bestSequenceStartIndex = currentSequenceStartIndex;
                            bestSequenceSum = currentSequenceSum;
                            bestSequenceIndex = sequenceIndex;
                        } else if (currentSequenceStartIndex == bestSequenceStartIndex) {
                            if (currentSequenceSum > bestSequenceSum) {
                                bestSequenceSum = currentSequenceSum;
                                bestSequenceIndex = sequenceIndex;
                            }
                        }
                    }
                } else {
                    currentSequenceStartIndex = i + 1;
                    currentSequenceLength = 0;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int i = 0; i < dnaLength; i++) {
            System.out.print("1 ");
        }
    }
}