import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseTextProcessingTest {

    @Test
    void asciiSumator() {
        assertEquals("363", run(AsciiSumator::main, ".", "@", "dsg12gr5653feee5"));
        assertEquals("262", run(AsciiSumator::main, "?", "E", "@ABCEF"));
    }

    @Test
    void caesarCipher() {
        assertEquals("Surjudpplqj#lv#frro$", run(CaesarCipher::main, "Programming is cool!"));
    }

    @Test
    void characterMultiplier() {
        assertEquals("52114", run(CharacterMultiplier::main, "George Peter"));
        assertEquals("7647", run(CharacterMultiplier::main, "123 522"));
        assertEquals("9700", run(CharacterMultiplier::main, "a aaaa"));
    }

    @Test
    void extractFile() {
        assertEquals("File name: Template\nFile extension: pptx", run(ExtractFile::main, "C:\\Internal\\training-internal\\Template.pptx"));
    }

    @Test
    void extractFileWithSeveralDots() {
        assertEquals("File name: template.bak\nFile extension: pptx", run(ExtractFile::main, "C:\\a\\template.bak.pptx"));
    }

    @Test
    void extractPersonInformation() {
        assertEquals("George is 18 years old.\nBilly is 35 years old.", run(ExtractPersonInformation::main,
                "2", "Here is a name @George| and an age #18*", "Another name @Billy| #35* is his age"));
    }

    @Test
    void html() {
        assertEquals("""
                <h1>
                    Title
                </h1>
                <article>
                    Content
                </article>
                <div>
                    first
                </div>
                <div>
                    second
                </div>""", run(HTML::main, "Title", "Content", "first", "second", "end of comments"));
    }

    @Test
    void lettersChangeNumbers() {
        assertEquals("330.00", run(LettersChangeNumbers::main, "A12b s17G"));
        assertEquals("46015.13", run(LettersChangeNumbers::main, "P34562Z q2576f   H456z"));
    }

    @Test
    void morseCodeTranslator() {
        assertEquals("I MADE YOU WRITE A LONG CODE", run(MorseCodeTranslator::main,
                ".. | -- .- -.. . | -.-- --- ..- | .-- .-. .. - . | .- | .-.. --- -. --. | -.-. --- -.. ."));
    }

    @Test
    void morseCodeTranslatorDistinguishesJFromOne() {
        assertEquals("J1", run(MorseCodeTranslator::main, ".--- .----"));
    }

    @Test
    void multiplyBigNumber() {
        assertEquals("3695388955727932769851328408", run(MultiplyBigNumber::main, "923847238931983192462832102", "4"));
        assertEquals("89991", run(MultiplyBigNumber::main, "9999", "9"));
    }

    @Test
    void multiplyBigNumberByZero() {
        assertEquals("0", run(MultiplyBigNumber::main, "123", "0"));
    }

    @Test
    void replaceRepeatingChars() {
        assertEquals("abcdedsa", run(ReplaceRepeatingChars::main, "aaaaabbbbbcdddeeeedssaa"));
    }

    @Test
    void stringExplosion() {
        assertEquals("abv>>>>dasd", run(StringExplosion::main, "abv>1>1>2>2asdasd"));
        assertEquals("pesho>is>a>karate>master", run(StringExplosion::main, "pesho>2sis>1a>2akarate>4hexmaster"));
    }

    @Test
    void treasureFinder() {
        assertEquals("Found gold at 10N70W", run(TreasureFinder::main, "1 2 1 3", "ikegfp'jpne)bv=41P83X@", "find"));
    }

    @Test
    void validUsernames() {
        assertEquals("Jeff\njohn45\npeter-ivanov", run(ValidUsernames::main, "Jeff, john45, ab, cd, peter-ivanov, @smith"));
    }
}
