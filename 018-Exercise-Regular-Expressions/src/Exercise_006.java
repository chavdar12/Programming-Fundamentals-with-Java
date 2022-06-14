import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[A-Za-z0-9](\\.|-|_|[A-Za-z0-9])+[A-Za-z0-9]@[A-Za-z]+([.\\-])?[A-Za-z]+\\.?\\w+";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
