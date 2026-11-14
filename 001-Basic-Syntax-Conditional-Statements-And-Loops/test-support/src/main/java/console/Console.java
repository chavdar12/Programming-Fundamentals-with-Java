package console;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.stream.Collectors;

/** Runs a console program's {@code main} with the given stdin lines and returns what it printed. */
public final class Console {

    @FunctionalInterface
    public interface Program {
        void main(String[] args) throws Exception;
    }

    private Console() {
    }

    /**
     * Output is normalised: line endings become {@code \n}, trailing spaces on each line and
     * trailing blank lines are dropped (the exercises print {@code "1 2 3 "}-style output).
     */
    public static String run(Program program, String... inputLines) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            // Judge output uses '.' as the decimal separator
            Locale.setDefault(Locale.US);
            System.setIn(new ByteArrayInputStream((String.join("\n", inputLines) + "\n").getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));
            program.main(new String[0]);
        } catch (Exception e) {
            throw new AssertionError("Program threw " + e, e);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
            Locale.setDefault(originalLocale);
        }
        return out.toString(StandardCharsets.UTF_8).lines()
                .map(String::stripTrailing)
                .collect(Collectors.joining("\n"))
                .stripTrailing();
    }
}
