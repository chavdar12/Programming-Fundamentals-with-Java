package Exercise_002;

import Exercise_002.Article;

import java.util.Scanner;

public class ArticleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            input = scanner.nextLine().split(": ");
            String command = input[0];
            switch (command) {
                case "Edit" -> article.edit(input[1]);
                case "ChangeAuthor" -> article.changeAuthor(input[1]);
                case "Rename" -> article.rename(input[1]);
            }

        }
        System.out.println(article);
    }
}
