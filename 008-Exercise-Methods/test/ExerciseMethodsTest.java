import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseMethodsTest {

    @Test
    void addAndSubtract() {
        assertEquals("19", run(AddAndSubtract::main, "23", "6", "10"));
    }

    @Test
    void arrayManipulator() {
        assertEquals("""
                2
                No matches
                [5, 7]
                []
                [3, 5, 7, 9, 1]""", run(ArrayManipulator::main, "1 3 5 7 9",
                "exchange 1", "max odd", "min even", "first 2 odd", "last 2 even", "exchange 3", "end"));
    }

    @Test
    void arrayManipulatorFirstReturnsOnlyMatches() {
        assertEquals("[2]\n[1]\n[1, 2, 3]", run(ArrayManipulator::main, "1 2 3", "first 2 even", "first 1 odd", "end"));
        assertEquals("Invalid index\nInvalid count\n[1, 2, 3]", run(ArrayManipulator::main, "1 2 3", "exchange 3", "last 4 odd", "end"));
    }

    @Test
    void centerPoint() {
        assertEquals("(-1, 2)", run(CenterPoint::main, "2", "4", "-1", "2"));
    }

    @Test
    void charactersInRange() {
        assertEquals("b c", run(CharactersInRange::main, "a", "d"));
        assertEquals("b c", run(CharactersInRange::main, "d", "a"));
    }

    @Test
    void dataTypes() {
        assertEquals("10", run(DataTypes::main, "5", "int"));
        assertEquals("3.75", run(DataTypes::main, "2.5", "real"));
        assertEquals("$hello$", run(DataTypes::main, "hello", "string"));
    }

    @Test
    void factorialDivision() {
        assertEquals("60.00", run(FactorialDivision::main, "5", "2"));
        assertEquals("360.00", run(FactorialDivision::main, "6", "2"));
    }

    @Test
    void longerLinePrintsPointCloserToCenterFirst() {
        assertEquals("(4, -3)(-5, -5)", run(LongerLine::main, "2", "4", "-1", "2", "-5", "-5", "4", "-3"));
    }

    @Test
    void longerLinePrefersFirstWhenEqual() {
        assertEquals("(1, 1)(2, 2)", run(LongerLine::main, "2", "2", "1", "1", "5", "5", "6", "6"));
    }

    @Test
    void middleCharacters() {
        assertEquals("r", run(MiddleCharacters::main, "aString"));
        assertEquals("eT", run(MiddleCharacters::main, "someText"));
    }

    @Test
    void multiplicationSign() {
        assertEquals("negative", run(MultiplicationSign::main, "2", "3", "-1"));
        assertEquals("zero", run(MultiplicationSign::main, "2", "3", "0"));
        assertEquals("negative", run(MultiplicationSign::main, "-2", "-3", "-1"));
        assertEquals("positive", run(MultiplicationSign::main, "-1", "-2", "3"));
    }

    @Test
    void nxnMatrix() {
        assertEquals("2 2\n2 2", run(NxNMatrix::main, "2"));
    }

    @Test
    void palindromeIntegers() {
        assertEquals("false\ntrue\nfalse\ntrue", run(PalindromeIntegers::main, "123", "323", "421", "121", "END"));
    }

    @Test
    void passwordValidator() {
        assertEquals("Password must be between 6 and 10 characters\nPassword must have at least 2 digits",
                run(PasswordValidator::main, "logIn"));
        assertEquals("Password is valid", run(PasswordValidator::main, "MyPass123"));
        assertEquals("Password must consist only of letters and digits\nPassword must have at least 2 digits",
                run(PasswordValidator::main, "Pa$s$s"));
    }

    @Test
    void smallestOfThreeNumbers() {
        assertEquals("2", run(SmallestOfThreeNumbers::main, "2", "5", "3"));
    }

    @Test
    void topNumber() {
        assertEquals("17\n35", run(TopNumber::main, "50"));
    }

    @Test
    void tribonacciPrintsFirstNNumbers() {
        assertEquals("1 1 2 4", run(TribonacciSequence::main, "4"));
        assertEquals("1 1 2 4 7 13 24 44", run(TribonacciSequence::main, "8"));
        assertEquals("1", run(TribonacciSequence::main, "1"));
        assertEquals("1 1", run(TribonacciSequence::main, "2"));
    }

    @Test
    void vowelsCountIsCaseInsensitive() {
        assertEquals("3", run(VowelsCount::main, "SoftUni"));
        assertEquals("1", run(VowelsCount::main, "Cats"));
        assertEquals("0", run(VowelsCount::main, "JS"));
    }
}
