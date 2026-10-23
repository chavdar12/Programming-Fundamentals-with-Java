import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularExpressionsTest {

    @Test
    void matchDates() {
        assertEquals("Day: 13, Month: Jul, Year: 1928\nDay: 10, Month: Nov, Year: 1934\nDay: 25, Month: Dec, Year: 1937",
                run(MatchDates::main, "13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016"));
    }

    @Test
    void matchFullName() {
        assertEquals("Ivan Ivanov Test Testov",
                run(MatchFullName::main, "Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Test Testov, Ivan\tIvanov"));
    }

    @Test
    void matchPhoneNumberJoinsWithoutTrailingSeparator() {
        assertEquals("+359 2 222 2222, +359-2-222-2222", run(MatchPhoneNumber::main,
                "+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222"));
    }
}
