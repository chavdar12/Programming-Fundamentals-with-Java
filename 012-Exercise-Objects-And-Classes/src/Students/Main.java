package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade())).forEach(System.out::println);
    }
}
