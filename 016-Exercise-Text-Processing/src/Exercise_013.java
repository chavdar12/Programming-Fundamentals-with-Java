import java.util.Scanner;

public class Exercise_013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder article = new StringBuilder();
        String header = "<h1>\n\t" + scanner.nextLine() + "\n</h1>";

        String articleContent = "<article>\n\t" + scanner.nextLine() + "\n</article>";
        article.append(header).append(System.lineSeparator());
        article.append(articleContent).append(System.lineSeparator());
        String line = scanner.nextLine();
        while (!"end of comments".equals(line)) {
            String comment = "<div>\n\t" + line + "\n</div>";
            article.append(comment);
            line = scanner.nextLine();
            if (!"end of comments".equals(line)) {
                article.append(System.lineSeparator());
            }
        }
        System.out.println(article);
    }
}
