import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysTest {

    @Test
    void condenseArrayToNumber() {
        assertEquals("25", run(CondenseArrayToNumber::main, "2 10 3"));
        assertEquals("35", run(CondenseArrayToNumber::main, "5 0 4 1 2"));
        assertEquals("1", run(CondenseArrayToNumber::main, "1"));
    }

    @Test
    void dayOfWeek() {
        assertEquals("Monday", run(DayOfWeek::main, "1"));
        assertEquals("Invalid day!", run(DayOfWeek::main, "8"));
    }

    @Test
    void equalArrays() {
        assertEquals("Arrays are identical. Sum: 60", run(EqualArrays::main, "10 20 30", "10 20 30"));
        assertEquals("Arrays are not identical. Found difference at 2 index.", run(EqualArrays::main, "1 2 3 4 5", "1 2 4 3 5"));
    }

    @Test
    void evenAndOddSubtraction() {
        assertEquals("3", run(EvenAndOddSubtraction::main, "1 2 3 4 5 6"));
    }

    @Test
    void printNumbersInReverseOrder() {
        assertEquals("30 20 10", run(PrintNumbersInReverseOrder::main, "3", "10", "20", "30"));
    }

    @Test
    void reverseAnArrayOfStrings() {
        assertEquals("e d c b a", run(ReverseAnArrayOfStrings::main, "a b c d e"));
    }

    @Test
    void sumEvenNumbers() {
        assertEquals("12", run(SumEvenNumbers::main, "1 2 3 4 5 6"));
    }
}
