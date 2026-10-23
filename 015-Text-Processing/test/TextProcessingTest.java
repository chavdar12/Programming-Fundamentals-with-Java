import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextProcessingTest {

    @Test
    void digitsLettersAndOther() {
        assertEquals("53453\nAgdDfgF\n#^&", run(DigitsLettersAndOther::main, "Agd#53Dfg^&4F53"));
    }

    @Test
    void repeatStrings() {
        assertEquals("hihiabcabcabcaddaddadd", run(RepeatStrings::main, "hi abc add"));
    }

    @Test
    void reverseStrings() {
        assertEquals("helLo = oLleh\nSoftuni = inutfoS", run(ReverseStrings::main, "helLo", "Softuni", "end"));
    }

    @Test
    void substring() {
        assertEquals("kgb", run(Substring::main, "ice", "kicegiciceeb"));
    }

    @Test
    void textFilter() {
        assertEquals("It is not *****, it is GNU/*****. ******* client",
                run(TextFilter::main, "Linux, Windows", "It is not Linux, it is GNU/Linux. Windows client"));
    }
}
