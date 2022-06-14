import Exercise_002.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Article> articles = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];
            Article article = new Article(title, content, author);
            articles.add(article);

        }
        String command = scanner.nextLine();
        printResult(articles, command);
    }

    private static void printResult(ArrayList<Article> articles, String command) {
        switch (command) {
            case "title" -> articles.stream().sorted(Comparator.comparing(Article::getTitle)).forEach(System.out::println);
            case "content" -> articles.stream().sorted(Comparator.comparing(Article::getContent)).forEach(System.out::println);
            case "author" -> articles.stream().sorted(Comparator.comparing(Article::getAuthor)).forEach(System.out::println);
        }
    }

}
