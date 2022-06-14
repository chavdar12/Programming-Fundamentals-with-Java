import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\|");
        String regex = "(#[A-Z]+#)|(\\$[A-Z]+\\$)|(%[A-Z]+%)|(\\*[A-Z]+\\*)|(&[A-Z]+&)";
        Pattern pattern = Pattern.compile(regex);

        String firstPart = tokens[0];
        String firstWord = "";
        Matcher matcher = pattern.matcher(firstPart);
        if (matcher.find()) {
            firstWord = matcher.group().substring(1, matcher.group().length() - 1);
        }

        String secondPart = tokens[1];
        LinkedList<String> secondPartList = new LinkedList<>();
        regex = "\\d{2}:\\d{2}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(secondPart);

        while (matcher.find()) {
            secondPartList.add(matcher.group());
        }

        Map<String, Integer> result = new HashMap<>();
        for (String partTwo : secondPartList) {
            int numberLength = 0;
            String[] numberSplit = partTwo.split(":");

            int asciiCode = Integer.parseInt(numberSplit[0]);
            char letter = (char) asciiCode;
            String wordLength = numberSplit[1];
            if (wordLength.charAt(0) == '0') {
                numberLength = Integer.parseInt(wordLength.charAt(1) + "");
            } else {
                if (wordLength.length() <= 20) {
                    numberLength = Integer.parseInt(wordLength);
                }
            }

            if (firstWord.contains(letter + "")) {
                result.put(letter + "", numberLength);
            }

        }
        String[] thirdPart = tokens[2].split("\\s+");
        for (String word : thirdPart) {
            char firstLetter = word.charAt(0);
            for (Map.Entry<String, Integer> item : result.entrySet()) {
                if (word.length() == item.getValue() + 1 && firstLetter == item.getKey().charAt(0)) {
                    System.out.println(word);
                }
            }
        }
    }
}
