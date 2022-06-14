import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        while (!"end".equals(word)) {
            String reversed = reverse(word);

            System.out.println(word + " = " + reversed);

            word = reader.readLine();
        }

    }

    public static String reverse(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
