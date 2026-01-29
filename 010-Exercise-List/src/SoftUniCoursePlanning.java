import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];

            switch (command) {
                case "Add" -> {
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(lessonTitle);
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(tokens[2]);
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(index, lessonTitle);
                    }
                }
                case "Remove" -> {
                    lessons.remove(lessonTitle);
                }
                case "Swap" -> {
                    String secondLessonTitle = tokens[2];
                    int firstLessonIndex = lessons.indexOf(lessonTitle);
                    int secondLessonIndex = lessons.indexOf(secondLessonTitle);
                    if (lessons.contains(lessonTitle) && lessons.contains(secondLessonTitle)) {
                        lessons.set(firstLessonIndex, secondLessonTitle);
                        lessons.set(secondLessonIndex, lessonTitle);
                        if (lessons.contains(lessonTitle + "-Exercise")) {
                            lessons.remove(lessonTitle + "-Exercise");
                            lessons.add(secondLessonIndex + 1, lessonTitle + "-Exercise");
                        }
                        if (lessons.contains(secondLessonTitle + "-Exercise")) {
                            lessons.remove(secondLessonTitle + "-Exercise");
                            lessons.add(firstLessonIndex + 1, secondLessonTitle + "-Exercise");
                        }
                    }
                }
                case "Exercise" -> {
                    if (lessons.contains(lessonTitle) && !lessons.contains(lessonTitle + "-Exercise")) {
                        int lessonIndex = lessons.indexOf(lessonTitle);
                        lessons.add(lessonIndex + 1, lessonTitle + "-Exercise");
                    } else if (!lessons.contains(lessonTitle)) {
                        lessons.add(lessonTitle);
                        lessons.add(lessonTitle + "-Exercise");
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessons.get(i));
        }
    }
}