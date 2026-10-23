import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataTypesTest {

    @Test
    void centuriesToMinutes() {
        assertEquals("1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes", run(CenturiesToMinutes::main, "1"));
    }

    @Test
    void centuriesToMinutesDoesNotOverflow() {
        assertEquals("100 centuries = 10000 years = 3652422 days = 87658128 hours = 5259487680 minutes",
                run(CenturiesToMinutes::main, "100"));
    }

    @Test
    void charsAndNames() {
        assertEquals("abc", run(CharsToString::main, "a", "b", "c"));
        assertEquals("c b a", run(ReversedChars::main, "a", "b", "c"));
        assertEquals("John->Smith", run(ConcatNames::main, "John", "Smith", "->"));
    }

    @Test
    void conversions() {
        assertEquals("1.85", run(ConvertMetersToKilometers::main, "1852"));
        assertEquals("104.800", run(PoundsToDollars::main, "80"));
    }

    @Test
    void exactSumOfRealNumbers() {
        assertEquals("1000000000000000005", run(ExactSumOfRealNumbers::main, "2", "1000000000000000000", "5"));
        assertEquals("0.6", run(ExactSumOfRealNumbers::main, "3", "0.1", "0.2", "0.3"));
    }

    @Test
    void lowerOrUpper() {
        assertEquals("upper-case", run(LowerOrUpper::main, "L"));
        assertEquals("lower-case", run(LowerOrUpper::main, "f"));
    }

    @Test
    void specialNumbers() {
        String expected = """
                1 -> false
                2 -> false
                3 -> false
                4 -> false
                5 -> true
                6 -> false
                7 -> true""";
        assertEquals(expected, run(SpecialNumbers::main, "7"));
        assertEquals(expected, run(RefactorSpecialNumbers::main, "7"));
    }

    @Test
    void volumeOfPyramid() {
        assertEquals("Length: Width: Height: Pyramid Volume: 1.00", run(RefactorVolumeOfPyramid::main, "1", "1", "3"));
    }

    @Test
    void townInfo() {
        assertEquals("Town Sofia has population of 1286383 and area 492 square km.", run(TownInfo::main, "Sofia", "1286383", "492"));
    }
}
