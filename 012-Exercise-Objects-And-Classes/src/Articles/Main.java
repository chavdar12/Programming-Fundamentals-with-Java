package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(", ");
        Article article = new Article(tokens[0], tokens[1], tokens[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit" -> article.edit(command[1]);
                case "ChangeAuthor" -> article.changeAuthor(command[1]);
                case "Rename" -> article.rename(command[1]);
            }
        }
        System.out.println(article);
    }
}
