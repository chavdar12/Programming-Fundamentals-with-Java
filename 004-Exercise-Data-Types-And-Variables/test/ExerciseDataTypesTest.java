import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseDataTypesTest {

    @Test
    void balancedBrackets() {
        assertEquals("BALANCED", run(BalancedBrackets::main, "8", "(", "5 + 10", ")", "* 2 +", "(", "5", ")", "-12"));
        assertEquals("UNBALANCED", run(BalancedBrackets::main, "6", "12 *", ")", "10 + 2 -", "(", "5 + 10", ")"));
    }

    @Test
    void balancedBracketsRejectsNestedOpenAndUnclosed() {
        assertEquals("UNBALANCED", run(BalancedBrackets::main, "4", "(", "(", ")", ")"));
        assertEquals("UNBALANCED", run(BalancedBrackets::main, "1", "("));
    }

    @Test
    void beerKegs() {
        assertEquals("Keg 2", run(BeerKegs::main, "3", "Keg 1", "10", "10", "Keg 2", "20", "20", "Keg 3", "10", "30"));
    }

    @Test
    void dataTypeFinder() {
        assertEquals("""
                5 is integer type
                2.5 is floating point type
                true is boolean type
                a is character type
                hello is string type""", run(DataTypeFinder::main, "5", "2.5", "true", "a", "hello", "END"));
    }

    @Test
    void decryptingMessages() {
        assertEquals("SoftUni", run(DecryptingMessages::main, "3", "7", "P", "l", "c", "q", "R", "k", "f"));
    }

    @Test
    void elevator() {
        assertEquals("6", run(Elevator::main, "17", "3"));
        assertEquals("1", run(Elevator::main, "4", "12"));
    }

    @Test
    void floatingEquality() {
        assertEquals("true", run(FloatingEquality::main, "5.3", "5.3000001"));
        assertEquals("false", run(FloatingEquality::main, "5.3", "5.30001"));
    }

    @Test
    void fromLeftToTheRight() {
        assertEquals("2\n9", run(FromLeftToTheRight::main, "2", "1000 2000", "9 1"));
    }

    @Test
    void fromLeftToTheRightHandlesNegatives() {
        assertEquals("6", run(FromLeftToTheRight::main, "1", "-123 -456"));
    }

    @Test
    void integerOperations() {
        assertEquals("30", run(IntegerOperations::main, "10", "20", "3", "3"));
    }

    @Test
    void pokeMon() {
        assertEquals("1\n2", run(PokeMon::main, "5", "2", "3"));
        assertEquals("2\n1", run(PokeMon::main, "10", "5", "2"));
    }

    @Test
    void pokeMonOnlyExhaustsAtExactlyHalf() {
        // 7 -> 5 -> 3 -> 1: 3 is not exactly half of 7, so no exhaustion
        assertEquals("1\n3", run(PokeMon::main, "7", "2", "2"));
    }

    @Test
    void printPartOfTheAsciiTable() {
        assertEquals("a b c d", run(PrintPartOfTheASCIITable::main, "a", "d"));
    }

    @Test
    void primeChecker() {
        assertEquals("2 -> true\n3 -> true\n4 -> false\n5 -> true", run(RefactoringPrimeChecker::main, "5"));
    }

    @Test
    void snowballs() {
        assertEquals("10 : 2 = 125 (3)", run(Snowballs::main, "2", "10", "2", "3", "5", "5", "5"));
    }

    @Test
    void snowballsUseRealDivision() {
        // 5 / 2 = 2.5, 2.5^2 = 6.25 beats 4 / 2 = 2, 2^2 = 4
        assertEquals("5 : 2 = 6 (2)", run(Snowballs::main, "2", "4", "2", "2", "5", "2", "2"));
    }

    @Test
    void spiceMustFlow() {
        assertEquals("2\n134", run(SpiceMustFlow::main, "111"));
        assertEquals("0\n0", run(SpiceMustFlow::main, "50"));
    }

    @Test
    void sums() {
        assertEquals("15", run(SumDigits::main, "12345"));
        assertEquals("The sum equals: 399", run(SumOfChars::main, "5", "A", "b", "C", "d", "E"));
    }

    @Test
    void triplesOfLatinLetters() {
        assertEquals("aaa\naab\naba\nabb\nbaa\nbab\nbba\nbbb", run(TriplesOfLatinLetters::main, "2"));
    }

    @Test
    void waterOverflow() {
        assertEquals("Insufficient capacity!\n240", run(WaterOverflow::main, "5", "20", "100", "100", "100", "20"));
    }
}
