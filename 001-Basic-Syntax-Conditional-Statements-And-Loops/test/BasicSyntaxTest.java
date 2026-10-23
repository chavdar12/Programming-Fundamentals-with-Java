import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BasicSyntaxTest {

    @Test
    void backInThirtyMinutesWrapsPastMidnight() {
        assertEquals("1:16", run(BackInThirtyMinutes::main, "0", "46"));
        assertEquals("0:29", run(BackInThirtyMinutes::main, "23", "59"));
        assertEquals("11:08", run(BackInThirtyMinutes::main, "10", "38"));
    }

    @Test
    void dividableByThree() {
        String output = run(DividableByThree::main);
        assertTrue(output.startsWith("3\n6\n9"));
        assertTrue(output.endsWith("99"));
    }

    @Test
    void evenNumberRepeatsUntilEven() {
        assertEquals("Please write an even number.\nPlease write an even number.\nThe number is: 4",
                run(EvenNumber::main, "1", "3", "-4"));
    }

    @Test
    void foreignLanguages() {
        assertEquals("English", run(ForeignLanguages::main, "USA"));
        assertEquals("Spanish", run(ForeignLanguages::main, "Mexico"));
        assertEquals("unknown", run(ForeignLanguages::main, "Germany"));
    }

    @Test
    void monthPrinter() {
        assertEquals("February", run(MonthPrinter::main, "2"));
        assertEquals("Error!", run(MonthPrinter::main, "13"));
    }

    @Test
    void multiplicationTables() {
        assertTrue(run(MultiplicationTable::main, "5").endsWith("5 X 10 = 50"));
        assertEquals("5 X 9 = 45\n5 X 10 = 50", run(MultiplicationTableTwo::main, "5", "9"));
        assertEquals("2 X 14 = 28", run(MultiplicationTableTwo::main, "2", "14"));
    }

    @Test
    void passedOrFailed() {
        assertEquals("Passed!", run(Passed::main, "5.32"));
        assertEquals("", run(Passed::main, "2.34"));
        assertEquals("Failed!", run(PassedOrFaled::main, "2.99"));
    }

    @Test
    void sumOfOddNumbers() {
        assertEquals("1\n3\n5\nSum: 9", run(RefactorSumOfOddNumbers::main, "3"));
    }

    @Test
    void studentInformation() {
        assertEquals("Name: John, Age: 15, Grade: 5.40", run(StudentInformation::main, "John", "15", "5.40"));
    }

    @Test
    void theatrePromotions() {
        assertEquals("18$", run(TheatrePromotions::main, "Weekday", "42"));
        assertEquals("15$", run(TheatrePromotions::main, "Weekend", "122"));
        assertEquals("Error!", run(TheatrePromotions::main, "Holiday", "-12"));
    }
}
