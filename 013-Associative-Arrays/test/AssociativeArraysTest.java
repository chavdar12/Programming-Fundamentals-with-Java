import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AssociativeArraysTest {

    @Test
    void countRealNumbers() {
        assertEquals("2.5 -> 3\n8 -> 2", run(CountRealNumbers::main, "8 2.5 2.5 8 2.5"));
        assertEquals("1.5 -> 2\n3 -> 1\n5 -> 1", run(CountRealNumbers::main, "1.5 5 1.5 3"));
    }

    @Test
    void oddOccurrences() {
        assertEquals("java, c#, c", run(OddOccurrences::main, "Java C# PHP PHP JAVA C java"));
    }

    @Test
    void wordFilter() {
        assertEquals("kiwi\norange\nbanana", run(WordFilter::main, "kiwi orange banana apple"));
    }

    @Test
    void wordSynonyms() {
        assertEquals("cute - adorable, charming\nsmart - clever",
                run(WordSynonyms::main, "3", "cute", "adorable", "cute", "charming", "smart", "clever"));
    }
}
