import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {

    @Test
    void calculateRectangleArea() {
        assertEquals("12", run(CalculateRectangleArea::main, "3", "4"));
    }

    @Test
    void calculations() {
        assertEquals("10", run(Calculations::main, "add", "5", "5"));
        assertEquals("4", run(Calculations::main, "divide", "8", "2"));
        assertEquals("-1", run(Calculations::main, "subtract", "4", "5"));
        assertEquals("20", run(Calculations::main, "multiply", "4", "5"));
    }

    @Test
    void grades() {
        assertEquals("Poor", run(Grades::main, "3.33"));
        assertEquals("Excellent", run(Grades::main, "5.5"));
    }

    @Test
    void greaterOfTwoValues() {
        assertEquals("16", run(GreaterOfTwoValues::main, "int", "2", "16"));
        assertEquals("z", run(GreaterOfTwoValues::main, "char", "a", "z"));
        assertEquals("bbb", run(GreaterOfTwoValues::main, "string", "aaa", "bbb"));
    }

    @Test
    void mathOperations() {
        assertEquals("25", run(MathOperations::main, "5", "*", "5"));
        assertEquals("0.5", run(MathOperations::main, "4", "/", "8"));
        assertEquals("-1", run(MathOperations::main, "4", "-", "5"));
    }

    @Test
    void mathPower() {
        assertEquals("256", run(MathPower::main, "2", "8"));
        assertEquals("166.375", run(MathPower::main, "5.5", "3"));
    }

    @Test
    void multiplyEvensByOdds() {
        assertEquals("224", run(MultiplyEvensByOdds::main, "12345654"));
        assertEquals("54", run(MultiplyEvensByOdds::main, "-12345"));
    }

    @Test
    void orders() {
        assertEquals("5.00", run(Orders::main, "water", "5"));
        assertEquals("3.00", run(Orders::main, "coffee", "2"));
    }

    @Test
    void printingTriangle() {
        assertEquals("1\n1 2\n1 2 3\n1 2\n1", run(PrintingTriangle::main, "3"));
    }

    @Test
    void repeatString() {
        assertEquals("abcabcabc", run(RepeatString::main, "abc", "3"));
    }

    @Test
    void signOfInteger() {
        assertEquals("The number 2 is positive.", run(SignOfInteger::main, "2"));
        assertEquals("The number -5 is negative.", run(SignOfInteger::main, "-5"));
        assertEquals("The number 0 is zero.", run(SignOfInteger::main, "0"));
    }
}
