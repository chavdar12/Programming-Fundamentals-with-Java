import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectsAndClassesTest {

    @Test
    void bigFactorial() {
        assertEquals("120", run(BigFactorial::main, "5"));
        assertEquals("30414093201713378043612608166064768844377641568960512000000000000", run(BigFactorial::main, "50"));
    }

    @Test
    void randomizeWordsKeepsAllWords() {
        String[] words = run(RandomizeWords::main, "Welcome to SoftUni and have fun learning programming").split(" ");
        Arrays.sort(words);
        assertArrayEquals(new String[]{"SoftUni", "Welcome", "and", "fun", "have", "learning", "programming", "to"}, words);
    }

    @Test
    void songs() {
        String[] input = {"3", "favourite_DownTown_3:14", "listenLater_Kiss_4:16", "favourite_Smooth Criminal_4:01"};
        assertEquals("DownTown\nSmooth Criminal", run(Songs.Main::main, concat(input, "favourite")));
        assertEquals("DownTown\nKiss\nSmooth Criminal", run(Songs.Main::main, concat(input, "all")));
    }

    @Test
    void students() {
        assertEquals("John Smith is 15 years old\nLinda Bridge is 16 years old", run(Students.Main::main,
                "John Smith 15 Sofia", "Peter Ivanov 14 Plovdiv", "Linda Bridge 16 Sofia", "Simon Stone 12 Varna", "end", "Sofia"));
    }

    @Test
    void studentsTwoOverwritesExistingStudentInPlace() {
        assertEquals("John Smith is 16 years old\nLinda Bridge is 17 years old", run(StudentsTwo::main,
                "John Smith 15 Sofia", "Linda Bridge 17 Sofia", "John Smith 16 Sofia", "Simon Stone 12 Varna", "end", "Sofia"));
    }

    @Test
    void sumBigNumbers() {
        assertEquals("1000000000000000000000000000000", run(SumBigNumbers::main, "923847238931983192462832102", "999076152761068016807537167898"));
    }

    private static String[] concat(String[] lines, String last) {
        String[] result = Arrays.copyOf(lines, lines.length + 1);
        result[lines.length] = last;
        return result;
    }
}
