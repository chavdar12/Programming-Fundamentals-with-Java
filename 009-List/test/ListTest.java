import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

    @Test
    void gaussTrick() {
        assertEquals("6 6 3", run(GaussTrick::main, "1 2 3 4 5"));
        assertEquals("5 5", run(GaussTrick::main, "1 2 3 4"));
    }

    @Test
    void listManipulationAdvanced() {
        assertEquals("""
                No such number
                Yes
                2 876 342
                13 43 23 543
                1842
                43 876 342 543
                2 13 43 23""", run(ListManipulationAdvanced::main, "2 13 43 876 342 23 543",
                "Contains 100", "Contains 543", "Print even", "Print odd", "Get sum", "Filter >= 43", "Filter < 100", "end"));
    }

    @Test
    void listManipulationBasics() {
        assertEquals("4 53 6 8 43 3", run(ListManipulationBasics::main, "4 19 2 53 6 43",
                "Add 3", "Remove 2", "RemoveAt 1", "Insert 8 3", "end"));
    }

    @Test
    void mergingLists() {
        assertEquals("3 76 5 5 2 34 43 2 12 4 3 12 54 10 23",
                run(MergingLists::main, "3 5 2 43 12 3 54 10 23", "76 5 34 2 4 12"));
    }

    @Test
    void removeNegativesAndReverse() {
        assertEquals("50 9 7 10", run(RemoveNegativesAndReverse::main, "10 -5 7 9 -33 50"));
        assertEquals("empty", run(RemoveNegativesAndReverse::main, "-1 -2"));
    }

    @Test
    void sumAdjacentEqualNumbers() {
        assertEquals("12 1", run(SumAdjacentEqualNumbers::main, "3 3 6 1"));
        assertEquals("16 8 16", run(SumAdjacentEqualNumbers::main, "8 2 2 4 8 16"));
        assertEquals("5 8 4", run(SumAdjacentEqualNumbers::main, "5 4 2 1 1 4"));
    }
}
