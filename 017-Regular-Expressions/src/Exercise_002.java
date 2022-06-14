import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            if (matcher.hitEnd()) {
                System.out.print(matcher.group());
            } else {
                System.out.print(matcher.group() + ", ");
            }
        }
    }
}
