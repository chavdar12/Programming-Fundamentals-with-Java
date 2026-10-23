import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseArraysTest {

    @Test
    void arrayRotation() {
        assertEquals("32 61 21 51 47", run(ArrayRotation::main, "51 47 32 61 21", "2"));
    }

    @Test
    void commonElements() {
        assertEquals("4 hello", run(CommonElements::main, "Hey hello 2 4", "10 hey 4 hello"));
    }

    @Test
    void encryptSortAndPrintArray() {
        assertEquals("1032\n1071\n1168\n1532", run(EncryptSortAndPrintArray::main, "4", "Peter", "Maria", "Katya", "Todor"));
    }

    @Test
    void equalSums() {
        assertEquals("2", run(EqualSums::main, "1 2 3 3"));
        assertEquals("no", run(EqualSums::main, "1 2"));
        assertEquals("0", run(EqualSums::main, "1"));
    }

    @Test
    void kaminoFactoryPrefersLeftmostLongestSequence() {
        assertEquals("Best DNA sample 2 with sum: 2.\n0 1 1 0 0",
                run(KaminoFactory::main, "5", "1!0!1!1!0", "0!1!1!0!0", "Clone them!"));
    }

    @Test
    void kaminoFactoryUsesWholeSampleSum() {
        assertEquals("Best DNA sample 1 with sum: 3.\n1 1 0 1",
                run(KaminoFactory::main, "4", "1!1!0!1", "1!0!0!1", "1!1!0!0", "Clone them!"));
    }

    @Test
    void ladyBugs() {
        assertEquals("0 1 0", run(LadyBugs::main, "3", "0 1", "0 right 1", "2 right 1", "end"));
        assertEquals("0 0 0", run(LadyBugs::main, "3", "0 1 2", "0 right 1", "1 right 1", "2 right 1", "end"));
        assertEquals("1 0 0", run(LadyBugs::main, "3", "2", "2 left 2", "end"));
    }

    @Test
    void ladyBugsWithNegativeFlyLengthLeavesTheField() {
        assertEquals("0 0 0", run(LadyBugs::main, "3", "0", "0 right -1", "end"));
    }

    @Test
    void longestIncreasingSubsequence() {
        assertEquals("3 5 7 8 9 11", run(LongestIncreasingSubsequence::main, "3 14 5 12 15 7 8 9 11 10 1"));
    }

    @Test
    void magicSum() {
        assertEquals("1 7\n6 2", run(MagicSum::main, "1 7 6 2 19 23", "8"));
    }

    @Test
    void maxSequenceOfEqualElements() {
        assertEquals("2 2 2", run(MaxSequenceOfEqualElements::main, "2 1 1 2 3 3 2 2 2 1"));
        assertEquals("1 1 1", run(MaxSequenceOfEqualElements::main, "1 1 1 2 3 1 3 3"));
    }

    @Test
    void pascalTriangle() {
        assertEquals("1\n1 1\n1 2 1\n1 3 3 1", run(PascalTriangle::main, "4"));
    }

    @Test
    void recursiveFibonacci() {
        assertEquals("5", run(RecursiveFibonacci::main, "5"));
        assertEquals("1", run(RecursiveFibonacci::main, "1"));
    }

    @Test
    void topIntegers() {
        assertEquals("4 3 2", run(TopIntegers::main, "1 4 3 2"));
        assertEquals("24 19 17", run(TopIntegers::main, "14 24 3 19 15 17"));
    }

    @Test
    void trainPrintsWagonsAndSum() {
        assertEquals("13 24 8\n45", run(Train::main, "3", "13", "24", "8"));
    }

    @Test
    void zigZagArrays() {
        assertEquals("1 10 31 20\n5 9 81 41", run(ZigZagArrays::main, "4", "1 5", "9 10", "31 81", "41 20"));
    }
}
