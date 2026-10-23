import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(?<=\\s|^)[A-Za-z0-9]+(?:[._-][A-Za-z0-9]+)*@[A-Za-z]+(?:-[A-Za-z]+)*(?:\\.[A-Za-z]+(?:-[A-Za-z]+)*)+";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
