import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int count = countOfVowels(input);
        System.out.println(count);
    }

    private static int countOfVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            switch (letter) {
                case 'a', 'u', 'e', 'i', 'o' -> counter++;
            }
        }
        return counter;
    }
}
