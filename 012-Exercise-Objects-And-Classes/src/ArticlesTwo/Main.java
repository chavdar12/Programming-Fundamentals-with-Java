package ArticlesTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            Article article = new Article(tokens[0], tokens[1], tokens[2]);
            String command = scanner.nextLine();
            switch (command) {
                case "title" -> System.out.println(article.getTitle());
                case "content" -> System.out.println(article.getContent());
                case "author" -> System.out.println(article.getAuthor());
            }
        }
    }
}
